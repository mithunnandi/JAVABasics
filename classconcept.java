package JavaBasics;

public class classconcept {
	//class variables
	int model;
	int wheels;
	
	public static void main(String args[])
	{//new classconcept()- is the object of classconcept class
		//c,d,e- are representing the object-object references
		//new keyword is used to create the object.
		//classconcept()-constructor
classconcept c=new classconcept();
classconcept d=new classconcept();
classconcept e=new classconcept();
c.model=204;
c.wheels=4;
d.model=204;
d.wheels=4;
e.model=204;
e.wheels=4;
System.out.println(c.model);
System.out.println(c.wheels);
System.out.println(d.model);
System.out.println(d.wheels);
System.out.println(e.model);
System.out.println(e.wheels);

	}

}
