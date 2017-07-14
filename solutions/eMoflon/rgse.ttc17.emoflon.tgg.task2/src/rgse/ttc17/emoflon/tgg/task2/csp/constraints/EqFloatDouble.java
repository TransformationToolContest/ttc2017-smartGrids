package rgse.ttc17.emoflon.tgg.task2.csp.constraints;

import org.moflon.tgg.csp.constraints.*;
import org.moflon.tgg.language.csp.Variable;
import org.moflon.tgg.language.csp.impl.TGGConstraintImpl;

public class EqFloatDouble extends TGGConstraintImpl {
	public void solve(Variable var_0, Variable var_1){
    	String bindingStates = getBindingStates(var_0, var_1);
    	float fValue = (float) var_0.getValue();
    	switch(bindingStates){
    	case "BB":
    		double dValue = (double) var_1.getValue();
    		setSatisfied(Math.abs(dValue-fValue)<=Float.MIN_VALUE);
    		break;
    	case "BF":
    		var_1.setValue(Double.valueOf(fValue));
    		setSatisfied(true);
    		break;
    	default: 
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	}
    	
  	}	  
}