package org.softlang.megal.traceabilty.recovery.util;

import com.google.common.base.Function;

public abstract class FIterable<T> implements Iterable<T> {

	abstract public FIterable<T> create (Iterable<T> ts);
	abstract public FIterable<T> append (Iterable<T> ts);
	abstract public <R> FIterable<R> apply (Function<? extends T, R> fn);
	
	
}
