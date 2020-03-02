package com;

import com.design_patterns.BillPughSingleton;
import com.design_patterns.EagerInitializedSingleton;
import com.design_patterns.EnumSingleton;
import com.design_patterns.LazyInitializedSingleton;
import com.design_patterns.StaticBlockSingleton;
import com.design_patterns.ThreadSafeSingleton;

//main class
public class SingletonDesignPattern {

	public static void main(String[] args) {
		System.out.println("Entering SingletonDesignPattern.main()...");
		System.out.println("##########################################");
		System.out.println("1. Eager Initialization");
		System.out.println("calling static method to get instance...");
		EagerInitializedSingleton eagerInitializedSingleton1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton eagerInitializedSingleton2 = EagerInitializedSingleton.getInstance();

		System.out.println("checking both object...");
		System.out.println("hashcode return value:" + eagerInitializedSingleton1.hashCode());
		System.out.println("hashcode return value:" + eagerInitializedSingleton2.hashCode());
		System.out.println("##########################################\n\n");

		System.out.println("##########################################");
		System.out.println("2. Static Block Initialization");
		System.out.println("calling static method to get instance...");
		StaticBlockSingleton staticBlockSingleton1 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton staticBlockSingleton2 = StaticBlockSingleton.getInstance();

		System.out.println("checking both object...");
		System.out.println("hashcode return value:" + staticBlockSingleton1.hashCode());
		System.out.println("hashcode return value:" + staticBlockSingleton2.hashCode());
		System.out.println("##########################################\n\n");

		System.out.println("##########################################");
		System.out.println("3. Lazy Initialization");
		System.out.println("calling static method to get instance...");
		LazyInitializedSingleton lazyInitializedSingleton1 = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton lazyInitializedSingleton2 = LazyInitializedSingleton.getInstance();

		System.out.println("checking both object...");
		System.out.println("hashcode return value:" + lazyInitializedSingleton1.hashCode());
		System.out.println("hashcode return value:" + lazyInitializedSingleton2.hashCode());
		System.out.println("##########################################\n\n");

		System.out.println("##########################################");
		System.out.println("4. Thread Safe Singleton");
		System.out.println("calling static method to get instance...");
		ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();

		System.out.println("checking both object...");
		System.out.println("hashcode return value:" + threadSafeSingleton1.hashCode());
		System.out.println("hashcode return value:" + threadSafeSingleton2.hashCode());
		System.out.println("##########################################\n\n");

		System.out.println("##########################################");
		System.out.println("5. Bill Pugh Singleton ");
		System.out.println("calling static method to get instance...");
		BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance();
		BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();

		System.out.println("checking both object...");
		System.out.println("hashcode return value:" + billPughSingleton1.hashCode());
		System.out.println("hashcode return value:" + billPughSingleton2.hashCode());
		System.out.println("##########################################\n\n");
		
		System.out.println("##########################################");
		System.out.println("6. Enum Singleton ");
		System.out.println("calling static method to get instance...");
		EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
		EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;

		System.out.println("checking both object...");
		System.out.println("hashcode return value:" + enumSingleton1.hashCode());
		System.out.println("hashcode return value:" + enumSingleton2.hashCode());
		System.out.println("##########################################\n\n");




		System.out.println("Exiting SingletonDesignPattern.main()...");

	}

}
