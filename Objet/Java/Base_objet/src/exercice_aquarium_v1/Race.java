package exercice_aquarium_v1;

public enum Race {

	SOLE("sole", "Hermaphrodite opportuniste", "herbivore"), BAR("bar", "Hermaphrodite avec l'âge", "herbivore"), CARPE("carpe", "mono-sexué", "herbivore"), MEROU("mérou", "Hermaphrodite avec l'âge", "carnivore"), THON("thon", "mono-sexué", "carnivore"), POISSON_CLOWN("poisson-clown", "Hermaphrodite opportuniste", "carnivore");
	
	//attributs
	private final String poisson;
	private final String sexualite;
	private final String regimeAlimentaire;
	
	//constructeur
	Race(String _poisson, String _sexualite, String _regimeAlimentaire){
		this.poisson = _poisson;
		this.sexualite = _sexualite;
		this.regimeAlimentaire = _regimeAlimentaire;
	}
	
	//getters et setters
	public String getRace() {
		return this.poisson;
	}
	
	public String getSexualite() {
		return this.sexualite;
	}
	
	public String getRegimeAlimentaire() {
		return this.regimeAlimentaire;
	}
}
