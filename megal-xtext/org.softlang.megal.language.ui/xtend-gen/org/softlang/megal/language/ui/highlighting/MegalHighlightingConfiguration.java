package org.softlang.megal.language.ui.highlighting;

import com.google.common.base.Objects;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.softlang.megal.Annotation;
import org.softlang.megal.Entity;
import org.softlang.megal.EntityType;
import org.softlang.megal.Guard;
import org.softlang.megal.GuardException;
import org.softlang.megal.GuardHelper;
import org.softlang.megal.GuardedProvider;
import org.softlang.megal.Link;
import org.softlang.megal.Relationship;
import org.softlang.megal.RelationshipType;
import org.softlang.megal.TypeReference;
import org.softlang.megal.language.ui.swt.SWTUtil;

@SuppressWarnings("all")
public class MegalHighlightingConfiguration extends DefaultHighlightingConfiguration {
  public static Integer readStyle(final String k, final Iterable<? extends Annotation> xs) {
    Integer _switchResult = null;
    final Function1<Annotation, Boolean> _function = new Function1<Annotation, Boolean>() {
      public Boolean apply(final Annotation it) {
        String _key = it.getKey();
        return Boolean.valueOf(Objects.equal(_key, k));
      }
    };
    Annotation _findFirst = IterableExtensions.findFirst(xs, _function);
    final Annotation x = _findFirst;
    boolean _matched = false;
    if (!_matched) {
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(x, null));
      if (!_notEquals) {
        _and = false;
      } else {
        String _value = x.getValue();
        boolean _notEquals_1 = (!Objects.equal(_value, null));
        _and = _notEquals_1;
      }
      if (_and) {
        _matched=true;
        String _value_1 = x.getValue();
        _switchResult = SWTUtil.parseStyle(_value_1);
      }
    }
    if (!_matched) {
      _switchResult = Integer.valueOf(TextStyle.DEFAULT_FONT_STYLE);
    }
    return _switchResult;
  }
  
  public static RGB readColor(final String k, final Iterable<? extends Annotation> xs) {
    RGB _switchResult = null;
    final Function1<Annotation, Boolean> _function = new Function1<Annotation, Boolean>() {
      public Boolean apply(final Annotation it) {
        String _key = it.getKey();
        return Boolean.valueOf(Objects.equal(_key, k));
      }
    };
    Annotation _findFirst = IterableExtensions.findFirst(xs, _function);
    final Annotation x = _findFirst;
    boolean _matched = false;
    if (!_matched) {
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(x, null));
      if (!_notEquals) {
        _and = false;
      } else {
        String _value = x.getValue();
        boolean _notEquals_1 = (!Objects.equal(_value, null));
        _and = _notEquals_1;
      }
      if (_and) {
        _matched=true;
        String _value_1 = x.getValue();
        _switchResult = SWTUtil.parseColor(_value_1);
      }
    }
    if (!_matched) {
      _switchResult = null;
    }
    return _switchResult;
  }
  
  private final static String STYLE_ANNOTATION_KEY = "Style";
  
  private final static String COLOR_ANNOTATION_KEY = "Color";
  
  private final static String BACKGROUND_ANNOTATION_KEY = "Background";
  
  /**
   * Reads a text style from a list of annotations
   * @param from The style to copy
   * @param sKey The key of the style annotation
   * @param cKey The key of the color annotation
   * @param bKey The key of the background colorannotaiton
   * @param xs The annotations
   */
  public static TextStyle readTextStyle(final TextStyle from, final String sKey, final String cKey, final String bKey, final Iterable<? extends Annotation> xs) {
    TextStyle _copy = from.copy();
    final Procedure1<TextStyle> _function = new Procedure1<TextStyle>() {
      public void apply(final TextStyle it) {
        Integer _readStyle = MegalHighlightingConfiguration.readStyle(sKey, xs);
        it.setStyle((_readStyle).intValue());
        RGB _readColor = MegalHighlightingConfiguration.readColor(bKey, xs);
        it.setBackgroundColor(_readColor);
        RGB _readColor_1 = MegalHighlightingConfiguration.readColor(cKey, xs);
        it.setColor(_readColor_1);
      }
    };
    return ObjectExtensions.<TextStyle>operator_doubleArrow(_copy, _function);
  }
  
  public static TextStyle readTextStyle(final TextStyle from, final Iterable<? extends Annotation> xs) {
    return MegalHighlightingConfiguration.readTextStyle(from, MegalHighlightingConfiguration.STYLE_ANNOTATION_KEY, MegalHighlightingConfiguration.COLOR_ANNOTATION_KEY, MegalHighlightingConfiguration.BACKGROUND_ANNOTATION_KEY, xs);
  }
  
  public static String getID(final EntityType o) {
    final GuardedProvider<String> _function = new GuardedProvider<String>() {
      public String provide(final GuardHelper it) throws GuardException {
        String _xblockexpression = null;
        {
          it.<EntityType>ifAssigned(o);
          _xblockexpression = o.getName();
        }
        return _xblockexpression;
      }
    };
    return Guard.<String>guarded(null, _function);
  }
  
  public static String getID(final RelationshipType o) {
    final GuardedProvider<String> _function = new GuardedProvider<String>() {
      public String provide(final GuardHelper it) throws GuardException {
        String _xblockexpression = null;
        {
          it.<RelationshipType>ifAssigned(o);
          TypeReference _left = o.getLeft();
          it.<TypeReference>ifAssigned(_left);
          TypeReference _left_1 = o.getLeft();
          EntityType _definition = _left_1.getDefinition();
          it.<EntityType>ifAssigned(_definition);
          TypeReference _right = o.getRight();
          it.<TypeReference>ifAssigned(_right);
          TypeReference _right_1 = o.getRight();
          EntityType _definition_1 = _right_1.getDefinition();
          it.<EntityType>ifAssigned(_definition_1);
          TypeReference _left_2 = o.getLeft();
          EntityType _definition_2 = _left_2.getDefinition();
          String _name = _definition_2.getName();
          String _plus = (_name + "_");
          String _name_1 = o.getName();
          String _plus_1 = (_plus + _name_1);
          String _plus_2 = (_plus_1 + "_");
          TypeReference _right_2 = o.getRight();
          EntityType _definition_3 = _right_2.getDefinition();
          String _name_2 = _definition_3.getName();
          _xblockexpression = (_plus_2 + _name_2);
        }
        return _xblockexpression;
      }
    };
    return Guard.<String>guarded(null, _function);
  }
  
  public static String getDescription(final EntityType o) {
    final GuardedProvider<String> _function = new GuardedProvider<String>() {
      public String provide(final GuardHelper it) throws GuardException {
        String _xblockexpression = null;
        {
          it.<EntityType>ifAssigned(o);
          _xblockexpression = o.getName();
        }
        return _xblockexpression;
      }
    };
    return Guard.<String>guarded(null, _function);
  }
  
  public static String getDescription(final RelationshipType o) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Invalid object");
    final GuardedProvider<String> _function = new GuardedProvider<String>() {
      public String provide(final GuardHelper it) throws GuardException {
        String _xblockexpression = null;
        {
          it.<RelationshipType>ifAssigned(o);
          TypeReference _left = o.getLeft();
          it.<TypeReference>ifAssigned(_left);
          TypeReference _right = o.getRight();
          it.<TypeReference>ifAssigned(_right);
          String _name = o.getName();
          String _plus = (_name + " between ");
          TypeReference _left_1 = o.getLeft();
          EntityType _definition = _left_1.getDefinition();
          String _name_1 = _definition.getName();
          String _plus_1 = (_plus + _name_1);
          String _plus_2 = (_plus_1 + " and ");
          TypeReference _right_1 = o.getRight();
          EntityType _definition_1 = _right_1.getDefinition();
          String _name_2 = _definition_1.getName();
          _xblockexpression = (_plus_2 + _name_2);
        }
        return _xblockexpression;
      }
    };
    return Guard.<String>guarded(_builder.toString(), _function);
  }
  
  public TextStyle getStyle(final RelationshipType o) {
    TextStyle _relationshipTextStyle = this.relationshipTextStyle();
    final GuardedProvider<TextStyle> _function = new GuardedProvider<TextStyle>() {
      public TextStyle provide(final GuardHelper it) throws GuardException {
        TextStyle _xblockexpression = null;
        {
          it.<RelationshipType>ifAssigned(o);
          EList<Annotation> _annotations = o.getAnnotations();
          it.<EList<Annotation>>ifAssigned(_annotations);
          TextStyle _relationshipTextStyle = MegalHighlightingConfiguration.this.relationshipTextStyle();
          EList<Annotation> _annotations_1 = o.getAnnotations();
          _xblockexpression = MegalHighlightingConfiguration.readTextStyle(_relationshipTextStyle, _annotations_1);
        }
        return _xblockexpression;
      }
    };
    return Guard.<TextStyle>guarded(_relationshipTextStyle, _function);
  }
  
  public TextStyle getStyle(final EntityType o) {
    TextStyle _entityTextStyle = this.entityTextStyle();
    final GuardedProvider<TextStyle> _function = new GuardedProvider<TextStyle>() {
      public TextStyle provide(final GuardHelper it) throws GuardException {
        TextStyle _xblockexpression = null;
        {
          it.<EntityType>ifAssigned(o);
          EList<Annotation> _annotations = o.getAnnotations();
          it.<EList<Annotation>>ifAssigned(_annotations);
          TextStyle _entityTextStyle = MegalHighlightingConfiguration.this.entityTextStyle();
          EList<Annotation> _annotations_1 = o.getAnnotations();
          _xblockexpression = MegalHighlightingConfiguration.readTextStyle(_entityTextStyle, _annotations_1);
        }
        return _xblockexpression;
      }
    };
    return Guard.<TextStyle>guarded(_entityTextStyle, _function);
  }
  
  /**
   * Set of all available styles
   */
  private final static HashSet<Object> available = CollectionLiterals.<Object>newHashSet();
  
  public final static String ENTITY_ID = "entity";
  
  public final static String RELATIONSHIP_ID = "relationship";
  
  public final static String ENTITY_TYPE_ID = "entity_type";
  
  public final static String RELATIONSHIP_TYPE_ID = "relationship_type";
  
  public final static String URI_ID = "uri";
  
  public static String idFor(final Entity o) {
    final GuardedProvider<String> _function = new GuardedProvider<String>() {
      public String provide(final GuardHelper it) throws GuardException {
        it.<Entity>ifAssigned(o);
        TypeReference _type = o.getType();
        it.<TypeReference>ifAssigned(_type);
        TypeReference _type_1 = o.getType();
        EntityType _definition = _type_1.getDefinition();
        String _iD = MegalHighlightingConfiguration.getID(_definition);
        return it.<String>ifContained(_iD, MegalHighlightingConfiguration.available);
      }
    };
    return Guard.<String>guarded(MegalHighlightingConfiguration.ENTITY_ID, _function);
  }
  
  public static String idFor(final Link o) {
    final GuardedProvider<String> _function = new GuardedProvider<String>() {
      public String provide(final GuardHelper it) throws GuardException {
        it.<Link>ifAssigned(o);
        Entity _link = o.getLink();
        it.<Entity>ifAssigned(_link);
        Entity _link_1 = o.getLink();
        TypeReference _type = _link_1.getType();
        it.<TypeReference>ifAssigned(_type);
        Entity _link_2 = o.getLink();
        TypeReference _type_1 = _link_2.getType();
        EntityType _definition = _type_1.getDefinition();
        String _iD = MegalHighlightingConfiguration.getID(_definition);
        return it.<String>ifContained(_iD, MegalHighlightingConfiguration.available);
      }
    };
    return Guard.<String>guarded(MegalHighlightingConfiguration.ENTITY_ID, _function);
  }
  
  public static String idFor(final Relationship o) {
    final GuardedProvider<String> _function = new GuardedProvider<String>() {
      public String provide(final GuardHelper it) throws GuardException {
        it.<Relationship>ifAssigned(o);
        RelationshipType _type = o.getType();
        it.<RelationshipType>ifAssigned(_type);
        RelationshipType _type_1 = o.getType();
        String _iD = MegalHighlightingConfiguration.getID(_type_1);
        return it.<String>ifContained(_iD, MegalHighlightingConfiguration.available);
      }
    };
    return Guard.<String>guarded(MegalHighlightingConfiguration.RELATIONSHIP_ID, _function);
  }
  
  public static String idFor(final EntityType o) {
    final GuardedProvider<String> _function = new GuardedProvider<String>() {
      public String provide(final GuardHelper it) throws GuardException {
        it.<EntityType>ifAssigned(o);
        String _iD = MegalHighlightingConfiguration.getID(o);
        return it.<String>ifContained(_iD, MegalHighlightingConfiguration.available);
      }
    };
    return Guard.<String>guarded(MegalHighlightingConfiguration.ENTITY_TYPE_ID, _function);
  }
  
  public static String idFor(final RelationshipType o) {
    final GuardedProvider<String> _function = new GuardedProvider<String>() {
      public String provide(final GuardHelper it) throws GuardException {
        it.<RelationshipType>ifAssigned(o);
        String _iD = MegalHighlightingConfiguration.getID(o);
        return it.<String>ifContained(_iD, MegalHighlightingConfiguration.available);
      }
    };
    return Guard.<String>guarded(MegalHighlightingConfiguration.RELATIONSHIP_TYPE_ID, _function);
  }
  
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    super.configure(acceptor);
    TextStyle _uriTextStyle = this.uriTextStyle();
    acceptor.acceptDefaultHighlighting(MegalHighlightingConfiguration.URI_ID, "URI", _uriTextStyle);
    TextStyle _entityTextStyle = this.entityTextStyle();
    acceptor.acceptDefaultHighlighting(MegalHighlightingConfiguration.ENTITY_ID, "Entity", _entityTextStyle);
    TextStyle _entityTypeTextStyle = this.entityTypeTextStyle();
    acceptor.acceptDefaultHighlighting(MegalHighlightingConfiguration.ENTITY_TYPE_ID, "Entity type", _entityTypeTextStyle);
    TextStyle _relationshipTextStyle = this.relationshipTextStyle();
    acceptor.acceptDefaultHighlighting(MegalHighlightingConfiguration.RELATIONSHIP_ID, "Relationship", _relationshipTextStyle);
    TextStyle _relationshipTypeTextStyle = this.relationshipTypeTextStyle();
    acceptor.acceptDefaultHighlighting(MegalHighlightingConfiguration.RELATIONSHIP_TYPE_ID, "Relationship type", _relationshipTypeTextStyle);
    MegalHighlightingConfiguration.available.clear();
  }
  
  public TextStyle uriTextStyle() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    TextStyle _copy = _defaultTextStyle.copy();
    final Procedure1<TextStyle> _function = new Procedure1<TextStyle>() {
      public void apply(final TextStyle it) {
        it.setStyle(SWT.ITALIC);
        RGB _rGB = new RGB(255, 60, 30);
        it.setColor(_rGB);
      }
    };
    return ObjectExtensions.<TextStyle>operator_doubleArrow(_copy, _function);
  }
  
  public TextStyle entityTextStyle() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    TextStyle _copy = _defaultTextStyle.copy();
    final Procedure1<TextStyle> _function = new Procedure1<TextStyle>() {
      public void apply(final TextStyle it) {
      }
    };
    return ObjectExtensions.<TextStyle>operator_doubleArrow(_copy, _function);
  }
  
  public TextStyle relationshipTextStyle() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    TextStyle _copy = _defaultTextStyle.copy();
    final Procedure1<TextStyle> _function = new Procedure1<TextStyle>() {
      public void apply(final TextStyle it) {
        it.setStyle(SWT.ITALIC);
      }
    };
    return ObjectExtensions.<TextStyle>operator_doubleArrow(_copy, _function);
  }
  
  public TextStyle entityTypeTextStyle() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    TextStyle _copy = _defaultTextStyle.copy();
    final Procedure1<TextStyle> _function = new Procedure1<TextStyle>() {
      public void apply(final TextStyle it) {
      }
    };
    return ObjectExtensions.<TextStyle>operator_doubleArrow(_copy, _function);
  }
  
  public TextStyle relationshipTypeTextStyle() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    TextStyle _copy = _defaultTextStyle.copy();
    final Procedure1<TextStyle> _function = new Procedure1<TextStyle>() {
      public void apply(final TextStyle it) {
        it.setStyle(SWT.ITALIC);
      }
    };
    return ObjectExtensions.<TextStyle>operator_doubleArrow(_copy, _function);
  }
}
