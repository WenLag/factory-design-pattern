package cscse247.assignments.factory;

public class Car extends Toy{

	public Car(){
		
	}
	@Override
	public void assemble() {
		System.out.println("Make the body\n" +
							"Add the wheels\n" +
							"Paint the car.");
		
	}
}
