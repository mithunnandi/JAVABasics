package JavaBasics.InterfaceConcept;

public interface Reservebank {
	int minbal = 1000;

	public void credit();

	public void debit();

	public void transfermoney();

	// only method declaration
	//Interface is a java type block definition which is 100% abstract
	// no method body(abstract methods)-only method prototype
	// In Interface we can declare variables,vars are by default static in is in
	// natura
	// vars values will not be changed,its final in nature
	// no static method in interface
	// No mainm nethod in interface
	// We cannot create object of interface
	// interface is abstract in nature--we cannot create object of interface

}
