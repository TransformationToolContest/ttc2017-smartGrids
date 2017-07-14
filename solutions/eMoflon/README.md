# rgse.ttc17.emoflon.tgg

A solution for the [Outage System Case](https://github.com/georghinkel/ttc2017smartGrids) in the [Transformation Tool Contest 2017](http://www.transformation-tool-contest.eu/). Solution authors: Research Group Software Engineering (University of Koblenz-Landau)

For information regarding the SHARE image, see the [SHARE readme](SHARE.md).


## How to use this repository? ##

### Run our solution ###

Prerequisites

 * [Java 8 SDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) 
 * [Eclipse Modeling Tools, Neon 3](https://www.eclipse.org/downloads/packages/eclipse-modeling-tools/neon3) 
 * In Eclipse, install the eMoflon plugin.
    * *Do Help -> Install New Software...*
    * Under *Work with...* enter the eMoflon 2.30.0 update site - http://emoflon.github.io/eclipse-plugin/emoflon_2.30.0/updatesite
    * Install all items from the main (non-experimental) category
    * After the installation, restart Eclipse.
 * To view the graphical visualization of the rules, Graphviz must be installed on your system: [Windows download site](http://www.graphviz.org/Download_windows.php). 
* Use the Git perspective to duplicate this repository to your local system, and to import the contained projects into your Eclipse workspace. 



### View and edit the transformation rules ###

The transformation rules can be found in the following directories:
  * Task 1: Project *rgse.ttc17.emoflon.tgg.task1* ->  directory *src/rgse.ttc17.emoflon.tgg.task1.org.moflon.tgg.mosl.rules*
  * Task 2: Project *rgse.ttc17.emoflon.tgg.task2* -> directory *src/rgse.ttc17.emoflon.tgg.task2.org.moflon.tgg.mosl.rules*

To open the visualization of a specific rule, open this rule in the editor and then open the PlantUML view. In the eMoflon perspective, the PlantUML view is found on the right and top of the screen. Alternatively, do *Window -> Show View -> Other -> type "PlantUML"*.
  

