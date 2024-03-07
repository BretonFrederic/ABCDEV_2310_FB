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
				if(_aquarium.getPoisson().get(poissonAleatoire).getRace().equals(this.getRace())) {
					switch(racePoisson) {
					case THON:
					case MEROU:
						if(_aquarium.getPoisson().get(poissonAleatoire).getSexe() != this.getSexe()) {
							//reproduction
							System.out.println(this.toString()+" se reproduit avec "+_aquarium.getPoisson().get(poissonAleatoire).toString());
							this.setParent(true);
						}
						break;
					case POISSON_CLOWN:
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
		boolean nourri = false;
		if(_aquarium.getPoisson().size() > 1) {
			int nbPoissonHerbivore=0;
			for(int i = 0; i <= _aquarium.getPoisson().size()-1; i++) {
				if(_aquarium.getPoisson().get(i).toString().contains("herbivore")) {
					nbPoissonHerbivore++;
				}
			}
			if(nbPoissonHerbivore >= 1) {
				int poissonAleatoire;
				int poissonPV;
				do {
					//choix d'une poisson à manger au hazard
					poissonAleatoire = (int)(Math.random()*_aquarium.getPoisson().size());
					//ancien PV poisson à manger
					poissonPV = _aquarium.getPoisson().get(poissonAleatoire).getPointsVie();
				}while(_aquarium.getPoisson().get(poissonAleatoire).toString().contains("carnivore"));
				//si PV herbivore sont supérieur ou égal à 4 on retire 4 et +5 au poisson carnivore sinon on retire reste herbivore et +reste au poisson carnivore
				if(poissonPV >= 4) {
					_aquarium.getPoisson().get(poissonAleatoire).setPointsVie(poissonPV - 4);
					this.setPointsVie(this.getPointsVie() + 5);
				}else if(poissonPV < 4) {
					_aquarium.getPoisson().get(poissonAleatoire).setPointsVie(0);
					this.setPointsVie(this.getPointsVie() + poissonPV);
				}
				nourri = true;
			}else {
				System.out.println("il n'y a plus d'herbivore.");
				nourri = false;
			}
		}
		return nourri;			
	}
}
