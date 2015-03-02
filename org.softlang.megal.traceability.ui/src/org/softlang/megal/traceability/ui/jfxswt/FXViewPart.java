package org.softlang.megal.traceability.ui.jfxswt;

import javafx.embed.swt.FXCanvas;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

/**
 * 
 * @author maxmeffert
 *
 */
public abstract class FXViewPart extends ViewPart {
	
	abstract protected void createFXScene (FXCanvas fxCanvas);
	
	private FXCanvas fxCanvas;
	
	/**
	 * 
	 */
	@Override
	final public void createPartControl(Composite parent) {
		
		fxCanvas = new FXCanvas(parent, SWT.NONE);
	
		createFXScene(fxCanvas);
		
	}
	
	/**
	 * 
	 */
	@Override
	final public void setFocus() {
		
		fxCanvas.setFocus();
		
		setFXFocus();
		
	}
	
	/**
	 * 
	 */
	protected void setFXFocus () {
		
		// stub method, maybe overridden or not
		
	}
}
