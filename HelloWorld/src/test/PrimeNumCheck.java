package test;

import java.util.Scanner;

public class PrimeNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input;
		//Getting user input
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Please enter a number ");
			input = scan.nextInt();
			scan.close();
		}
		
		
		if (input > 1) 
		{
		boolean flag = false;
	    for (int i = 2; i <= input / 2; ++i) {
	      if (input % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(input + " is a prime number.");
	    else
	      System.out.println(input + " is not a prime number.");
		}
		else
		{
			System.out.println("Enter number greater than 1");
		}
	}
}
