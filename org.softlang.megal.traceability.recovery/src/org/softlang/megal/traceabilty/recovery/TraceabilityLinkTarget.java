package org.softlang.megal.traceabilty.recovery;

import java.io.File;

import org.softlang.megal.Entity;

public class TraceabilityLinkTarget {

	private Entity entity;
	private File file;
	
	public TraceabilityLinkTarget (Entity entity, File file) {
		
		this.entity = entity;
		this.file = file;
		
	}
	
	public Entity getEntity() {
		return entity;
	}
	
	public File getFile() {
		return file;
	}
	
	public String toString () {
		
		return file.toURI().toString();
		
	}
	
	
	
}
