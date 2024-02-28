package exercice_aquarium_v1;

public class PoissonCarnivore extends Poisson {
	
	//attributs
	private Race race;
	private String regimeAlimentaire;
	
	//constructeur
	public PoissonCarnivore(String _nom, int _sexe, Race _race) {
		super(_nom, _sexe);
		this.race = _race;
		this.regimeAlimentaire = "carnivore";
	}
	
	//getters et setters
	public Race getRace() {
		return this.race;
	}

	@Override
	public String toString() {
		return "Poisson="+this.regimeAlimentaire+", race=" + this.race.getRace() + ", nom=" + super.getNom() + ", sexe=" + super.getSexe() + ", age=" + super.getAge() + ", pointsVie=" + super.getPointsVie()+"\n";
	}
	
	//méthodes
	
}
