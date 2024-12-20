package com.colletions;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistDemo1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<String> empNames = new ArrayList<>();
		ArrayList<String> empAddresses = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int num = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter employee names:");
		for (int i = 0; i < num; i++) {
			System.out.print("Name " + (i + 1) + ": ");
			empNames.add(scanner.nextLine());
		}

		System.out.println("Enter employee addresses:");
		for (int i = 0; i < num; i++) {
			System.out.print("Address for " + empNames.get(i) + ": ");
			empAddresses.add(scanner.nextLine());
		}

		System.out.println("Employee Names: " + empNames);
		System.out.println("Employee Addresses: " + empAddresses);

		ArrayList<String> combinedList = new ArrayList<>(empNames);
		combinedList.addAll(empAddresses);

		System.out.println("Combined List (Names + Addresses): " + combinedList);

		// remove
		System.out.print("Enter a name or address to remove: ");
		String toRemove = scanner.nextLine();
		combinedList.remove(toRemove);
		// updated
		System.out.println("After removing the List: " + combinedList);
		// size
		System.out.println("size of te arraylist : " + combinedList.size());
		// get element at index 1
		System.out.println("Get new eleemnt which is at index 1 : " + combinedList.get(1));
		// set new element
		System.out.println("Set new eleemnt : " + combinedList.set(2, "priya"));
		System.out.println("After setting new eleemnt : " + combinedList);
		// contains
		System.out.println("Nivetha is in my list or not ?" + combinedList.contains("Nivetha"));
		scanner.close();
	}
}
