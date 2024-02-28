package exercice_aquarium_v1;

public class PoissonHerbivore extends Poisson {
	
	//attributs
	private Race race;
		
	//constructeur
	public PoissonHerbivore(String _nom, int _sexe, Race _race) {
		super(_nom, _sexe);
		this.race = _race;
	}
		
	//getters et setters
	public Race getRace() {
		return this.race;
	}

	@Override
	public String toString() {
		return "Poisson=Herbivore, race=" + this.race + ", nom=" + super.getNom() + ", sexe=" + super.getSexe() + ", age=" + super.getAge() + ", pointsVie=" + super.getPointsVie()+"\n";
	}
		
	//méthodes
	
}
