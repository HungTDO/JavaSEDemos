package com.hungtdo.demo.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectCopier {
	
	private ObjectCopier(){}
	
	/**
	 * 
	 * */
	public static Object copy(Object obj){
		if(obj == null) return null;
		try{
			//Serializable object to bytes array
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(obj);
			
			byte [] arrays = baos.toByteArray();
			
			//DeSerializable object to copy a Object
			ByteArrayInputStream bais = new ByteArrayInputStream(arrays);
			ObjectInputStream ois = new ObjectInputStream(bais);
			return ois.readObject();
		}catch(Exception e){
			throw new RuntimeException("Error when copying object");
		}
	}
}
