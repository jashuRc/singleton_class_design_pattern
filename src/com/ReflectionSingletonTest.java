package com;

import java.lang.reflect.Constructor;

import com.design_patterns.EagerInitializedSingleton;

//code to create multiple object of singleton class
public class ReflectionSingletonTest {
	public static void main(String[] a) {
		System.out.println("calling static method to get instance...");

		EagerInitializedSingleton eagerInitializedSingleton1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton eagerInitializedSingleton2 = null;

		try {
			Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				eagerInitializedSingleton2 = (EagerInitializedSingleton) constructor.newInstance();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("checking both object...");
		System.out.println("hashcode return value:" + eagerInitializedSingleton1.hashCode());
		System.out.println("hashcode return value:" + eagerInitializedSingleton2.hashCode());

	}
}
