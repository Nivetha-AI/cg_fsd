package acessmod;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadFile {
public static void main(String[] args) {
	try {
		FileInputStream fis= new FileInputStream("C:\\Users\\nthiyaga\\Downloads\\home.css");
		int value =fis.read();
		System.out.println("reading a vaule in byte from"+value);
		System.out.println((char)value);
		fis.close();
		///
		String path="C:\\Users\\nthiyaga\\Documents\\sample.txt";
		FileOutputStream fos=new FileOutputStream(path);
		String content="Hello this is java ";
		fos.write(content.getBytes());
		System.out.println("Data writen successfully");
		
	}
	catch(Exception e){
		System.out.println(e);
	}
}
}
