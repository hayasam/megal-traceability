package org.softlang.megal.language.ui.hover;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.internal.text.html.BrowserInformationControlInput;
import org.eclipse.ui.ISharedImages;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.editor.hover.html.IXtextBrowserInformationControl;
import org.eclipse.xtext.ui.editor.hover.html.XtextElementLinks;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.softlang.megal.Declaration;
import org.softlang.megal.Entity;
import org.softlang.megal.EntityType;
import org.softlang.megal.Megamodel;
import org.softlang.megal.TypeReference;
import org.softlang.megal.language.ui.hover.ExtenderAction;
import org.softlang.megal.language.ui.hover.ExtenderEObjectHoverProvider;

@SuppressWarnings("all")
public class ListInstancesAction extends ExtenderAction {
  public static boolean isSubType(final EntityType a, final EntityType of) {
    boolean _and = false;
    TypeReference _supertype = a.getSupertype();
    boolean _notEquals = (!Objects.equal(_supertype, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _or = false;
      TypeReference _supertype_1 = a.getSupertype();
      EntityType _definition = _supertype_1.getDefinition();
      boolean _equals = Objects.equal(_definition, of);
      if (_equals) {
        _or = true;
      } else {
        TypeReference _supertype_2 = a.getSupertype();
        EntityType _definition_1 = _supertype_2.getDefinition();
        boolean _isSubType = ListInstancesAction.isSubType(_definition_1, of);
        _or = _isSubType;
      }
      _and = _or;
    }
    return _and;
  }
  
  public static boolean isInstance(final Entity a, final EntityType of) {
    boolean _or = false;
    TypeReference _type = a.getType();
    EntityType _definition = _type.getDefinition();
    boolean _equals = Objects.equal(_definition, of);
    if (_equals) {
      _or = true;
    } else {
      TypeReference _type_1 = a.getType();
      EntityType _definition_1 = _type_1.getDefinition();
      boolean _isSubType = ListInstancesAction.isSubType(_definition_1, of);
      _or = _isSubType;
    }
    return _or;
  }
  
  public ListInstancesAction(final ExtenderEObjectHoverProvider p, final IXtextBrowserInformationControl c) {
    super(p, c, "List instances", ISharedImages.IMG_ELCL_REMOVEALL);
  }
  
  public void update() {
    IXtextBrowserInformationControl _infoControl = this.getInfoControl();
    BrowserInformationControlInput _input = _infoControl.getInput();
    Object _inputElement = null;
    if (_input!=null) {
      _inputElement=_input.getInputElement();
    }
    this.setEnabled((_inputElement instanceof EntityType));
  }
  
  public void run() {
    IXtextBrowserInformationControl _infoControl = this.getInfoControl();
    BrowserInformationControlInput _input = _infoControl.getInput();
    Object _inputElement = null;
    if (_input!=null) {
      _inputElement=_input.getInputElement();
    }
    final EntityType e = ((EntityType) _inputElement);
    Resource _eResource = e.eResource();
    ResourceSet _resourceSet = _eResource.getResourceSet();
    EList<Resource> _resources = _resourceSet.getResources();
    final Function1<Resource, Iterable<Megamodel>> _function = new Function1<Resource, Iterable<Megamodel>>() {
      public Iterable<Megamodel> apply(final Resource it) {
        EList<EObject> _contents = it.getContents();
        return Iterables.<Megamodel>filter(_contents, Megamodel.class);
      }
    };
    List<Iterable<Megamodel>> _map = ListExtensions.<Resource, Iterable<Megamodel>>map(_resources, _function);
    final Iterable<Megamodel> resolved = Iterables.<Megamodel>concat(_map);
    final Function1<Megamodel, Iterable<Entity>> _function_1 = new Function1<Megamodel, Iterable<Entity>>() {
      public Iterable<Entity> apply(final Megamodel it) {
        EList<Declaration> _declarations = it.getDeclarations();
        Iterable<Entity> _filter = Iterables.<Entity>filter(_declarations, Entity.class);
        final Function1<Entity, Boolean> _function = new Function1<Entity, Boolean>() {
          public Boolean apply(final Entity it) {
            return Boolean.valueOf(ListInstancesAction.isInstance(it, e));
          }
        };
        return IterableExtensions.<Entity>filter(_filter, _function);
      }
    };
    Iterable<Iterable<Entity>> _map_1 = IterableExtensions.<Megamodel, Iterable<Entity>>map(resolved, _function_1);
    final Iterable<Entity> subtypes = Iterables.<Entity>concat(_map_1);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("List of instances of ");
    ExtenderEObjectHoverProvider _extender = this.getExtender();
    XtextElementLinks _elementLinks = _extender.getElementLinks();
    String _createLink = _elementLinks.createLink(e);
    _builder.append(_createLink, "");
    _builder.append(": <ul>");
    {
      for(final Entity a : subtypes) {
        _builder.append("<li>");
        ExtenderEObjectHoverProvider _extender_1 = this.getExtender();
        XtextElementLinks _elementLinks_1 = _extender_1.getElementLinks();
        String _createLink_1 = _elementLinks_1.createLink(a);
        _builder.append(_createLink_1, "");
        {
          TypeReference _type = a.getType();
          EntityType _definition = _type.getDefinition();
          boolean _notEquals = (!Objects.equal(_definition, e));
          if (_notEquals) {
            _builder.append(" <a title=\"Transitive instance\">...</a>");
          }
        }
        _builder.append("</li>");
      }
    }
    _builder.append("</ul>");
    this.navigateToHTML(e, _builder);
  }
}
