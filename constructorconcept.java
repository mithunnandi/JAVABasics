package JavaBasics;
//constructor can be overloaded
//default constructor--called immediately once the object for the class is created
public class constructorconcept {

	public static void main(String[] args) {
		constructorconcept cc=new constructorconcept();//calling default cons.
		constructorconcept cc1=new constructorconcept(10);
		constructorconcept cc2=new constructorconcept(10,20);
	}

	public constructorconcept() 
	{System.out.println("default cons.");}
	
	public constructorconcept(int i)
	{System.out.println("one parameter cons.");
	System.out.println(i);}
	
	public constructorconcept(int i,int k)
	{System.out.println("two parameter cons.");
	System.out.println(i+k);}
}
