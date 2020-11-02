package JavaBasics;

public class TestClass {

	public static void main(String[] args) {
		//Static polymorphism/compile time polymmorphism
		//At the time of compilation Java will	decide which method is to be called when methods have same name in parent and child class
		MahindraChildClass m= new MahindraChildClass();
		m.start();
		m.OffRoad();
		m.Stops();
		m.runs();
		m.engine();
		
		System.out.println("***********");
		CarParentClass c= new CarParentClass();
		c.start();
		c.Stops();
		c.runs();
		c.engine();
		
		
		System.out.println("******");
		//Top Casting
		CarParentClass c1=new MahindraChildClass();//Child class object referred by parent class reference variable-dynamic polymorphism
		
		c1.start();
		c1.runs();
		c1.Stops();
		
		
		//Down casting-degrading the cast of parent into child class object referred by child class reference variable
	MahindraChildClass m1= (MahindraChildClass)new CarParentClass(); //Class cast exception in runtime

	}

}
