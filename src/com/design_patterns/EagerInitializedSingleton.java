package com.design_patterns;

public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton SINGLETON = new EagerInitializedSingleton();

	private EagerInitializedSingleton() {

	}

	public static EagerInitializedSingleton getInstance() {
		return SINGLETON;
	}
}
