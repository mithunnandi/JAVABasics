 package JavaBasics;

public class twodarray {

	public static void main(String arge[])
	{
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[5]=50;
		System.out.println(i[5]);
		System.out.println(i.length);//lemgth of array
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
	//	at JavaBasics.twodarray.main(twodarray.java:12)

	}
}
