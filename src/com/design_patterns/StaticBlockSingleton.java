package com.design_patterns;

public class StaticBlockSingleton {

	private static StaticBlockSingleton staticBlockSingleton;

	private StaticBlockSingleton() {
	}

	static {
		try {
			staticBlockSingleton = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception in creating object...");
		}
	}

	public static StaticBlockSingleton getInstance() {
		return staticBlockSingleton;
	}

}
