package org.softlang.megal.traceabilty.recovery;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.resource.Resource;
import org.softlang.megal.Entity;
import org.softlang.megal.Link;
import org.softlang.megal.Links;
import org.softlang.megal.Megamodel;
import org.softlang.megal.Relationship;

import com.google.common.collect.FluentIterable;

/**
 * 
 * @author maxmeffert
 *
 */
public class TraceabilityLinks {

	static public List<TraceabilityLink> allDeclaredTraceabilityLinks (Relationship r) {
		
		List<TraceabilityLink> result = new ArrayList<TraceabilityLink>();
		
		Entity left = r.getLeft();
		Entity right = r.getRight();
		
		Iterable<Link> leftBindings = Links.allBindings(r.megamodel(), left);
		Iterable<Link> rightBindings = Links.allBindings(r.megamodel(), right);
		
		for (Link leftLink : leftBindings) {
			
			for (Link rightLink : rightBindings) {
				
				TraceabilityLinkTarget leftTarget = new TraceabilityLinkTarget(left, leftLink.getTo());
				TraceabilityLinkTarget rightTarget = new TraceabilityLinkTarget(right, rightLink.getTo());
				
				result.add(new TraceabilityLink(leftTarget, rightTarget));
				
			}
			
		}
		
		return result;
		
	}
	
	static public List<TraceabilityLink> allDeclaredTraceabilityLinks (Megamodel m) {
		
		List<TraceabilityLink> result = new ArrayList<TraceabilityLink>();
		
		for (Relationship r : FluentIterable.from(m.getDeclarations()).filter(Relationship.class)) {
			
			result.addAll(allDeclaredTraceabilityLinks(r));
			
		}
		
		return result;
		
	}
	
	static public List<TraceabilityLink> allDeclaredTraceabilityLinks (Resource r) {
		
		List<TraceabilityLink> result = new ArrayList<TraceabilityLink>();
		
		for (Megamodel m : FluentIterable.from(r.getContents()).filter(Megamodel.class)) {
			
			result.addAll(allDeclaredTraceabilityLinks(m));
			
		}
		
		return result;
		
	}
	
}
