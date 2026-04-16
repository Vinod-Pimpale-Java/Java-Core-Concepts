package com.propertyFiles;
//From Java Code to save data to .proprtyFiles
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutPutStream {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Revision.Vishal.properties");
			String s = "Hi Welcome Vinod To Infosys";
			byte b[] = s.getBytes();
			fos.write(b);
			fos.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
