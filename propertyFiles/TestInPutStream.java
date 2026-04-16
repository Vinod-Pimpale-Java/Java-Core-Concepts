package com.propertyFiles;
//Data Taken from .properties to java
import java.io.FileInputStream;

import java.util.Properties;

public class TestInPutStream {
	public static void main(String[] args) {
		try {
			// Locate the properties file
			FileInputStream fis = new FileInputStream("C:\\Revision\\My Practices\\Revision\\JavaCoreConcepts.Vishal.txt");
			
			Properties p = new Properties();
			// Loding properties file using load
			p.load(fis);
			// get data using getproperty
			String About = p.getProperty("About");
			System.out.println("ABout Vishal>>>" + About);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
