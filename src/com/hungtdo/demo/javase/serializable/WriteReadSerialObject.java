package com.hungtdo.demo.javase.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriteReadSerialObject {

	private static final String FILE_NAME = "test.txt";
	
	private void serializableObject(Object obj) {
		//Write object serialization to file
		try {
			FileOutputStream fos = new FileOutputStream(FILE_NAME);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.flush();
			oos.close();
			System.out.println("Write success");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private SanrioEntity readSanrioObjFromFile(String filePath) {
		try {
			//Deserialization object
			FileInputStream fis = new FileInputStream(filePath);
			ObjectInputStream ois = new ObjectInputStream(fis);
			SanrioEntity obj = (SanrioEntity) ois.readObject();
			ois.close();
			return obj;
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		SanrioEntity obj = new SanrioEntity("http:abc.com", "My title", "My content", "abc.com", -1212);
		obj.setmLinks(new Links("https://test.com.vn", "Test title"));
		obj.setAvatar(1);
		WriteReadSerialObject main = new WriteReadSerialObject();
		main.serializableObject(obj);
		
		SanrioEntity sanrioObj = main.readSanrioObjFromFile(FILE_NAME);
		Links link = sanrioObj.getmLinks();
		System.out.println("My Links: " + link.getHref());
		System.out.println(sanrioObj.toString());
	}
}
