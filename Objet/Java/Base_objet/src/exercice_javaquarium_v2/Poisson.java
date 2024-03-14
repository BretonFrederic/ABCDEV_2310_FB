package exercice_javaquarium_v2;

public class Poisson {

	//attributs
	private String nom;
	private int sexe;
	private Race race;
	
	//constructeur
	public Poisson(String _nom, int _sexe, Race _race) {
		this.nom = _nom;
		this.sexe = _sexe;
		this.race = _race;
	}
	
	//getters et setters
	public String getNom() {
		return this.nom;
	}
	
	public String getSexe() {
		String sexePoisson = "";
		if(this.sexe == 1) {
			sexePoisson = "mâle";
		}else if(this.sexe == 2) {
			sexePoisson = "femelle";
		}
		return sexePoisson;
	}
	
	public void setNom(String _nom) {
		this.nom = _nom;
	}
	
	public void setSexe(int _sexe) {
		this.sexe = _sexe;
	}
	
	public void setRace(Race _race) {
		this.race = _race;
	}
	
	//méthodes
	@Override
	public String toString() {
		return this.getNom()+" "+this.getSexe()+" "+this.race.getRace()+" "+this.race.getRegime();
	}
	
	public void Manger(Aquarium _aquarium) {
		if(this.race.getRegime().equals("carnivore")) {
			//s’il est carnivore, il mange un autre poisson (paramètre : un poisson quel qu'il soit).
		}else if(this.race.getRegime().equals("herbivore")) {
			//s'il est herbivore, il mange une algue (paramètre : une algue).
		}
	}
}
