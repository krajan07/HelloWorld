package oopsConcept;

public class ClassA {

	public int Salary;
	public String EName;
	protected String OrgName;
	
	public ClassA() {
		System.out.println("Insider E.Constructor");
		
	}
	
	public ClassA(int val1, String val2, String val3) {
		System.out.println("Insider Constructor");
		this.Salary=val1;
		this.EName=val2;
		this.OrgName=val3;
	}
	
	
	
	public void Display() {
		
		System.out.println("Name of Employee: " + EName);
		System.out.println("Salary of Employee " + Salary);
		System.out.println("Name of Oragnaisation: " + OrgName);
	} 
	
	
	
}
