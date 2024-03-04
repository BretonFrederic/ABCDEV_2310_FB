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
	@Override
	public boolean Manger(Aquarium _aquarium) {
		if(_aquarium.getPoisson().size() > 0) {
			//choix d'une poisson à manger au hazard
			int poissonAleatoire = (int)(Math.random()*_aquarium.getPoisson().size());
			//ancien PV poisson à manger
			int poissonPV = _aquarium.getPoisson().get(poissonAleatoire).getPointsVie();
			//si PV algue sont supérieur ou égal à 2 on retire 2 et +3 au poisson sinon on retire 1 et +1 au poisson
			if(poissonPV >= 4) {
				_aquarium.getPoisson().get(poissonAleatoire).setPointsVie(poissonPV - 4);
				this.setPointsVie(this.getPointsVie() + 5);
			}else if(poissonPV < 4) {
				_aquarium.getPoisson().get(poissonAleatoire).setPointsVie(0);
				this.setPointsVie(this.getPointsVie() + poissonPV);
			}
			return true;
		}else {
			return false;
		}
	}
}
