package acessmod;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Readandwritedemo {

	public static void main(String[] args) throws IOException {
		try {
			Reader read1 =new FileReader("C:\\Users\\NTHIYAGA\\Documents\\sample.txt");
			int data=read1.read();
			while(data!=-1) {
				System.out.println((char)data);
				data=read1.read();
				}
			System.out.println("\n");
			System.out.println("Does sample.txt support mark operation: "+read1.markSupported());
			read1.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
