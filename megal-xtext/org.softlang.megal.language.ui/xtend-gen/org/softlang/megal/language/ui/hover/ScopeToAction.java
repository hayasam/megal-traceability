package org.softlang.megal.language.ui.hover;

import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.internal.text.html.BrowserInformationControlInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.ui.editor.hover.html.IXtextBrowserInformationControl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.softlang.megal.Link;
import org.softlang.megal.MegalPlugin;
import org.softlang.megal.api.URI;
import org.softlang.megal.fragmentprovider.Evaluator;
import org.softlang.megal.language.ui.hover.ExtenderAction;
import org.softlang.megal.language.ui.hover.ExtenderEObjectHoverProvider;

@SuppressWarnings("all")
public class ScopeToAction extends ExtenderAction {
  public ScopeToAction(final ExtenderEObjectHoverProvider p, final IXtextBrowserInformationControl c) {
    super(p, c, "Navigate to link", ISharedImages.IMG_ETOOL_HOME_NAV);
  }
  
  public void update() {
    IXtextBrowserInformationControl _infoControl = this.getInfoControl();
    BrowserInformationControlInput _input = _infoControl.getInput();
    Object _inputElement = null;
    if (_input!=null) {
      _inputElement=_input.getInputElement();
    }
    this.setEnabled((_inputElement instanceof Link));
  }
  
  public void run() {
    try {
      IXtextBrowserInformationControl _infoControl = this.getInfoControl();
      BrowserInformationControlInput _input = _infoControl.getInput();
      Object _inputElement = null;
      if (_input!=null) {
        _inputElement=_input.getInputElement();
      }
      final Link e = ((Link) _inputElement);
      Evaluator _evaluator = MegalPlugin.getEvaluator();
      String _to = e.getTo();
      URI _valueOf = URI.valueOf(_to);
      final List<Object> ns = _evaluator.evaluate(_valueOf);
      for (final Object n : ns) {
        boolean _matched = false;
        if (!_matched) {
          if (n instanceof IMember) {
            _matched=true;
            ICompilationUnit _compilationUnit = ((IMember)n).getCompilationUnit();
            IEditorPart _openInEditor = JavaUI.openInEditor(_compilationUnit);
            JavaUI.revealInEditor(_openInEditor, ((IJavaElement) n));
          }
        }
        if (!_matched) {
          if (n instanceof IFile) {
            _matched=true;
            IWorkbench _workbench = PlatformUI.getWorkbench();
            IWorkbenchWindow _activeWorkbenchWindow = _workbench.getActiveWorkbenchWindow();
            IWorkbenchPage _activePage = _activeWorkbenchWindow.getActivePage();
            IDE.openEditor(_activePage, ((IFile)n));
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
