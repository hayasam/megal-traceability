package org.softlang.megal.language.ui.highlighting;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pair;
import org.softlang.megal.Entity;
import org.softlang.megal.EntityType;
import org.softlang.megal.Link;
import org.softlang.megal.MegalPackage;
import org.softlang.megal.Relationship;
import org.softlang.megal.RelationshipType;
import org.softlang.megal.language.ui.highlighting.MegalHighlightingConfiguration;

@SuppressWarnings("all")
public class MegalSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
  protected boolean highlightElement(final EObject object, final IHighlightedPositionAcceptor acceptor) {
    List<? extends Pair<? extends EStructuralFeature, String>> _stylesFor = this.stylesFor(object);
    final List<? extends Pair<? extends EStructuralFeature, String>> p = _stylesFor;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(p, null)) {
        _matched=true;
        return super.highlightElement(object, acceptor);
      }
    }
    {
      for (final Pair<? extends EStructuralFeature, String> k : p) {
        EStructuralFeature _key = k.getKey();
        String _value = k.getValue();
        this.highlightFeature(acceptor, object, _key, _value);
      }
      return true;
    }
  }
  
  /**
   * Calculates the style mapping for an EObject or null if no style mapping
   */
  protected List<? extends Pair<? extends EStructuralFeature, String>> _stylesFor(final EObject object) {
    return null;
  }
  
  protected List<? extends Pair<? extends EStructuralFeature, String>> _stylesFor(final Link object) {
    String _idFor = MegalHighlightingConfiguration.idFor(object);
    Pair<EReference, String> _mappedTo = Pair.<EReference, String>of(MegalPackage.Literals.LINK__LINK, _idFor);
    return Collections.<Pair<EReference, String>>unmodifiableList(CollectionLiterals.<Pair<EReference, String>>newArrayList(_mappedTo));
  }
  
  protected List<? extends Pair<? extends EStructuralFeature, String>> _stylesFor(final Entity object) {
    String _idFor = MegalHighlightingConfiguration.idFor(object);
    Pair<EAttribute, String> _mappedTo = Pair.<EAttribute, String>of(MegalPackage.Literals.NAMED__NAME, _idFor);
    return Collections.<Pair<EAttribute, String>>unmodifiableList(CollectionLiterals.<Pair<EAttribute, String>>newArrayList(_mappedTo));
  }
  
  protected List<? extends Pair<? extends EStructuralFeature, String>> _stylesFor(final EntityType object) {
    String _idFor = MegalHighlightingConfiguration.idFor(object);
    Pair<EAttribute, String> _mappedTo = Pair.<EAttribute, String>of(MegalPackage.Literals.NAMED__NAME, _idFor);
    return Collections.<Pair<EAttribute, String>>unmodifiableList(CollectionLiterals.<Pair<EAttribute, String>>newArrayList(_mappedTo));
  }
  
  protected List<? extends Pair<? extends EStructuralFeature, String>> _stylesFor(final Relationship object) {
    String _idFor = MegalHighlightingConfiguration.idFor(object);
    Pair<EReference, String> _mappedTo = Pair.<EReference, String>of(MegalPackage.Literals.RELATIONSHIP__TYPE, _idFor);
    return Collections.<Pair<EReference, String>>unmodifiableList(CollectionLiterals.<Pair<EReference, String>>newArrayList(_mappedTo));
  }
  
  protected List<? extends Pair<? extends EStructuralFeature, String>> _stylesFor(final RelationshipType object) {
    String _idFor = MegalHighlightingConfiguration.idFor(object);
    Pair<EAttribute, String> _mappedTo = Pair.<EAttribute, String>of(MegalPackage.Literals.NAMED__NAME, _idFor);
    return Collections.<Pair<EAttribute, String>>unmodifiableList(CollectionLiterals.<Pair<EAttribute, String>>newArrayList(_mappedTo));
  }
  
  public List<? extends Pair<? extends EStructuralFeature, String>> stylesFor(final EObject object) {
    if (object instanceof Entity) {
      return _stylesFor((Entity)object);
    } else if (object instanceof EntityType) {
      return _stylesFor((EntityType)object);
    } else if (object instanceof RelationshipType) {
      return _stylesFor((RelationshipType)object);
    } else if (object instanceof Relationship) {
      return _stylesFor((Relationship)object);
    } else if (object instanceof Link) {
      return _stylesFor((Link)object);
    } else if (object != null) {
      return _stylesFor(object);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
}
