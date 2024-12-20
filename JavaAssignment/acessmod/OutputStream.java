package acessmod;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
public static void main(String[] args) {
	try {
        String filepath = "C:\\Users\\NTHIYAGA\\Documents\\sample.txt";
        
        
        FileOutputStream fos = new FileOutputStream(filepath);
           
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        
        String data = "Hello, this is a test for OutputStream in Java!";
        
       
        bos.write(data.getBytes());
        
       
        bos.flush();
        
        System.out.println("Data written to the file successfully!");
        
        
        bos.close();
    } catch (IOException e) {
        e.printStackTrace(); 
    }
}
}

