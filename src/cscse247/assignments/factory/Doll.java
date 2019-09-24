package cscse247.assignments.factory;

public class Doll extends Toy{

	public Doll(){
	
	}
	@Override
	public void assemble() {
		System.out.println("connecting all pieces\n" +
							"painting the faces\n" +
							"Adding the dress\n" +
							"Adding the shoes.");
		
	}
}
