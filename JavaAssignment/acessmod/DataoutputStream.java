package acessmod;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataoutputStream {
public static void main(String[] args) {
	try {
		DataOutputStream dout=new DataOutputStream(new FileOutputStream("C:\\Users\\NTHIYAGA\\Documents\\sample.txt"));
		dout.writeInt(123);
		dout.writeDouble(123.2345);
		dout.writeBoolean(true);
		dout.writeUTF("Hello!");
		System.out.println("data writtensuccesssss");
		
	}
	catch(Exception e) {
		
	}


}
}
