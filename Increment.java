package JavaBasics;

public class Increment {
	public static void main(String[] args)
	{
		int i=1;
		int j=i++;//post increment
		System.out.println(i);//2
		System.out.println(j);//1
		
		int a=1;
		int b=++a; //pre icrement
		System.out.println(a);//2
		System.out.println(b);//2
		
		int m=2;
		int n=--m; //pre decrement
		System.out.println(m);//1
		System.out.println(n);//1
		
		int x=2;
		int y=x--;//post decrement
		System.out.println(x);//1
		System.out.println(y);//2
	}

}
