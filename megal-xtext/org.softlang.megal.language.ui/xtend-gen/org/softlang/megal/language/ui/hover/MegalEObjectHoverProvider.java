package org.softlang.megal.language.ui.hover;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.editor.hover.html.IXtextBrowserInformationControl;
import org.eclipse.xtext.ui.editor.hover.html.XtextElementLinks;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.softlang.megal.Entity;
import org.softlang.megal.EntityType;
import org.softlang.megal.Link;
import org.softlang.megal.MegalPlugin;
import org.softlang.megal.Megamodel;
import org.softlang.megal.RelationshipType;
import org.softlang.megal.RelationshipTypes;
import org.softlang.megal.TypeReference;
import org.softlang.megal.api.URI;
import org.softlang.megal.fragmentprovider.Evaluator;
import org.softlang.megal.language.ui.hover.ExtenderEObjectHoverProvider;
import org.softlang.megal.language.ui.hover.ExtenderPresentationControlCreator;
import org.softlang.megal.language.ui.hover.ListAnnotationsAction;
import org.softlang.megal.language.ui.hover.ListInstancesAction;
import org.softlang.megal.language.ui.hover.ListSubtypesAction;
import org.softlang.megal.language.ui.hover.ScopeToAction;

@SuppressWarnings("all")
public class MegalEObjectHoverProvider extends ExtenderEObjectHoverProvider {
  protected boolean hasHover(final EObject o) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (!_matched) {
      if (o instanceof Link) {
        _matched=true;
        _switchResult = true;
      }
    }
    if (!_matched) {
      _switchResult = super.hasHover(o);
    }
    return _switchResult;
  }
  
  protected Object addActions(final ExtenderPresentationControlCreator p) {
    boolean _xblockexpression = false;
    {
      List<Function1<? super IXtextBrowserInformationControl, ? extends IAction>> _constructors = p.getConstructors();
      final Function1<IXtextBrowserInformationControl, IAction> _function = new Function1<IXtextBrowserInformationControl, IAction>() {
        public IAction apply(final IXtextBrowserInformationControl it) {
          return new ListAnnotationsAction(MegalEObjectHoverProvider.this, it);
        }
      };
      _constructors.add(_function);
      List<Function1<? super IXtextBrowserInformationControl, ? extends IAction>> _constructors_1 = p.getConstructors();
      final Function1<IXtextBrowserInformationControl, IAction> _function_1 = new Function1<IXtextBrowserInformationControl, IAction>() {
        public IAction apply(final IXtextBrowserInformationControl it) {
          return new ListSubtypesAction(MegalEObjectHoverProvider.this, it);
        }
      };
      _constructors_1.add(_function_1);
      List<Function1<? super IXtextBrowserInformationControl, ? extends IAction>> _constructors_2 = p.getConstructors();
      final Function1<IXtextBrowserInformationControl, IAction> _function_2 = new Function1<IXtextBrowserInformationControl, IAction>() {
        public IAction apply(final IXtextBrowserInformationControl it) {
          return new ScopeToAction(MegalEObjectHoverProvider.this, it);
        }
      };
      _constructors_2.add(_function_2);
      List<Function1<? super IXtextBrowserInformationControl, ? extends IAction>> _constructors_3 = p.getConstructors();
      final Function1<IXtextBrowserInformationControl, IAction> _function_3 = new Function1<IXtextBrowserInformationControl, IAction>() {
        public IAction apply(final IXtextBrowserInformationControl it) {
          return new ListInstancesAction(MegalEObjectHoverProvider.this, it);
        }
      };
      _xblockexpression = _constructors_3.add(_function_3);
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  protected String getFirstLine(final EObject object) {
    CharSequence _firstLineFor = this.firstLineFor(object);
    final CharSequence p = _firstLineFor;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(p, null)) {
        _matched=true;
        return super.getFirstLine(object);
      }
    }
    return p.toString();
  }
  
  protected String getDocumentation(final EObject object) {
    CharSequence _documentationFor = this.documentationFor(object);
    final CharSequence p = _documentationFor;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(p, null)) {
        _matched=true;
        return super.getDocumentation(object);
      }
    }
    return p.toString();
  }
  
  public String link(final EObject o) {
    XtextElementLinks _elementLinks = this.getElementLinks();
    return _elementLinks.createLink(o);
  }
  
  /**
   * Calculates the first line for an EObject or null if no first line
   */
  protected CharSequence _firstLineFor(final EObject it) {
    return null;
  }
  
  protected CharSequence _firstLineFor(final Entity it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<b>");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append("</b> : ");
    TypeReference _type = it.getType();
    EntityType _definition = _type.getDefinition();
    String _link = this.link(_definition);
    _builder.append(_link, "");
    return _builder.toString();
  }
  
  protected CharSequence _firstLineFor(final EntityType it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<b>");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append("</b> ");
    {
      TypeReference _supertype = it.getSupertype();
      boolean _notEquals = (!Objects.equal(_supertype, null));
      if (_notEquals) {
        _builder.append("  &lt; ");
        TypeReference _supertype_1 = it.getSupertype();
        EntityType _definition = _supertype_1.getDefinition();
        String _link = this.link(_definition);
        _builder.append(_link, "");
      }
    }
    return _builder;
  }
  
  protected CharSequence _firstLineFor(final RelationshipType it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<b>");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append("</b>");
    return _builder;
  }
  
  protected CharSequence _firstLineFor(final Link it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Link, ");
    {
      Evaluator _evaluator = MegalPlugin.getEvaluator();
      String _to = it.getTo();
      URI _valueOf = URI.valueOf(_to);
      List<Object> _evaluate = _evaluator.evaluate(_valueOf);
      boolean _isEmpty = _evaluate.isEmpty();
      if (_isEmpty) {
        _builder.append("unresolvable");
      } else {
        _builder.append("resolvable");
      }
    }
    return _builder;
  }
  
  /**
   * Calculates the documentation for an EObject or null if no documentation
   */
  protected CharSequence _documentationFor(final EObject it) {
    return null;
  }
  
  protected CharSequence _documentationFor(final Entity it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isDependent = it.isDependent();
      if (_isDependent) {
        _builder.append("<p>Entity is <a href=\"put a cool link to explain dependency\">dependent</a></p>");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      boolean _isParameter = it.isParameter();
      if (_isParameter) {
        _builder.append("<p>Entity is <a href=\"put a cool link to explain parametricity\">a parameter</a></p>");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t");
    String _documentation = super.getDocumentation(it);
    _builder.append(_documentation, "\t\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _documentationFor(final EntityType it) {
    StringConcatenation _builder = new StringConcatenation();
    String _documentation = super.getDocumentation(it);
    _builder.append(_documentation, "");
    return _builder;
  }
  
  protected CharSequence _documentationFor(final RelationshipType relationshipType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Defined for the following domains and codomains:");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<ul>");
    _builder.newLine();
    {
      Megamodel _megamodel = relationshipType.megamodel();
      Iterable<RelationshipType> _allOverloads = RelationshipTypes.allOverloads(_megamodel, relationshipType);
      for(final RelationshipType i : _allOverloads) {
        _builder.append("\t");
        _builder.append("<li>");
        TypeReference _left = i.getLeft();
        EntityType _definition = _left.getDefinition();
        String _link = this.link(_definition);
        _builder.append(_link, "\t");
        _builder.append(" &lowast; ");
        TypeReference _right = i.getRight();
        EntityType _definition_1 = _right.getDefinition();
        String _link_1 = this.link(_definition_1);
        _builder.append(_link_1, "\t");
        _builder.append("</li>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("</p>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _documentationFor(final Link it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul>");
    {
      Evaluator _evaluator = MegalPlugin.getEvaluator();
      String _to = it.getTo();
      URI _valueOf = URI.valueOf(_to);
      List<Object> _evaluate = _evaluator.evaluate(_valueOf);
      for(final Object n : _evaluate) {
        _builder.append("<li>");
        _builder.append(n, "");
        _builder.append("</li>");
      }
    }
    _builder.append("</ul>");
    return _builder;
  }
  
  public CharSequence firstLineFor(final EObject it) {
    if (it instanceof Entity) {
      return _firstLineFor((Entity)it);
    } else if (it instanceof EntityType) {
      return _firstLineFor((EntityType)it);
    } else if (it instanceof RelationshipType) {
      return _firstLineFor((RelationshipType)it);
    } else if (it instanceof Link) {
      return _firstLineFor((Link)it);
    } else if (it != null) {
      return _firstLineFor(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public CharSequence documentationFor(final EObject it) {
    if (it instanceof Entity) {
      return _documentationFor((Entity)it);
    } else if (it instanceof EntityType) {
      return _documentationFor((EntityType)it);
    } else if (it instanceof RelationshipType) {
      return _documentationFor((RelationshipType)it);
    } else if (it instanceof Link) {
      return _documentationFor((Link)it);
    } else if (it != null) {
      return _documentationFor(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
