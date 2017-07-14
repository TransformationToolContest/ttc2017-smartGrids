package rgse.ttc17.emoflon.tgg.task1.csp.constraints;

import org.moflon.tgg.csp.constraints.*;
import org.moflon.tgg.language.csp.Variable;
import org.moflon.tgg.language.csp.impl.TGGConstraintImpl;

public class CastBooleanToInteger extends TGGConstraintImpl {
	public void solve(Variable var_0, Variable var_1){
    	String bindingStates = getBindingStates(var_0, var_1);
    	
		Boolean value0 = (Boolean) var_0.getValue();
    	
    	switch(bindingStates){
    	case "BF":
			if(value0){
    			var_1.setValue(new Integer(1));
    		}
    		else{
    			var_1.setValue(new Integer(0));
    		}
			setSatisfied(true);
			break;
    	case "BB":
			int intValue = ((Integer) var_1.getValue()).intValue();
    		if(value0){
				setSatisfied(intValue == 1);
    		}
    		else{
				setSatisfied(intValue == 0);
    		}
    		break;
    	default: 
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	}
    	
  	}	  
}