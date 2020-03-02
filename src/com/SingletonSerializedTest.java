package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.design_patterns.SerializedSingleton;

public class SingletonSerializedTest {

	private static final String FILE_NAME = "filename.ser";

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		System.out.println("Singleton Serialized");
		System.out.println("calling static method to get instance...");
		SerializedSingleton serializedSingleton1 = SerializedSingleton.getInstance();
		System.out.println("writing object to file...");
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
		out.writeObject(serializedSingleton1);
		out.close();

		// deserailize from file to object
		ObjectInput in = new ObjectInputStream(new FileInputStream(FILE_NAME));
		SerializedSingleton serializedSingleton2 = (SerializedSingleton) in.readObject();

		in.close();

		System.out.println("serializedSingleton1 hashCode=" + serializedSingleton1.hashCode());
		System.out.println("serializedSingleton2 hashCode=" + serializedSingleton2.hashCode());
	}

}
