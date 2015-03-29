package org.softlang.megal.traceabilty.recovery;

import org.softlang.megal.Relationship;

/**
 * 
 * @author maxmeffert
 *
 */
public class TraceabilityLink {

	private Relationship relationship;
	private TraceabilityLinkTarget leftTarget;
	private TraceabilityLinkTarget rightTarget;
	
	public TraceabilityLink (Relationship relationship, TraceabilityLinkTarget leftTarget, TraceabilityLinkTarget rightTarget) {
		
		this.relationship = relationship;
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
		
		return relationship.getType().getName() + "('" + leftTarget + "','" + rightTarget + "')";
		
	}
	
	
	
}
