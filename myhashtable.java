package JavaBasics;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class myhashtable {
	//Hashtable is synchronised--sequential threading
	//Stores the value on the basis of key-value format
	//even if duplicate entries are made it will display only one value in console
	//

	public static void main(String[] args) {
		Hashtable h = new Hashtable();// Hasthtable is class
		h.put("A", "A1 value");// put is the method
		h.put("B", "B1 value");
		h.put("C", "C1 value");
		//h.put(null, "C1 value");--gives null pointer exception
		System.out.println(h.size());
		h.put(1, "value 100");
		h.put(3, 400);
		System.out.println(h.get("B"));
		System.out.println(h.get(3));
	System.out.println(h);
	//get the hashcode of hashtable object
	System.out.println(h.hashCode());
	//create a clone
	Hashtable c = new Hashtable();
	c=(Hashtable)h.clone();
	System.out.println(c);

		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		h1.put(1, 990);
		h1.put(2, 9900);
		System.out.println(h1);
		
		if(h1.containsValue(990)) { System.out.println("value is there");}

		Hashtable<String, Integer> h2 = new Hashtable<String, Integer>();
		h2.put("TOM", 990);
		
		//Check if both the hashtables h1 and h2 are equal
		if(h2.equals(h1))
			{System.out.println("both are equal");}
		else {System.out.println("Not equal");}

		
		//print all the elements from hashtable using enumeration
		Enumeration e=h.elements();
		System.out.println("print all values using enumeration");
		while(e.hasMoreElements())
		{System.out.println(e.nextElement());}
	
	//get all the values from hashtable using entryset()
		System.out.println("print all values using entry set");
		Set s=h.entrySet();
		System.out.println(s);
		
		
		
		
	
	}
	

}
