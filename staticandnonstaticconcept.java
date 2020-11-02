package JavaBasics;

public class staticandnonstaticconcept {
 String name="Global Vars";//non static variable
 static int age=10;// static variable
 public static void main (String args[])
		 {
	 //how to call static method and variable
	 //directly
	 mail1();
	 System.out.println(age);
	 //by classname
	// int i=staticandnonstaticconcept.age;
	 System.out.println(staticandnonstaticconcept.age);
	 staticandnonstaticconcept.mail1();
	 
	 //how to call non static methods and variables
	 staticandnonstaticconcept ob= new staticandnonstaticconcept();
	 System.out.println(ob.name);
	 ob.mail();
	 
	 //Can we access static methods by using objeect reference?? YES
	 ob.mail1();//but it displays a warning message
	 
	 
	 
	 
		 }
 
 public void mail()
 {
	 System.out.println("Mail method");
 }
 
 public static void mail1()
 {
	 System.out.println("Static method");
 }
}
