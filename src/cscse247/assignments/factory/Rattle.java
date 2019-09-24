package cscse247.assignments.factory;

public class Rattle extends Toy{
	Rattle(){
		
	}
	
	@Override
	public void assemble() {
		System.out.println("Create the frame\n" +
							"Add the pebbles\n" +
							"Secure the sides.");
		
	}
}
