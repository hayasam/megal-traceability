package org.softlang.megal.traceabilty.recovery;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.softlang.megal.Entity;
import org.softlang.megal.Link;
import org.softlang.megal.Links;
import org.softlang.megal.MegalPackage;
import org.softlang.megal.Megamodel;
import org.softlang.megal.Relationship;
import org.softlang.megal.Relationships;
import org.softlang.megal.evaluation.MegalFactoryEval;
import org.softlang.megal.language.MegalStandaloneSetup;

import com.google.common.base.Charsets;
import com.google.common.collect.FluentIterable;
import com.google.common.io.CharSource;
import com.google.common.io.Resources;

public class Main {

	private static void setupMegaL () {
		
		EPackage.Registry.INSTANCE.put("http://softlang.wikidot.com/megal",
				new EPackage.Descriptor() {

					@Override
					public EPackage getEPackage() {
						return null;
					}

					@Override
					public EFactory getEFactory() {
						return new MegalFactoryEval();
					}
				});

		MegalPackage pack = MegalPackage.eINSTANCE;

		MegalStandaloneSetup.doSetup();
		
	}
	
	public static void main (String[] args) throws IOException {
		
		setupMegaL();
		
		ResourceSet x = new ResourceSetImpl();
		Resource r = x.getResource(URI.createFileURI("Test.megal"), true);
		
		List<TraceabilityLink> links = TraceabilityLinks.allDeclaredTraceabilityLinks(r);
		
		for (TraceabilityLink link : links) {
			
			System.out.println(link);
			
		}
//
//		for (Megamodel o : FluentIterable.from(v.getContents()).filter(Megamodel.class)) {
//			
//			doStuffWithMegamodel(o);
//			
//		}

	}
	
	public static CharSource openLink(String url) throws IOException {
		
		String resolved = null;

		if (url.startsWith("workspace:/")) {
			
			resolved = new File("..").toURI() + url.substring("workspace:/".length());
						
		} else {
		
			System.err.println("No special wrapping method for " + url);
			
		}

		try {
			
			return Resources.asCharSource(new URL(resolved), Charsets.UTF_8);
			
		} catch (MalformedURLException e) {
			
			throw new RuntimeException(e);
			
		}
		
	}

	private static void doStuffWithMegamodel(Megamodel o) throws IOException {
		
		System.out.println("asd");
		
		for (Relationship x : FluentIterable.from(o.getDeclarations()).filter(Relationship.class)) {
			
			System.out.println(x.getLeft());
			System.out.println(x.getRight());
			
			Iterable<Link> leftBindings = Links.allBindings(o, x.getLeft());
			Iterable<Link> rightBindings = Links.allBindings(o, x.getRight());
			
			System.out.println(leftBindings.iterator().hasNext());
			
			for (Link l : leftBindings) {
				
				System.out.println(l.getTo());
				
			}
			
			System.out.println(rightBindings.iterator().hasNext());
			
		}
		
		
//		for (Entity et : FluentIterable.from(o.getDeclarations()).filter(Entity.class)) {
//			
//			System.out.println("Entity: " + et);
//			
//			for (Link l : Links.allBindings(o, et)) {
//		
//				System.out.println("  Linked to: " + l.getTo());
//				CharSource xs = openLink(l.getTo());
//				xs.copyTo(System.out);
//				System.out.println();
//				
//			}
//			
//		}
		
	}

}
