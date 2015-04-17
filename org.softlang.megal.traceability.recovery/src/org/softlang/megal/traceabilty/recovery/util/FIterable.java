package org.softlang.megal.traceabilty.recovery.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class FIterable<T> implements Iterable<T> {
	
	abstract public FIterable<T> append (T t);
	abstract public FIterable<T> append (Iterable<T> ts);
	abstract public FIterable<T> append (FIterable<Iterable<T>> tss);
	abstract public FIterable<T> concat (FIterable<T> ts);
	abstract public FIterable<T> filter (Class<T> type);
	abstract public FIterable<T> filter (Predicate<? extends T> p);
	abstract public <R> R fold (Function<? extends T, R> f, R d);
	abstract public <R> R foldl (Function<? extends T, R> f, R d);
	abstract public <R> R foldr (Function<? extends T, R> f, R d);
	abstract public FIterable<T> apply (Consumer<? extends T> c);
	abstract public T first ();
	abstract public T last ();
	abstract public FIterable<T> tail ();
	abstract public boolean empty ();
	abstract public int size ();
	
	static public <T> FIterable<T> create () {
		
		return new FIterableImpl<T>(new ArrayList<T>());
		
	}
	
	static public <T> FIterable<T> create (Iterable<T> ts) {
		
		return new FIterableImpl<T>(ts);
		
	}
	
	static public <T> FIterable<T> create (FIterable<Iterable<T>> tss) {
		
		return new FIterableImpl<T>(tss);
		
	}
		
	static private class FIterableImpl<T> extends FIterable<T> {

		private Iterable<T> ts;
		
		private FIterableImpl (Iterable<T> ts) {
			
			this.append(ts);
			
		}
		
		private FIterableImpl (FIterable<Iterable<T>> tss) {
			
			this.append(tss);
			
		}
		
		
		@Override
		public Iterator<T> iterator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public FIterable<T> append(Iterable<T> ts) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public T first() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public T last() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public FIterable<T> tail() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public FIterable<T> append(T t) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public FIterable<T> filter(Class<T> type) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public FIterable<T> filter(Predicate<? extends T> p) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public FIterable<T> apply(Consumer<? extends T> c) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean empty() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public FIterable<T> append(FIterable<Iterable<T>> tss) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public FIterable<T> concat(FIterable<T> ts) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <R> R fold(Function<? extends T, R> f, R d) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <R> R foldl(Function<? extends T, R> f, R d) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <R> R foldr(Function<? extends T, R> f, R d) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		
	}
	
}
