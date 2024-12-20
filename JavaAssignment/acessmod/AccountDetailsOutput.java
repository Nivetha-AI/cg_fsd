package acessmod;


import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.Console;
import java.io.IOException;
 
public class AccountDetailsOutput {
 
    public static void main(String[] args) {
        // Get the console object to read input from the user
        Console console = System.console();
 
        if (console == null) {
            System.out.println("No console available");
            return;
        }
 
        try {
            // Prompt and read user input from the console
            String phoneNumber = console.readLine("Enter your phone number: ");
            String amountStr = console.readLine("Enter the amount: ");
            String accountKey = console.readLine("Enter your account key: ");
            
            // Convert amount to double
            double amount = Double.parseDouble(amountStr);
            
            // Create a DataOutputStream to write the data to a file
            DataOutputStream dout = new DataOutputStream(new FileOutputStream("accountDetails.dat"));
            
            // Write data to the file
            dout.writeUTF(phoneNumber);   // Write phone number as a UTF string
            dout.writeDouble(amount);     // Write amount as a double
            dout.writeUTF(accountKey);    // Write account key as a UTF string
            
            System.out.println("Account details written successfully.");
            
            // Close the DataOutputStream
            dout.close();
            
        } catch (IOException e) {
            System.out.println("An error occurred while writing data: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount format. Please enter a valid number.");
        }
    }
}
 
 