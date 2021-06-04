package oopsConcept;

public class MethodOverloading {

	public void add(int a, int b) {
		int sum = a+b;
		System.out.println("Integer Sum:" + sum);
		}
	
	public void add(double a, double b) {
		double sum = a+b;
		System.out.println("Double Sum" + sum);
	}

}
