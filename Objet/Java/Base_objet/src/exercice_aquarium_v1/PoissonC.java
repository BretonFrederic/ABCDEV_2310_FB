package exercice_aquarium_v1;

public enum PoissonC {
	SOLE("Carnivore"), BAR("Carnivore"), CARPE("Carnivore");
	
	//attributs
	private String typePoisson;
	
	//constructeur
	PoissonC(String _typePoisson){
		this.typePoisson = _typePoisson;
	}
	
	//getters
	public String getTypePoisson() {
		return this.typePoisson;
	}
}
