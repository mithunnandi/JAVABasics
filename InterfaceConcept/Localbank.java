package JavaBasics.InterfaceConcept;

public class Localbank implements Reservebank, StateBank {// multiple inheritance
//Is a relationship-relation ship between interface and class,implements keyword used
	//Has a relationship -relationship between class and class,extends keyword used
	// If a class is implementing any interface,its mandatory to override all the methods 
	
	// Overriding from Reservebank Interface

	public void debit() {
		System.out.println("HSBC-DEBIT");
	}

	public void credit() {
		System.out.println("HSBC-CREDIT");
	}

	public void transfermoney() {
		System.out.println("HSBC-TRANSFERMONEY");
	}
	// Separate method

	public void Customerservice() {
		System.out.println("HSBCs-Service");
	}

//Overriding from Statebank
	public void loan() {
		System.out.println("HSBC _LOAN");
	}

}
