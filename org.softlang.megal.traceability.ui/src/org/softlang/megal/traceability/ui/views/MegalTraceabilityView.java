package org.softlang.megal.traceability.ui.views;

import java.io.IOException;

import javafx.embed.swt.FXCanvas;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import org.softlang.megal.traceability.ui.jfxswt.FXViewPart;


public class MegalTraceabilityView extends FXViewPart {
		
	@Override
	protected void createFXScene(FXCanvas fxCanvas) {
		
				
		try {
			
			Parent p = FXMLLoader.load(this.getClass().getResource("./test.fxml"));
			
			Scene scene = new Scene(p);
			
			fxCanvas.setScene(scene);
			
			
		} catch (IOException e) {

			e.printStackTrace();
			
		}
		
	}
	
	
}