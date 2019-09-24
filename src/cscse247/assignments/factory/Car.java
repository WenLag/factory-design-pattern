package cscse247.assignments.factory;
/**
 * Doll.java- type of toy that inherit from Toy.java
 * @author Nguyen
 *
 */
public class Car extends Toy{

	public Car(){
		name = "car";
	}
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Make the body\n" +
							"Add the wheels\n" +
							"Paint the car.");
		
	}
}
