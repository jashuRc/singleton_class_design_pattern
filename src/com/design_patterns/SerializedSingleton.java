package com.design_patterns;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3281344108854481913L;

	private SerializedSingleton() {
	}

	private static class SingletonHelper {
		private static final SerializedSingleton SINGLETON = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return SingletonHelper.SINGLETON;
	}

	/*
	 * The problem with serialized singleton class is that whenever we deserialize
	 * it, it will create a new instance of the class.
	 * 
	 * 
	 * So it destroys the singleton pattern, to overcome this scenario all we need
	 * to do it provide the implementation of readResolve() method.
	 * 
	 * 
	 * 
	 */
	protected Object readResolve() {
		return getInstance();
	}
}
