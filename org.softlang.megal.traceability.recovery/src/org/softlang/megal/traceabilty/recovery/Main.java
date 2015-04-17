package org.softlang.megal.traceabilty.recovery;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.softlang.megal.Entity;
import org.softlang.megal.MegalPackage;
import org.softlang.megal.Relationship;
import org.softlang.megal.evaluation.MegalFactoryEval;
import org.softlang.megal.language.MegalStandaloneSetup;

/**
 * 
 * @author maxmeffert
 *
 */
public class Main {

	
	static private String PRELUDE = "./testfiles/Prelude.megal";
	static private String FILE = "./testfiles/Test.megal";
	
	static private void setupMegaL () {
		
		EPackage.Registry.INSTANCE.put(
				"http://softlang.wikidot.com/megal",
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

		@SuppressWarnings("unused")
		MegalPackage pack = MegalPackage.eINSTANCE;

		MegalStandaloneSetup.doSetup();
		
	}
	
	static public void main (String[] args) {
		
		setupMegaL();
				
		ResourceSet impl = new ResourceSetImpl();
		
		impl.getResource(URI.createFileURI(PRELUDE), true);
		
		Resource rsrc = impl.getResource(URI.createFileURI(FILE), true);
		
		Iterable<TraceabilityLink> tlinks = TraceabilityLinks.getTraceabilityLinks(rsrc);
		
		for (TraceabilityLink tlink : tlinks) {
			
			System.out.println(tlink);
			
			Entity left = tlink.getLeftTarget().getEntity();
			
			for (Entity r : TraceabilityLinks.getElementOfWhereLeft(left).filter(Entity.class)) {
				
				System.out.println(r);
				
			}
			
			
			
		}

	}
	
	
	

}
