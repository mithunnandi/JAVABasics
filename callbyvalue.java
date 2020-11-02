package JavaBasics;

public class callbyvalue {
	public static void main(String[] args) {
		int a = 5, b = 6;//Call By Value
		System.out.println("Before the function call: a= " + a + " b= " + b);
		swapnum(a, b);
		System.out.println("After the function call: a= " + a + " b= " + b);
	}

	public static void swapnum(int x, int y) {
		System.out.println("Before: x= " + x + " y= " + y);
		int temp = x; //temp=5
		x = y;	//x=6
		y = temp; //y=5
		System.out.println("After: x= " + x + " y= " + y);
	}

}
