package JavaBasics;


//~~Singleton Class in Java:
//In object-oriented programming, a singleton class is a class that can have only one object (an instance of the class) at a time.
//After first time, if we try to instantiate the Singleton class, the new variable also points to the first instance created. 
//
//So whatever modifications we do to any variable inside the class through any instance, it affects the variable of the single instance created and is visible if we access that variable through any variable of that class type defined.
//
//~~~To design a singleton class:
//
//1. Make constructor as private.
//2. Write a static method that has return type object of this singleton class. Here, the concept of Lazy initialization in used to write this static method.
//
//Normal class vs Singleton class: Difference in normal and singleton class in terms of instantiation is that, For normal class we use constructor, whereas for singleton class we use getInstance() method.
public class SingletonClassinJAVA {
	
	
	
	private static SingletonClassinJAVA singleton_instance=null;
	public String str;
	
	private SingletonClassinJAVA()
	{str="hey i am a singleton Class";
	}
	
	public static SingletonClassinJAVA getInstance()
	{
		if(singleton_instance==null)
			singleton_instance= new SingletonClassinJAVA();
		return singleton_instance;
		
	}

	public static void main(String[] args) {
		SingletonClassinJAVA x=getInstance();
		SingletonClassinJAVA y=getInstance();
		SingletonClassinJAVA z=getInstance();
		
		x.str=(x.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str=(z.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
	

	}

}
