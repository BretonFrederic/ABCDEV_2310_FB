package exercice_fruits_v1;

// Cette Class est une Class parent, une super Class.
// De plus c'est une Class abstraite elle ne peut être instanciée.
// Une Class abstraite peut contenir des méthodes concrètes et abstraites.
// les méthodes abstraites sont déclarées mais définies dans les Class enfants on utilise @Override.

public abstract class Fruit {
	
	private String name;
	
	public Fruit(String name) {
		this.name = name;
	}
	
	public abstract void taste();
	
	public abstract int getSize();
	
	public abstract boolean hasSeed();
	
	public void miam() {
		System.out.println("Miam manger 5 fruits et légumes par jour / Nom du fruit : "+ getName());
	}
	
	public String getName() {
		return name;
	}
}
