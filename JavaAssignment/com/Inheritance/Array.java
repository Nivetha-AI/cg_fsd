package com.Inheritance;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of subjects: ");
		int n = sc.nextInt();
		int[] marks = new int[n];
		int total = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Subject " + (i + 1) + ": ");
			marks[i] = sc.nextInt();
			total += marks[i];

		}
		System.out.println("Total marks: " + total);
		float percentage =total/n;
		System.out.println("percentage: "+percentage+"%");
	}

}
