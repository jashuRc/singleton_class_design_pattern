package com.design_patterns;

public class BillPughSingleton {

	private BillPughSingleton() {
	}

	private static class SingletonHelper {
		private static final BillPughSingleton SINGLETON = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.SINGLETON;
	}

}
