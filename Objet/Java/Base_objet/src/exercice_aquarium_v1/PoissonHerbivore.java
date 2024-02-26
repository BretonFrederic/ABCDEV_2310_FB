package exercice_aquarium_v1;

public class PoissonHerbivore extends Poisson {
	
	//attributs
	private PoissonH race;
	
	//constructeur
	public PoissonHerbivore(String _nom, String _sexe, PoissonH _race) {
		super(_nom, _sexe);
		this.race = _race;
	}
	
	//getters et setters
	public String getRace() {
		return race.toString();
	}
	
	//méthodes
	@Override
	public boolean Manger(Algues _algue) {
		if(_algue.getpointsVie() > 1) {
			_algue.setpointsVie(_algue.getpointsVie()-2);
			if(this.getPointsVie() <= 7) {
				this.setPointsVie(this.getPointsVie()+3);
			}else if(this.getPointsVie() < 10) {
				this.setPointsVie(10);
			}
		}else if(_algue.getpointsVie() < 2) {
			_algue.;
			if(this.getPointsVie() <= 7) {
				this.setPointsVie(this.getPointsVie()+3);
			}else if(this.getPointsVie() < 10) {
				this.setPointsVie(10);
			}
		}

		System.out.println("Herbivore mange");
		return false;
	}
}
