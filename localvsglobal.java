package JavaBasics;

public class localvsglobal {
	//global variable /Class variable
	int a=10;
	String s="Global string";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;//local variable for main method
		localvsglobal ob=new localvsglobal();
		System.out.println(ob.a);
		ob.main();
		

	}

	public void main()
	{
		int i=10;
		int j=20;
		System.out.println(i);
		//local variable for method main
	}
	}

