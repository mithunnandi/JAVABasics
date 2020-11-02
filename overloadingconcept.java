package JavaBasics;

public class overloadingconcept {

	public static void main(String args[])
	{
		overloadingconcept obj=new overloadingconcept();
		obj.test();
		
		obj.test(10);
		
		obj.test('B');
		obj.test('q', 'w');
	}
	public static void main()
	{
		
	}
	public static void main(int a)
	{
		
	}
	public static void main(int a ,int b)
	{
		
	}
//you cannnot create a method inside a method
	//if return type is same then also it will display error if the method has same name
	//we can overload main method also.
	//duplicate methods-Same method name with same no. of arguments are not allowed
//method overloading-when methodname is same with different parameters(count of parameters and data type) within the same class
public void test()
{System.out.println("with zero parameters");

}
public void test(int a)
{
System.out.println("with one parameter");
System.out.println(a);

}
public void test(char a)
{System.out.println("with one  parameter different data type");
System.out.println(a);

}
public void test(char a,char b)
{System.out.println("with two parameters");
System.out.println(a+b);

}
}