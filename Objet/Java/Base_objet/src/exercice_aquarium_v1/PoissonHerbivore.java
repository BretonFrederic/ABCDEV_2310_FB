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
	@Override
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
	public boolean DonnerlaVie(Aquarium _aquarium) {
		if(_aquarium.getPoisson().size() > 1 && this.getPointsVie() > 5 && !this.getParent()) {
			int poissonAleatoire;
			int poissonPV;
			Race racePoisson = this.getRace();
				//choix d'une poisson à rencontrer
				poissonAleatoire = (int)(Math.random()*_aquarium.getPoisson().size());
				//poisson partenaire potentiel
				poissonPV = _aquarium.getPoisson().get(poissonAleatoire).getPointsVie();
				//si poisson de même race
				if(_aquarium.getPoisson().get(poissonAleatoire).getRace().equals(this.getRace())) {
					switch(racePoisson) {
					case CARPE:
					case BAR:
						if(_aquarium.getPoisson().get(poissonAleatoire).getSexe() != this.getSexe()) {
							//reproduction
							System.out.println(this.toString()+" se reproduit avec "+_aquarium.getPoisson().get(poissonAleatoire).toString());
							this.setParent(true);
						}
						break;
					case SOLE:
							//reproduction
						System.out.println(this.toString()+" se reproduit avec "+_aquarium.getPoisson().get(poissonAleatoire).toString());
							this.setParent(true);
							this.setSexe(1);
							_aquarium.getPoisson().get(poissonAleatoire).setSexe(2);
						break;
					default:
						break;
					}
				}
				return true;
		}else {
			return false;
		}
	}

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
