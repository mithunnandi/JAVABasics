package JavaBasics;

public class EmployeeUserDefinedClass {
	
	  String name; int age; char gender;
	  
	 
	EmployeeUserDefinedClass(String name, int age, char gender) {

		this.name=name ;//this .global variable =local variable
		this.age = age;
		this.gender = gender;

	}
}
