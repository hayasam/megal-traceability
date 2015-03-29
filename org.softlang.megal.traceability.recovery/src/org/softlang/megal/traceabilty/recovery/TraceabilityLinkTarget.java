package org.softlang.megal.traceabilty.recovery;


import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import org.softlang.megal.Entity;

/**
 * 
 * @author maxmeffert
 *
 */
public class TraceabilityLinkTarget {

	static private String resolveURI (String uri) {
		
		if (uri.startsWith("workspace:/")) {
			
			uri = new File("..").toURI() + uri.substring("workspace:/".length());
			
			
//			uri = new File(uri).getAbsolutePath();
						
		}
				
		return uri;
		
	}
	
	private Entity entity;
	private String uri;
	
	public TraceabilityLinkTarget (Entity entity, String uri) {
		
		this.entity = entity;
		this.uri = resolveURI(uri);
		
	}
	
	public Entity getEntity() {
		return entity;
	}
	
	public String getFile() {
		return uri;
	}
	
	public String toString () {
		
		return uri;
		
	}
	
	
	
}
