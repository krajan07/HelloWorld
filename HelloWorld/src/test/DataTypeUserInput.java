package test;

import java.util.Scanner;

public class DataTypeUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		String name;	
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter Your Name:");
			name = scanner.nextLine();
		}
		
		System.out.println("Hello! " + name);
		System.out.println("Length " + name.length());
		System.out.println("Name in Caps:  " + name.toUpperCase());

	}

}
