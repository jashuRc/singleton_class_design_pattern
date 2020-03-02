package com.design_patterns;

public class LazyInitializedSingleton {

	private static LazyInitializedSingleton lazyInitializedSingleton = null;

	private LazyInitializedSingleton() {

	}

	public static LazyInitializedSingleton getInstance() {
		if (lazyInitializedSingleton == null) {
			lazyInitializedSingleton = new LazyInitializedSingleton();
		}
		return lazyInitializedSingleton;
	}
}
