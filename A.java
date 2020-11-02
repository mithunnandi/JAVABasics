package JavaBasics;

public class A {
	
	public A()
	{System.out.println("Parent class cons");}

	public A(int i)
	{System.out.println("Parent class cons" + i);}
	
	public A(int i,int j)
	{System.out.println("Parent class add");
	System.out.println(i+j);
		}
}
