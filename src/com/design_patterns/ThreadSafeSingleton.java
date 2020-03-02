package com.design_patterns;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton threadSafeSingleton = null;

	private ThreadSafeSingleton() {
	}

//	The following code snippet provides the double-checked locking implementation.
	public static ThreadSafeSingleton getInstance() {
		if (threadSafeSingleton == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (threadSafeSingleton == null) {
					threadSafeSingleton = new ThreadSafeSingleton();
				}
			}
		}
		return threadSafeSingleton;
	}
}
