package org.softlang.megal.language.ui.hover;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.jface.internal.text.html.BrowserInformationControlInput;
import org.eclipse.ui.ISharedImages;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.editor.hover.html.IXtextBrowserInformationControl;
import org.eclipse.xtext.ui.editor.hover.html.XtextElementLinks;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.softlang.megal.EntityType;
import org.softlang.megal.EntityTypeReference;
import org.softlang.megal.TypeReference;
import org.softlang.megal.TypeReferences;
import org.softlang.megal.api.ElementSet;
import org.softlang.megal.language.ui.hover.ExtenderAction;
import org.softlang.megal.language.ui.hover.ExtenderEObjectHoverProvider;

@SuppressWarnings("all")
public class ListSubtypesAction extends ExtenderAction {
  public ListSubtypesAction(final ExtenderEObjectHoverProvider p, final IXtextBrowserInformationControl c) {
    super(p, c, "List subtypes", ISharedImages.IMG_ELCL_COLLAPSEALL);
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
    final ElementSet<EntityType> q = new ElementSet<EntityType>(EntityType.class);
    EntityTypeReference _singleRef = TypeReferences.singleRef(e);
    Iterable<TypeReference> _latticeBelow = _singleRef.latticeBelow();
    final Function1<TypeReference, EntityType> _function = new Function1<TypeReference, EntityType>() {
      public EntityType apply(final TypeReference it) {
        return it.getDefinition();
      }
    };
    Iterable<EntityType> _map = IterableExtensions.<TypeReference, EntityType>map(_latticeBelow, _function);
    Iterables.<EntityType>addAll(q, _map);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("List of subtypes of ");
    ExtenderEObjectHoverProvider _extender = this.getExtender();
    XtextElementLinks _elementLinks = _extender.getElementLinks();
    String _createLink = _elementLinks.createLink(e);
    _builder.append(_createLink, "");
    _builder.append(": <ul>");
    {
      for(final EntityType a : q) {
        _builder.append("<li>");
        ExtenderEObjectHoverProvider _extender_1 = this.getExtender();
        XtextElementLinks _elementLinks_1 = _extender_1.getElementLinks();
        String _createLink_1 = _elementLinks_1.createLink(a);
        _builder.append(_createLink_1, "");
        {
          TypeReference _supertype = a.getSupertype();
          EntityType _definition = _supertype.getDefinition();
          boolean _notEquals = (!Objects.equal(_definition, e));
          if (_notEquals) {
            _builder.append(" <a title=\"Transitive subtype\">...</a>");
          }
        }
        _builder.append("</li>");
      }
    }
    _builder.append("</ul>");
    this.navigateToHTML(e, _builder);
  }
}
