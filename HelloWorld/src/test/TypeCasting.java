package test;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		//Implicit Type casting - byte > short > int > long > float > double
		
		
		char a = 'a';
		int b = 'b';
		char c = 48;
		System.out.println("Value:" + a);
		System.out.println("Value:" + b);
		System.out.println("Value:" + c);
		
		
		//Explicit Type casing - double > float > long > int > short > byte
		
		double num = 45.5;
		int num1 = (int) num;
		System.out.println("Value:" + num);
		System.out.println("Value:" + num1);
		
		//Check
		int num2 = 45;
		double num3 = num2;
		System.out.println("Value num2:" + num2);
		System.out.println("Value num3:" + num3);
		
	}

}
