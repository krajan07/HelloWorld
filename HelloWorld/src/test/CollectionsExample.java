package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//----ARRAY LIST----//
		
		/*ArrayList<String> myList = new ArrayList<String>();
		
		myList.add("Sid");
		myList.add("Siva");
		myList.add("Krish");
		myList.add("Rishi");
		
		System.out.println("Collections" + myList);
		
		myList.add("Family");
		System.out.println("Before Sorting");
		System.out.println("Collections" + myList);
		Collections.sort(myList) ;
		System.out.println("Sorted Collections Object : " + myList);
		
		Collections.sort(myList, Collections.reverseOrder()) ;
		System.out.println("Reverse Sorted Collections Object : " + myList);

		ArrayList<Object> myList1 = new ArrayList<Object>();
		
		myList1.add("Krish");
		myList1.add("Siva");
		myList1.add("Rishi");
		myList1.add(100);
		
		System.out.println("Before Sorting");
		System.out.println("Collections Object : " + myList1);*/
		
		//----STACK---//
		
		Stack<String> sList = new Stack<String>();
		sList.push("a");
		sList.push("b");
		sList.push("c");
		sList.push("d");
		System.out.println("Stack Data : " + sList);
		sList.pop();
		sList.push("ABCD");
		
		System.out.println("Stack Data With Poped & Pushed : " + sList);
		
	}

}
