package com.Inheritance;

import java.util.Scanner;

public class OneDArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of employees: ");
	
	int n=sc.nextInt();
	
	double[] salary =new double[n];
	
	System.out.println("Enter the salaries of employees:");
    for (int i = 0; i < n; i++) {
        System.out.print("Employee " + (i + 1) + ": ");
        salary[i] = sc.nextDouble();
    }
    for (int i = 0; i < n; i++) {
        System.out.println("\nEmployee " + (i + 1) + ":");
        double currentSalary = salary[i];
        
        if (currentSalary >= 30000) {
            currentSalary += currentSalary * 0.10;
            System.out.println("10% salary increment applied. New Salary: " + currentSalary);
        }
    
        if (currentSalary >= 20000) {
            currentSalary += 2000;
            System.out.println("Bonus of 2000 applied. New Salary: " + currentSalary);
        }
	
        if (currentSalary < 15000) {
            System.out.println("Improve salary for better performance.");
        }
        
        double hra = currentSalary * 0.10; 
        double ta = currentSalary * 0.10;  
        double da = currentSalary * 0.08;  
 
	 double totalsalary=currentSalary+hra+ta+da;
	 
	 System.out.println("HRA: "+hra);
	 System.out.println("TA: "+ta);
	 System.out.println("DA: "+da);
	 System.out.println("Total salary: "+totalsalary);
	 
	 salary[i] = totalsalary; 
    }
	 
	 
	 
	 

}
}