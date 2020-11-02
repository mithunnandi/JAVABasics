package JavaBasics;

public class thisconcept {
	//class variables
	String name;
	int age;
	

	public static void main(String[] args) {
		thisconcept tc=new thisconcept("tom",20);
		// TODO Auto-generated method stub

	}
 public thisconcept(String name,int age)
 {		//global variable = local variable
	 //intialise global variable with local variable of cons.
	 this.name=name;
	this.age=age;
	 System.out.println(name);
	 System.out.println(age);
 }
 {}
}
