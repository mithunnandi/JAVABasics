package JavaBasics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class myarraylist {
//dynamic array-ArrayList
	// can create duplicate values/elements
	// Maintains insertion order as per the element declared.
	//not synochronised-slow compared to other collections
	

	public static <E> void main(String args[]) {// non generic arraylist
		ArrayList a = new ArrayList();
		a.add(100);// 0
		a.add("String");// 1
		a.add('A');// 2
		a.add("String");// 3
		a.add(true);// 4//boolean

		// a.remove(2);//remove element at index 2

		System.out.println(a.size());
		
		System.out.println(a.get(1));
//to print all the values in Arraylist
		//1.For loop
	 //2.Iterator
		
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
//traversing through the elemnts in an arraylist using java 8 lambda
		System.out.println("Printing with lambda");
		
		a.forEach(b->{System.out.println(b);});
		
//traversing through the elemnts in an arraylist using java 8 lambda and forEach		
System.out.println("Printing with lambda and foreach");
		Iterator ite=a.iterator();
		ite.forEachRemaining(b->{System.out.println(b);});
		
//To traverse in both the directions  Listiterator	
		
		ArrayList<String> ar9 = new ArrayList<String>();
		ar9.add("String");
		ar9.add("String1");
		ar9.add("String2");
		System.out.println("******Traversing backwards using list iterator*******");
		
		ListIterator<String> ran=ar9.listIterator(ar9.size());
		while(ran.hasPrevious())
		{ String e=ran.previous();
		System.out.println(e);}
		
		
	
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(1, 100);
		a1.add(2, 56);// IF indexes are mentioned they should in ascending order
		a1.add(3, 560);
		a1.set(0, 987); // setting the value for a index
		for (int j = 0; j < a1.size(); j++) {
			System.out.println(a1.get(j));
		}

		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("String");
		
		//How to store USer defined class objects in Arraylist*********
		// EmployeeUserDefinedClass class objects
		EmployeeUserDefinedClass u1 = new EmployeeUserDefinedClass("Peter", 21, 'm');
		EmployeeUserDefinedClass u2 = new EmployeeUserDefinedClass("Pet", 26, 'm');
		EmployeeUserDefinedClass u3 = new EmployeeUserDefinedClass("Pe", 29, 'm');
		
		ArrayList<EmployeeUserDefinedClass> al1 = new ArrayList<EmployeeUserDefinedClass>();
		al1.add(u1);
		al1.add(u2);
		al1.add(u3);
		
		System.out.println(al1.size());
		// Iterator to tranverse the values
		Iterator<EmployeeUserDefinedClass> it = al1.iterator();
		while (it.hasNext()) {
			EmployeeUserDefinedClass emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.gender);
		}
		//addAll() method
	System.out.println("*****AddALL()****");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("String");
		ar2.add("String1");
		ar2.add("String2");
		ArrayList<String> ar12 = new ArrayList<String>();
		ar12.add("String12");
		ar12.add("String112");
		ar12.add("String212");
		
		ar2.addAll(ar12);
		
		for (int k=0;k<ar2.size();k++)
		{System.out.println(ar2.get(k));}
		System.out.println("*****removeall()****");
		ar2.removeAll(ar12);
		for (int k=0;k<ar2.size();k++)
		{System.out.println(ar2.get(k));}
		
		
		System.out.println("*****Retainall()****");//to get the common value in arraylist
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("String");
		ar.add("String1");
		ar.add("String2");
		ArrayList<String> ar123 = new ArrayList<String>();
		ar123.add("String");
		ar123.add("String112");
		ar123.add("String212");
		ar.retainAll(ar123);
		for (int k=0;k<ar.size();k++)
		{System.out.println(ar.get(k));}

	}

}
