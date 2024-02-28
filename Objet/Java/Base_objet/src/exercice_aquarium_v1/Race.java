package exercice_aquarium_v1;

public enum Race {

	SOLE("sole"), BAR("bar"), CARPE("carpe"), MEROU("mérou"), THON("thon"), POISSON_CLOWN("poisson-clown");
	
	//attributs
	private final String poisson;
	
	//constructeur
	public Race(String _poisson){
		this.poisson = _poisson;
	}
	
	//getters et setters
}
