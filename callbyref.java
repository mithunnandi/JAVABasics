package JavaBasics;

public class callbyref {
	

		int a;
		int b;
	
		 public static void main(String[] args) 
		    { 
			 callbyref obj=new callbyref(); 
			 obj.a=5;
			 obj.b=6;
		        System.out.println("Before the function call: a= "+obj.a+" b= "+obj.b); 
		        obj.swapnum(obj); 
		        System.out.println("After the function call: a= "+obj.a+" b= "+obj.b); 
		    } 
		
	    public void swapnum(callbyref t) //possible in JAVA by passing the obecjt reference"t" and "obj"
	    { 
	    	System.out.println("Before: x= "+t.a+" y= "+t.b); 
	        int temp;
	        temp=t.a; //temp=5
	        t.a=t.b; //t.a=6
	        t.b=temp; //t.b=5
	        System.out.println("After: x= "+t.a+" y= "+t.b);  
	    } 
	   

}
