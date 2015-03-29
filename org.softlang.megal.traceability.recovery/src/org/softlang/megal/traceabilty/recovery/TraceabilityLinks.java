package org.softlang.megal.traceabilty.recovery;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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

	/**
	 * Searches a given MegaL Relationship for all declared traceability links, that is defined entities with bound artifacts.
	 * 
	 * @param r
	 * @return
	 */
	static public List<TraceabilityLink> allDeclaredLinks (Relationship r) {
		
		List<TraceabilityLink> result = new ArrayList<TraceabilityLink>();
		
		Entity left = r.getLeft();
		Entity right = r.getRight();
		
		Iterable<Link> leftBindings = Links.allBindings(r.megamodel(), left);
		Iterable<Link> rightBindings = Links.allBindings(r.megamodel(), right);
		
		for (Link leftLink : leftBindings) {
			
			for (Link rightLink : rightBindings) {
				
				TraceabilityLinkTarget leftTarget = new TraceabilityLinkTarget(left, leftLink.getTo());
				TraceabilityLinkTarget rightTarget = new TraceabilityLinkTarget(right, rightLink.getTo());
				
				result.add(new TraceabilityLink(r, leftTarget, rightTarget));
				
			}
			
		}
		
		return result;
		
	}
	
	/**
	 * Searches a given MegaL Megamodel for all declared traceability links, that is defined entities with bound artifacts.
	 * 
	 * @param m
	 * @return
	 */
	static public List<TraceabilityLink> allDeclaredLinks (Megamodel m) {
		
		List<TraceabilityLink> result = new ArrayList<TraceabilityLink>();
		
		for (Relationship r : FluentIterable.from(m.getDeclarations()).filter(Relationship.class)) {
			
			result.addAll(allDeclaredLinks(r));
			
		}
		
		return result;
		
	}
	
	/**
	 * Searches a given Ecore resource for all declared traceability links, that is defined entities with bound artifacts.
	 * 
	 * @param r
	 * @return
	 */
	static public List<TraceabilityLink> allDeclaredLinks (Resource r) {
		
		List<TraceabilityLink> result = new ArrayList<TraceabilityLink>();
		
		for (Megamodel m : FluentIterable.from(r.getContents()).filter(Megamodel.class)) {
						
			result.addAll(allDeclaredLinks(m));
			
		}
		
		return result;
		
	}
	
	static public List<TraceabilityLink> allDeclaredLinks (File file) {
		
		List<TraceabilityLink> result = new ArrayList<TraceabilityLink>();
		
		if (file.exists()) {
			
			String dirPath = file.getParent();
			
			ResourceSet impl = new ResourceSetImpl();
			
			Resource rsrc = impl.getResource(URI.createFileURI(file.getPath()), true);
			
			
			for (Megamodel m : FluentIterable.from(rsrc.getContents()).filter(Megamodel.class)) {
				
				Iterable<Megamodel> imports = m.allImports();
				
				for (Megamodel imp:imports) {
					
					File impFile = new File(dirPath + "/" + imp.getName() + ".megal");
					
					System.out.println(imp.getImports());
					
					if (impFile.exists()) {
						
						impl.getResource(URI.createFileURI(impFile.getParent()),true);
						
					}
					
				}
				
				result.addAll(allDeclaredLinks(m));
				
			}
			
		}
		
		return result;
		
	}
	
	static public List<TraceabilityLink> inferFragmentLinks (List<TraceabilityLink> tlinks) {
		
		return tlinks;
		
	}
	
}
