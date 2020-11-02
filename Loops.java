package JavaBasics;

public class Loops {
	public static void main(String[] args) {
		int i=1;
		while(i<=10)
		{System.out.println(i);
		i=i+1;
		//if not given this statement i=1+1 the 1 will be printed for infinite times which is a disadvantage 
		}
		System.out.println("*******");
		for(int j=1;j<=10;j++)
			System.out.println(j);
		
		System.out.println("!!!!!!!!!!!!!!");
		for(int j1=1;j1<=10;++j1)
			System.out.println(j1);
		
		System.out.println("*******");
		for(int k=10;k>=1;k--)
			System.out.println(k);
		
		System.out.println("*******");
		for(int k=10;k>=-10;k--)
			System.out.println(k);
		
	Methods loop=new Methods();
		loop.test();
		
	}
}
