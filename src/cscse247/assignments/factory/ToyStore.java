package cscse247.assignments.factory;

public abstract class ToyStore {
	public abstract Toy createToy(String type);
	public Toy orderToy(String type) {
		Toy toy = createToy(type);
		toy.name = type;
		toy.assemble();
		toy.Boxtoy();
		toy.priceToy();
		return toy;
	}
	
	
}
