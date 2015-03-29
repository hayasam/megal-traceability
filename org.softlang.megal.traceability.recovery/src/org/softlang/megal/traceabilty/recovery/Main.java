package org.softlang.megal.traceabilty.recovery;

import java.io.File;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.softlang.megal.MegalPackage;
import org.softlang.megal.evaluation.MegalFactoryEval;
import org.softlang.megal.language.MegalStandaloneSetup;

/**
 * 
 * @author maxmeffert
 *
 */
public class Main {

	static private String FILE = "./testfiles/Test.megal";
	
	static private void setupMegaL () {
		
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

		@SuppressWarnings("unused")
		MegalPackage pack = MegalPackage.eINSTANCE;

		MegalStandaloneSetup.doSetup();
		
	}
	
	static public void main (String[] args) {
		
		setupMegaL();
				
		ResourceSet impl = new ResourceSetImpl();
		Resource rsrc2 = impl.getResource(URI.createFileURI(FILE), true);
		Resource rsrc1 = impl.getResource(URI.createFileURI("./testfiles/Prelude.megal"), true);

		
		List<TraceabilityLink> tlinks = TraceabilityLinks.allDeclaredLinks(rsrc2);
		
		for (TraceabilityLink tlink : tlinks) {
			
			System.out.println(tlink);
			
		}

	}
	
	
	

}
