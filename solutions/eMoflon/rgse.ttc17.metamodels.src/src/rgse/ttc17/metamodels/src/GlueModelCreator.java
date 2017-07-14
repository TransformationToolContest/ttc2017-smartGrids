package rgse.ttc17.metamodels.src;

import java.util.HashSet;
import java.util.Hashtable;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import gluemodel.GluemodelFactory;
import gluemodel.MeterAssetMMXUPair;
import gluemodel.MeterAssetPhysicalDevicePair;
import gluemodel.Root;
import gluemodel.CIM.CIMRoot;
import gluemodel.CIM.IEC61968.Metering.MeterAsset;
import gluemodel.COSEM.COSEMRoot;
import gluemodel.COSEM.PhysicalDevice;
import gluemodel.substationStandard.Substandard;
import gluemodel.substationStandard.Dataclasses.AnalogueValue;
import gluemodel.substationStandard.Dataclasses.CMV;
import gluemodel.substationStandard.Dataclasses.Vector;
import gluemodel.substationStandard.Dataclasses.WYE;
import gluemodel.substationStandard.LNNodes.LNGroupM.MMXU;

public class GlueModelCreator {

	public static Root createGlueModel(CIMRoot cim, Substandard substandard, COSEMRoot cosem) {
		Resource cimResource = cim.eResource();
		Resource cosemResource = cosem.eResource();

		ResourceSet rs = cimResource.getResourceSet();
		if (rs != cosemResource.getResourceSet()) {
			throw new RuntimeException("Different ResourceSets");
		}

		Resource fwdResource = rs.createResource(URI.createURI("fwd.src.xmi"));

		Root root = GluemodelFactory.eINSTANCE.createRoot();
		root.setCim(cim);
		root.setCosem(cosem);

		Hashtable<String, MeterAsset> allMeterAssets = getAllMeterAssets(cimResource);
		root.getAssets().addAll(allMeterAssets.values());


		cosem(cosemResource, root, allMeterAssets);

		if (substandard != null) {
			root.setSubstandard(substandard);
			substandard(substandard.eResource(), root, allMeterAssets);
		}

		fwdResource.getContents().add(root);
		return root;
	}

	public static void substandard(Resource substandardResource, Root root,
			Hashtable<String, MeterAsset> allMeterAssets) {
		HashSet<MMXU> mmxus = new HashSet<>();
		HashSet<MeterAssetMMXUPair> mmxuPairs = new HashSet<>();
		TreeIterator<EObject> substandardIterator = substandardResource.getAllContents();
		while (substandardIterator.hasNext()) {
			EObject eOb = substandardIterator.next();
			if (eOb instanceof MMXU) {
				MMXU mmxu = (MMXU) eOb;
				mmxus.add(mmxu);
				String idNs = mmxu.getNamePlt().getIdNs();
				if (allMeterAssets.containsKey(idNs)) {
					MeterAssetMMXUPair pair = GluemodelFactory.eINSTANCE.createMeterAssetMMXUPair();
					pair.setB(mmxu);
					pair.setA(allMeterAssets.get(idNs));

					WYE phv = mmxu.getPhV();
					if (phv != null) {
						CMV phsA = phv.getPhsA();
						if (phsA != null) {
							Vector cValA = phsA.getCVal();
							if (cValA != null) {
								AnalogueValue mag = cValA.getMag();
								if (mag != null) {
									pair.setAMag(mag.getF());
								}
								AnalogueValue ang = cValA.getAng();
								if (ang != null) {
									pair.setAAng(ang.getF());
								}
							}
						}
						CMV phsB = phv.getPhsB();
						if (phsB != null) {
							Vector cValB = phsB.getCVal();
							if (cValB != null) {
								AnalogueValue mag = cValB.getMag();
								if (mag != null) {
									pair.setBMag(mag.getF());
								}
								AnalogueValue ang = cValB.getAng();
								if (ang != null) {
									pair.setBAng(ang.getF());
								}
							}
						}
						CMV phsC = phv.getPhsC();
						if (phsC != null) {
							Vector cValC = phsC.getCVal();
							if (cValC != null) {
								AnalogueValue mag = cValC.getMag();
								if (mag != null) {
									pair.setCMag(mag.getF());
								}
								AnalogueValue ang = cValC.getAng();
								if (ang != null) {
									pair.setCAng(ang.getF());
								}
							}
						}
						CMV neut = phv.getNeut();
						if (neut != null) {
							Vector cValNeut = neut.getCVal();
							if (cValNeut != null) {
								AnalogueValue mag = cValNeut.getMag();
								if (mag != null) {
									pair.setNeutMag(mag.getF());
								}
								AnalogueValue ang = cValNeut.getAng();
								if (ang != null) {
									pair.setNeutAng(ang.getF());
								}
							}
						}
						CMV net = phv.getNet();
						if (net != null) {
							Vector cValNet = net.getCVal();
							if (cValNet != null) {
								AnalogueValue mag = cValNet.getMag();
								if (mag != null) {
									pair.setNetMag(mag.getF());
								}
								AnalogueValue ang = cValNet.getAng();
								if (ang != null) {
									pair.setNetAng(ang.getF());
								}
							}
						}
						CMV res = phv.getRes();
						if (res != null) {
							Vector cValRes = res.getCVal();
							if (cValRes != null) {
								AnalogueValue mag = cValRes.getMag();
								if (mag != null) {
									pair.setResMag(mag.getF());
								}
								AnalogueValue ang = cValRes.getAng();
								if (ang != null) {
									pair.setResAng(ang.getF());
								}
							}
						}
					}

					mmxuPairs.add(pair);
				}
			}
		}

		root.getMmxus().addAll(getAllMMXU(substandardResource));
		root.getMeterAssetToMXXU().addAll(mmxuPairs);
	}

	public static void cosem(Resource cosemResource, Root root, Hashtable<String, MeterAsset> allMeterAssets) {
		HashSet<PhysicalDevice> devices = new HashSet<>();
		HashSet<MeterAssetPhysicalDevicePair> devicePairs = new HashSet<>();
		TreeIterator<EObject> cosemIterator = cosemResource.getAllContents();
		while (cosemIterator.hasNext()) {
			EObject eOb = cosemIterator.next();
			if (eOb instanceof PhysicalDevice) {
				PhysicalDevice device = (PhysicalDevice) eOb;
				devices.add(device);
				String idNs = device.getID();
				if (allMeterAssets.containsKey(idNs)) {
					MeterAssetPhysicalDevicePair pair = GluemodelFactory.eINSTANCE
							.createMeterAssetPhysicalDevicePair();
					pair.setB(device);
					pair.setA(allMeterAssets.get(idNs));
					devicePairs.add(pair);
				}
			}
		}

		root.getMeterAssetToPhysicalDevice().addAll(devicePairs);
	}

	private static HashSet<MMXU> getAllMMXU(Resource resource) {
		HashSet<MMXU> mmxus = new HashSet<MMXU>();
		TreeIterator<EObject> iterator = resource.getAllContents();
		while (iterator.hasNext()) {
			EObject eOb = iterator.next();
			if (eOb instanceof MMXU) {
				MMXU asset = (MMXU) eOb;
				mmxus.add(asset);
			}
		}
		return mmxus;
	}

	private static Hashtable<String, MeterAsset> getAllMeterAssets(Resource resource) {
		Hashtable<String, MeterAsset> assets = new Hashtable<>();
		TreeIterator<EObject> iterator = resource.getAllContents();
		while (iterator.hasNext()) {
			EObject eOb = iterator.next();
			if (eOb instanceof MeterAsset) {
				MeterAsset asset = (MeterAsset) eOb;
				assets.put(asset.getMRID(), asset);
			}
		}
		return assets;
	}
}