package oopsConcept;

import test.ExceptionHandling;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	ClassA Emp1 = new ClassA(100,"abc","xyz");
			
			Emp1.Display();
			
			System.out.println("******");
			
			/*ClassA Emp2 = new ClassA();
		
		    Emp2.EName = "Krishnaveni";
			Emp2.Salary = 15000 ;
			Emp2.OrgName = "Heal";
			
			Emp2.Display();*/
			
		/* 	ClassB Obj1 = new ClassB();
			Obj1.EName = "NewComp";
			Obj1.show();
			Obj1.Display();
			
			ClassC Obj2 = new ClassC();
			Obj2.run(); */
			
		/* MethodOverloading obj3 = new MethodOverloading();
		
		obj3.add(1,2);
		obj3.add(1, 8.4);*/
		
		/*MethodOverrideChild Obj4 = new MethodOverrideChild();
		Obj4.display();
		
		MethodOverrideParent Obj5 = new MethodOverrideParent();
		Obj5.display();*/
		
		/* AbstractChild Obj5 = new AbstractChild();
		Obj5.method2(); */
		
		EncapsulationExample Obj7 = new EncapsulationExample();
			Obj7.setSalary(1000);
			System.out.println(Obj7.getSalary());
		}
	}
