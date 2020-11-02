package JavaBasics.InterfaceConcept;

public class testbak {

	public static void main(String[] args) {
		System.out.println(Reservebank.minbal);
		Localbank l = new Localbank();
		l.credit();
		l.debit();
		l.Customerservice();
		l.loan();

		// dynamic polymorphism-Child class object can be referred by parent class
		// interface
		Reservebank s = new Localbank();
		s.credit();
		s.debit();
		s.transfermoney();

	}

}
