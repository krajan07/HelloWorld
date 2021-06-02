package test;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int age = 25;
		
		if(age <18) {
			throw new ArithmeticException("not valid age");
		}
		else {
			System.out.println("Eligible for Voting");
			
		}
		}
		catch(ArithmeticException e) {
			
			System.out.println("ERROR: Not Valid Age for Voting");
		}

	}

}
