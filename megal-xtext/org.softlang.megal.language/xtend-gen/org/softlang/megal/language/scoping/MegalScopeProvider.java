package org.softlang.megal.language.scoping;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.softlang.megal.Declaration;
import org.softlang.megal.Megamodel;
import org.softlang.megal.Named;

/**
 * This scope provider uses declarative mechanisms to determine local scopes for MegaL objects
 */
@SuppressWarnings("all")
public class MegalScopeProvider extends AbstractDeclarativeScopeProvider {
  @Inject
  private IQualifiedNameProvider qualifiedNameProvider;
  
  private IScope scope_Named(final Megamodel m, final EReference r) {
    IScope _xblockexpression = null;
    {
      EClassifier _eType = r.getEType();
      Class<?> _instanceClass = _eType.getInstanceClass();
      boolean _isAssignableFrom = Named.class.isAssignableFrom(_instanceClass);
      boolean _not = (!_isAssignableFrom);
      if (_not) {
        return this.delegateGetScope(m, r);
      }
      EClassifier _eType_1 = r.getEType();
      Class<?> _instanceClass_1 = _eType_1.getInstanceClass();
      final Class<? extends Named> instanceClass = _instanceClass_1.<Named>asSubclass(Named.class);
      EList<Declaration> _declarations = m.getDeclarations();
      Iterable<? extends Named> _filter = Iterables.filter(_declarations, instanceClass);
      Iterable<Megamodel> _allImports = m.allImports();
      final Function1<Megamodel, EList<Declaration>> _function = new Function1<Megamodel, EList<Declaration>>() {
        public EList<Declaration> apply(final Megamodel it) {
          return it.getDeclarations();
        }
      };
      Iterable<EList<Declaration>> _map = IterableExtensions.<Megamodel, EList<Declaration>>map(_allImports, _function);
      Iterable<Declaration> _flatten = Iterables.<Declaration>concat(_map);
      Iterable<? extends Named> _filter_1 = Iterables.filter(_flatten, instanceClass);
      IScope _scopeFor = Scopes.<EObject>scopeFor(_filter_1, 
        this.qualifiedNameProvider, 
        IScope.NULLSCOPE);
      _xblockexpression = Scopes.<EObject>scopeFor(_filter, this.qualifiedNameProvider, _scopeFor);
    }
    return _xblockexpression;
  }
  
  public IScope scope_Entity(final Megamodel m, final EReference r) {
    return this.scope_Named(m, r);
  }
  
  public IScope scope_EntityType(final Megamodel m, final EReference r) {
    return this.scope_Named(m, r);
  }
  
  public IScope scope_RelationshipType(final Megamodel m, final EReference r) {
    return this.scope_Named(m, r);
  }
}
