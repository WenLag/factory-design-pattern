package cscse247.assignments.factory;

public class ToyStore {
	
	
	
	public Toy orderToy(String type) {
		Toy toy;
		if (type == "doll") {
			toy = new Doll();
		}
		else if (type == "car") {
			toy = new Car();
		}
		else if (type == "rattle") {
			toy = new Rattle();
		}
		else 
			toy = new Toy();
		toy.name = type;
		toy.assemble();
		toy.Boxtoy();
		toy.priceToy();
		return toy;
	}
	
	
}
