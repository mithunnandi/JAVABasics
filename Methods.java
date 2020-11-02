package JavaBasics;

public class Methods {

	public static void main(String[] args) {
		Methods obj=new Methods();
		obj.test();
		int l=obj.test2();
		System.out.println(l);
		String str=obj.test3();
		System.out.println(str);
		int div=obj.test3(120, 13);
		System.out.println(div);

	}//main method is void as it never returns any value
	
	
	//Non static methods
	//void -does not returns any value
	
//return type-void	
public void test(){ //no input,no output
	System.out.println("Method for test");
	
}
//return type-int
public int test2()//no input some output
{
	int i=10,b=20;
	System.out.println("Testing for learning");
return i+b;
}
//return type string

public String test3()//no input some outptut
{
	System.out.println("Testing Strings");
	String s="String under test";
	return s;
	}
//return type int
public int test3(int x ,int y)//x,y-input paramaters/arguments
{
	System.out.println("division method");
	int d=x/y;
	return d;
	}

}
