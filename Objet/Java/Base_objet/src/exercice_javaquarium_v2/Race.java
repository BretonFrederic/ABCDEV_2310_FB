package exercice_javaquarium_v2;

public enum Race {
	MEROU("mérou", "carnivore"), THON("thon", "carnivore"), POISSON_CLOWN("poisson-clown", "carnivore"), SOLE("sole", "herbivore"), BAR("bar", "herbivore"), CARPE("carpe", "herbivore");
	
	//attributs
	private final String race;
	private final String regime;
	
	//constructeur
	Race(String _race, String _regime) {
		this.race = _race;
		this.regime = _regime;
	}

	public String getRace() {
		return race;
	}

	public String getRegime() {
		return regime;
	}
}
