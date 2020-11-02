package JavaBasics;

public class B extends A {
	

//super keyword is used to call parent class const
	//if zero parameters are passed in super()  default const will be called
	
	
	public static void main(String args[])
	{
		
		
		B b= new B();
		B b1=new B(10);
		B b2=new B(10,20);
		
	}
	public B()
	{super();
	System.out.println("Child class cons. default ");}
	
	public B(int k)
	{super(k);
	System.out.println("Child class cons1 para");}
	
	public B(int m ,int n)
	{super(m,n);
	System.out.println("Child class cons  2 parm");}
}
