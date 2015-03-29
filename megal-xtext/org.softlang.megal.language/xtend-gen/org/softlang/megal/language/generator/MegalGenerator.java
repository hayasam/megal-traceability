/**
 * generated by Xtext
 */
package org.softlang.megal.language.generator;

import com.google.common.collect.Iterables;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.softlang.megal.MegalFactory;
import org.softlang.megal.Megamodel;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class MegalGenerator implements IGenerator {
  @Extension
  private final MegalFactory f = MegalFactory.eINSTANCE;
  
  public String toText(final EObject e) {
    try {
      final ResourceSetImpl rs = new ResourceSetImpl();
      URI _createURI = URI.createURI("inmem/target.megal");
      final Resource re = rs.createResource(_createURI);
      EList<EObject> _contents = re.getContents();
      _contents.add(e);
      final ByteArrayOutputStream baos = new ByteArrayOutputStream();
      Map<Object, Object> _emptyMap = CollectionLiterals.<Object, Object>emptyMap();
      re.save(baos, _emptyMap);
      return baos.toString();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    Iterable<Megamodel> _filter = Iterables.<Megamodel>filter(_contents, Megamodel.class);
    for (final Megamodel m : _filter) {
    }
  }
}
