package com.design_pattern;

public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton SINGLETON = new EagerInitializedSingleton();

	private EagerInitializedSingleton() {

	}

	public static EagerInitializedSingleton getInstance() {
		return SINGLETON;
	}
}
