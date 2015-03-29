package org.softlang.megal.language.ui.hover;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.internal.text.html.BrowserInformationControlInput;
import org.eclipse.jface.internal.text.html.HTMLPrinter;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.IInputChangedListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.ui.editor.hover.html.IXtextBrowserInformationControl;
import org.eclipse.xtext.ui.editor.hover.html.XtextBrowserInformationControlInput;
import org.eclipse.xtext.xbase.lib.Extension;
import org.softlang.megal.language.ui.hover.ExtenderEObjectHoverProvider;

/**
 * An abstract action for the XText browser information control
 */
@SuppressWarnings("all")
public abstract class ExtenderAction extends Action {
  private ExtenderEObjectHoverProvider extender;
  
  public ExtenderEObjectHoverProvider getExtender() {
    return this.extender;
  }
  
  /**
   * Control holding the action
   */
  private final IXtextBrowserInformationControl infoControl;
  
  public IXtextBrowserInformationControl getInfoControl() {
    return this.infoControl;
  }
  
  /**
   * <p>Constructs the action</p>
   * @param infoControl The control holding the action
   * @param text The initial text of the action
   * @param image The initial enabled image of the action
   * @param imageDisabled The initial disabled image of the action
   */
  public ExtenderAction(final ExtenderEObjectHoverProvider extender, final IXtextBrowserInformationControl infoControl, final String text, final String image, final String imageDisabled) {
    this.extender = extender;
    this.infoControl = infoControl;
    IWorkbench _workbench = PlatformUI.getWorkbench();
    @Extension
    final ISharedImages images = _workbench.getSharedImages();
    this.setText(text);
    ImageDescriptor _imageDescriptor = images.getImageDescriptor(image);
    this.setImageDescriptor(_imageDescriptor);
    ImageDescriptor _imageDescriptor_1 = images.getImageDescriptor(imageDisabled);
    this.setDisabledImageDescriptor(_imageDescriptor_1);
    this.update();
    final IInputChangedListener _function = new IInputChangedListener() {
      public void inputChanged(final Object it) {
        ExtenderAction.this.update();
      }
    };
    infoControl.addInputChangeListener(_function);
  }
  
  public ExtenderAction(final ExtenderEObjectHoverProvider extender, final IXtextBrowserInformationControl infoControl, final String text, final String image) {
    this(extender, infoControl, text, image, (image + "_DISABLED"));
  }
  
  public abstract void update();
  
  protected void navigateToHTML(final EObject element, final CharSequence s) {
    final StringBuffer buffer = new StringBuffer(s);
    String _styleSheet = this.extender.getStyleSheet();
    HTMLPrinter.insertPageProlog(buffer, 0, _styleSheet);
    HTMLPrinter.addPageEpilog(buffer);
    final String html = buffer.toString();
    BrowserInformationControlInput _input = this.infoControl.getInput();
    ILabelProvider _labelProvider = this.extender.getLabelProvider();
    XtextBrowserInformationControlInput _xtextBrowserInformationControlInput = new XtextBrowserInformationControlInput(
      ((XtextBrowserInformationControlInput) _input), element, html, _labelProvider);
    this.infoControl.setInput(_xtextBrowserInformationControlInput);
  }
}
