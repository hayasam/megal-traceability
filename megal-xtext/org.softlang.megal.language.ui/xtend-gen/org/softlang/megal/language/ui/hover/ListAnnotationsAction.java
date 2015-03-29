package org.softlang.megal.language.ui.hover;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.internal.text.html.BrowserInformationControlInput;
import org.eclipse.ui.ISharedImages;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.editor.hover.html.IXtextBrowserInformationControl;
import org.softlang.megal.Annotation;
import org.softlang.megal.EntityType;
import org.softlang.megal.language.ui.hover.ExtenderAction;
import org.softlang.megal.language.ui.hover.ExtenderEObjectHoverProvider;

@SuppressWarnings("all")
public class ListAnnotationsAction extends ExtenderAction {
  public ListAnnotationsAction(final ExtenderEObjectHoverProvider p, final IXtextBrowserInformationControl c) {
    super(p, c, "List annotations", ISharedImages.IMG_ELCL_SYNCED);
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
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul>");
    {
      EList<Annotation> _annotations = e.getAnnotations();
      for(final Annotation a : _annotations) {
        _builder.append("<li>");
        String _key = a.getKey();
        _builder.append(_key, "");
        _builder.append(" := ");
        String _value = a.getValue();
        _builder.append(_value, "");
        _builder.append("</li>");
      }
    }
    _builder.append("</ul>");
    this.navigateToHTML(e, _builder);
  }
}
