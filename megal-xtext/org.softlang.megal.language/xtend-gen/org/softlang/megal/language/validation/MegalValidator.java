/**
 * generated by Xtext
 */
package org.softlang.megal.language.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.softlang.megal.Declaration;
import org.softlang.megal.Element;
import org.softlang.megal.Entity;
import org.softlang.megal.EntityType;
import org.softlang.megal.Evaluators;
import org.softlang.megal.MegalPackage;
import org.softlang.megal.Megamodel;
import org.softlang.megal.Relationship;
import org.softlang.megal.RelationshipType;
import org.softlang.megal.TypeReference;
import org.softlang.megal.api.Result;
import org.softlang.megal.language.validation.AbstractMegalValidator;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class MegalValidator extends AbstractMegalValidator {
  public final static String NO_APPLICABLE_INSTANCE = "noApplicableInstance";
  
  public final static String ENTITY_MISOVERLOAD = "entityMisoverload";
  
  public final static String ENTITY_TYPE_MISOVERLOAD = "entityTypeMisoverload";
  
  @Check
  public void checkRelationshipTypeApplicable(final Relationship x) {
    RelationshipType _appliedInstance = x.appliedInstance();
    boolean _equals = Objects.equal(_appliedInstance, null);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("No instance applicable for ");
      RelationshipType _type = x.getType();
      String _name = null;
      if (_type!=null) {
        _name=_type.getName();
      }
      _builder.append(_name, "");
      _builder.append(" from ");
      Entity _left = x.getLeft();
      TypeReference _type_1 = _left.getType();
      _builder.append(_type_1, "");
      _builder.append(" to ");
      Entity _right = x.getRight();
      TypeReference _type_2 = _right.getType();
      _builder.append(_type_2, "");
      this.error(_builder.toString(), 
        MegalPackage.Literals.RELATIONSHIP__TYPE, MegalValidator.NO_APPLICABLE_INSTANCE);
    }
  }
  
  @Check
  public void checkUniqueName(final Entity x) {
    Megamodel _megamodel = x.megamodel();
    Iterable<Megamodel> _allModels = _megamodel.allModels();
    final Function1<Megamodel, EList<Declaration>> _function = new Function1<Megamodel, EList<Declaration>>() {
      public EList<Declaration> apply(final Megamodel it) {
        return it.getDeclarations();
      }
    };
    Iterable<EList<Declaration>> _map = IterableExtensions.<Megamodel, EList<Declaration>>map(_allModels, _function);
    Iterable<Declaration> _flatten = Iterables.<Declaration>concat(_map);
    Iterable<Entity> _filter = Iterables.<Entity>filter(_flatten, Entity.class);
    final Function1<Entity, Boolean> _function_1 = new Function1<Entity, Boolean>() {
      public Boolean apply(final Entity it) {
        boolean _and = false;
        String _name = it.getName();
        String _name_1 = x.getName();
        boolean _equals = Objects.equal(_name, _name_1);
        if (!_equals) {
          _and = false;
        } else {
          TypeReference _type = it.getType();
          TypeReference _type_1 = x.getType();
          boolean _notEquals = (!Objects.equal(_type, _type_1));
          _and = _notEquals;
        }
        return Boolean.valueOf(_and);
      }
    };
    boolean _exists = IterableExtensions.<Entity>exists(_filter, _function_1);
    if (_exists) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("The entity \'");
      String _name = x.getName();
      _builder.append(_name, "");
      _builder.append("\' does not overload it\'s correspondent entities");
      this.error(_builder.toString(), 
        MegalPackage.Literals.NAMED__NAME, MegalValidator.ENTITY_MISOVERLOAD);
    }
  }
  
  @Check
  public void checkUniqueName(final EntityType x) {
    Megamodel _megamodel = x.megamodel();
    Iterable<Megamodel> _allModels = _megamodel.allModels();
    final Function1<Megamodel, EList<Declaration>> _function = new Function1<Megamodel, EList<Declaration>>() {
      public EList<Declaration> apply(final Megamodel it) {
        return it.getDeclarations();
      }
    };
    Iterable<EList<Declaration>> _map = IterableExtensions.<Megamodel, EList<Declaration>>map(_allModels, _function);
    Iterable<Declaration> _flatten = Iterables.<Declaration>concat(_map);
    Iterable<EntityType> _filter = Iterables.<EntityType>filter(_flatten, EntityType.class);
    final Function1<EntityType, Boolean> _function_1 = new Function1<EntityType, Boolean>() {
      public Boolean apply(final EntityType it) {
        boolean _and = false;
        String _name = it.getName();
        String _name_1 = x.getName();
        boolean _equals = Objects.equal(_name, _name_1);
        if (!_equals) {
          _and = false;
        } else {
          TypeReference _supertype = it.getSupertype();
          TypeReference _supertype_1 = x.getSupertype();
          boolean _notEquals = (!Objects.equal(_supertype, _supertype_1));
          _and = _notEquals;
        }
        return Boolean.valueOf(_and);
      }
    };
    boolean _exists = IterableExtensions.<EntityType>exists(_filter, _function_1);
    if (_exists) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("The entity type \'");
      String _name = x.getName();
      _builder.append(_name, "");
      _builder.append("\' does not overload it\'s correspondent entity types");
      this.error(_builder.toString(), 
        MegalPackage.Literals.NAMED__NAME, MegalValidator.ENTITY_TYPE_MISOVERLOAD);
    }
  }
  
  /**
   * This check requires expensive megamodel evaluation
   */
  @Check(CheckType.EXPENSIVE)
  public void checkValidate(final Megamodel m) {
    final Result r = Evaluators.evaluate(m);
    EList<Declaration> _declarations = m.getDeclarations();
    Iterable<Relationship> _filter = Iterables.<Relationship>filter(_declarations, Relationship.class);
    for (final Relationship e : _filter) {
      Set<Element> _invalid = r.getInvalid();
      boolean _contains = _invalid.contains(e);
      if (_contains) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("The relationship \'");
        _builder.append(e, "");
        _builder.append("\' is invalid in this place");
        this.error(_builder.toString(), e, MegalPackage.Literals.RELATIONSHIP__TYPE);
      }
    }
  }
}
