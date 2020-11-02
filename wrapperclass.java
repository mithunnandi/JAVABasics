package JavaBasics;

public class wrapperclass {

	public static void main(String[] args) {

String x="100";
System.out.println(x+20);//10020

//String to int conversion.
int i=Integer.parseInt(x);
System.out.println(i+10);

//String to double conversion
String a="12.33";
double d=Double.parseDouble(a);
System.out.println(d+10);

//Sting to boolean
String k="true";
System.out.println(Boolean.parseBoolean(k));


//int to String 
int u=30;
String s= String.valueOf(u);//"30"
System.out.println(s+20);//3020

//String to int conversion.
String a1="12.33"; // java.lang.NumberFormatException
//String a2="ABC";//java.lang.NumberFormatException
int q=Integer.parseInt(a1);
System.out.println(q+20);//3020

	}

}
