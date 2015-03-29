package megaltest;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

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
import org.softlang.megal.evaluation.MegalFactoryEval;
import org.softlang.megal.language.MegalStandaloneSetup;

import com.google.common.base.Charsets;
import com.google.common.collect.FluentIterable;
import com.google.common.io.CharSource;
import com.google.common.io.Resources;

public class Stuff {

	public static CharSource openLink(String url) throws IOException {
		String resolved = null;

		if (url.startsWith("workspace:/")) {
			resolved = new File("..").toURI() + url.substring("workspace:/".length());
			
			File f = new File(resolved);
			
			
			// /home/darjeeling/Documents/megal-traceability/org.softlang.megal.traceability.recovery/X.txt
//			System.out.println(resolved);
//			System.out.println(f.getCanonicalPath());
//			System.out.println(f.exists());
//			
//			System.exit(0);
			
		} else {
			System.err.println("No special wrapping method for " + url);
		}

		try {
			return Resources.asCharSource(new URL(resolved), Charsets.UTF_8);
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}

	
	public static void main(String[] args) throws IOException {
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
		ResourceSet x = new ResourceSetImpl();
		Resource v = x.getResource(URI.createFileURI("Test.megal"), true);

		for (Megamodel o : FluentIterable.from(v.getContents()).filter(
				Megamodel.class)) {
			doStuffWithMegamodel(o);
		}

	}

	private static void doStuffWithMegamodel(Megamodel o) throws IOException {
		for (Entity et : FluentIterable.from(o.getDeclarations()).filter(
				Entity.class)) {
			System.out.println("Entity: " + et);
			for (Link l : Links.allBindings(o, et)) {
				System.out.println("  Linked to: " + l.getTo());

				CharSource xs = openLink(l.getTo());
				xs.copyTo(System.out);
				System.out.println();
			}
		}
	}

}
