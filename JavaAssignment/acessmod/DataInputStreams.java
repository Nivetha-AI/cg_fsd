package acessmod;

import java.io.FileInputStream;
import java.io.DataInputStream;
public class DataInputStreams {
public static void main(String[] args) {
	  try {
          
          DataInputStream din = new DataInputStream(new FileInputStream("C:\\Users\\NTHIYAGA\\Documents\\sample.txt"));
          
        
          int intValue = din.readInt();       
          double doubleValue = din.readDouble(); // Read a double
          boolean booleanValue = din.readBoolean(); // Read a boolean
          String stringValue = din.readUTF();  // Read a UTF string
          
          // Print the data read from the file
          System.out.println("Integer Value: " + intValue);
          System.out.println("Double Value: " + doubleValue);
          System.out.println("Boolean Value: " + booleanValue);
          System.out.println("String Value: " + stringValue);
          
          // Close the DataInputStream after use
          din.close();
          
      } catch (Exception e) {
          e.printStackTrace();  // Print any error if occurs
      }
}
}
