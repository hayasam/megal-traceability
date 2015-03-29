package org.softlang.megal.language.ui.hover;

import com.google.common.base.Objects;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.hover.html.XtextElementLinks;
import org.softlang.megal.language.ui.hover.ExtenderPresentationControlCreator;

@SuppressWarnings("all")
public abstract class ExtenderEObjectHoverProvider extends DefaultEObjectHoverProvider {
  private ExtenderPresentationControlCreator controlCreator = null;
  
  public IInformationControlCreator getInformationPresenterControlCreator() {
    boolean _equals = Objects.equal(this.controlCreator, null);
    if (_equals) {
      ExtenderPresentationControlCreator _extenderPresentationControlCreator = new ExtenderPresentationControlCreator(this);
      this.controlCreator = _extenderPresentationControlCreator;
      this.addActions(this.controlCreator);
    }
    return this.controlCreator;
  }
  
  protected Object addActions(final ExtenderPresentationControlCreator p) {
    return null;
  }
  
  public ILabelProvider getLabelProvider() {
    return super.getLabelProvider();
  }
  
  public String getStyleSheet() {
    return super.getStyleSheet();
  }
  
  public XtextElementLinks getElementLinks() {
    return super.getElementLinks();
  }
}
