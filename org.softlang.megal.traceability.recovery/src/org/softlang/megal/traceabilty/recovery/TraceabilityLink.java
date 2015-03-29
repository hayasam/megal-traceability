package org.softlang.megal.traceabilty.recovery;

/**
 * 
 * @author maxmeffert
 *
 */
public class TraceabilityLink {

	private TraceabilityLinkTarget leftTarget;
	private TraceabilityLinkTarget rightTarget;
	
	public TraceabilityLink (TraceabilityLinkTarget leftTarget, TraceabilityLinkTarget rightTarget) {
		
		this.leftTarget = leftTarget;
		this.rightTarget = rightTarget;
		
	}

	public TraceabilityLinkTarget getLeftTarget() {
		return leftTarget;
	}

	public TraceabilityLinkTarget getRightTarget() {
		return rightTarget;
	}

	public String toString () {
		
		return "( " + leftTarget + " , " + rightTarget + " )";
		
	}
	
	
	
}
