package test;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowsExample exmp1 = new ThrowsExample();
		try {
		exmp1.elgibiity(16);
		}
		catch(ArithmeticException e) {
			
			System.out.println("ERROR: Not Valid Age for Voting");
		}
	}

	
	public void elgibiity(int age) throws ArithmeticException
	{
		if(age <18) {
			throw new ArithmeticException("not valid age");
		}
		else {
			System.out.println("Eligible for Voting");
			
		}
	}
}
