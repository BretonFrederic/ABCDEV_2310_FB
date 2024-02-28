package exercice_aquarium_v1;

public class PoissonCarnivore extends Poisson {
	
	//attributs
	private RaceC race;
	
	//constructeur
	public PoissonCarnivore(String _nom, String _sexe, RaceC _race) {
		super(_nom, _sexe);
		this.race = _race;
	}
	
	//getters et setters
	public RaceC getRace() {
		return this.race;
	}

	@Override
	public String toString() {
		return "Poisson=Carnivore, race=" + this.race + ", nom=" + super.getNom() + ", sexe=" + super.getSexe() + ", age=" + super.getAge() + ", pointsVie=" + super.getPointsVie();
	}
	
	//méthodes
	
}
