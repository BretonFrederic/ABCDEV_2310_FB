package exercice_aquarium_v1;

public class PoissonHerbivore extends Poisson {
	
	//attributs
	private Race race;
	private String regimeAlimentaire;
		
	//constructeur
	public PoissonHerbivore(String _nom, int _sexe, Race _race) {
		super(_nom, _sexe);
		this.race = _race;
		this.regimeAlimentaire = "herbivore";
	}
		
	//getters et setters
	public Race getRace() {
		return this.race;
	}

	//méthode toString
	@Override
	public String toString() {
		return "Poisson="+this.regimeAlimentaire+", race=" + this.race.getRace() + ", nom=" + super.getNom() + ", sexe=" + super.getSexe() + ", age=" + super.getAge() + ", pointsVie=" + super.getPointsVie()+"\n";
	}
		
	//méthodes
	@Override
	public boolean Manger(Aquarium _aquarium) {
		if(_aquarium.getAlgue().size() > 0) {
			//choix d'une algue au hazard
			int algueAleatoire = (int)(Math.random()*_aquarium.getAlgue().size());
			//ancien PV
			int alguePV = _aquarium.getAlgue().get(algueAleatoire).getPointsVie();
			//si PV algue sont supérieur ou égal à 2 on retire 2 et +3 au poisson sinon on retire 1 et +1 au poisson
			if(alguePV >= 2) {
				_aquarium.getAlgue().get(algueAleatoire).setPointsVie(alguePV - 2);
				this.setPointsVie(this.getPointsVie() + 3);
			}else if(alguePV == 1) {
				_aquarium.getAlgue().get(algueAleatoire).setPointsVie(0);
				this.setPointsVie(this.getPointsVie() + alguePV);
			}
			return true;
		}else {
			return false;
		}
	}
}
