package cscse247.assignments.factory;

public class Toy {

	protected String name;
	public void assemble() {
		System.out.println("putting together a "+ name);
	}
	public void Boxtoy() {
		System.out.println("putting the " + name +" in a box");
	}
	public  void priceToy() {
		System.out.println("adding price on "+ name);
	}
}
