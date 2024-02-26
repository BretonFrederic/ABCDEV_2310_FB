package exercice_aquarium_v1;

public abstract class Poisson {
	//attributs
	private String nom;
	private String sexe;
	private int pointsVie;
	
	//constructeur
	public Poisson(String _nom, String _sexe) {
		this.nom = _nom;
		this.sexe = _sexe;
		this.pointsVie = 10;
	}

	//getters et setters
	public abstract String getRace();
	
	public String getNom() {
		return this.nom;
	}
	
	public String getSexe() {
		return this.sexe;
	}
	
	public void setPointsVie(int _ptsVie) {
		this.pointsVie = _ptsVie;
	}
	
	public int getPointsVie() {
		return this.pointsVie;
	}
	
	//méthodes
	public abstract boolean Manger(Algues _algue);
	

}
