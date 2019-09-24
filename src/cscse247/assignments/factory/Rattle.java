package cscse247.assignments.factory;
/**
 * Doll.java- type of toy that inherit from Toy.java
 * @author Nguyen
 *
 */
public class Rattle extends Toy{
	Rattle(){
		name = "rattle";
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Create the frame\n" +
							"Add the pebbles\n" +
							"Secure the sides.");
		
	}
}
