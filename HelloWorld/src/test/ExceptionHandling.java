package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 10;
		int b = 0;
		
		try 
		{
			int result = a/b;
			System.out.println("Inside Try");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Expection Handled");
		}
		
		catch(Exception e)
		{
			System.out.println("Expection Handled");

		}
		
		finally 
		{
			System.out.println("Try catch executed sucessfully");
			
		}
		
		System.out.println("After Error");
		System.out.println("Hello");
		
		
		/* int myarray[] = {1,2,3,4,5,6};
		
		try {
		System.out.println("Third Value of my array is:" + myarray[9]);
		System.out.println("Last Value of my array is:" + myarray[myarray.length-1]);
		}catch(ArrayIndexOutOfBoundsException AOB)
		{
			System.out.println("AOB Exception Handled");
		}
		System.out.println("Last Value of my array is:" + myarray[myarray.length-1]);
		 */
		
	}
	
	public void display() {
		
	}
	
	

}
