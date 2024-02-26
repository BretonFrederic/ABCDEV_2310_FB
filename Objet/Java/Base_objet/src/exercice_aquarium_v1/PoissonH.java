package exercice_aquarium_v1;

public enum PoissonH {
	MEROU("Herbivore"), THON("Herbivore"), POISSON_CLOWN("Herbivore");
	
	//attributs
	private String typePoisson;
	
	//constructeur
	PoissonH(String _typePoisson){
		this.typePoisson = "Herbivore";
	}
	
	//getters
	public String getTypePoisson() {
		return this.typePoisson;
	}
}
