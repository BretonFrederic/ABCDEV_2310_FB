package exercice_aquarium_v1;

public abstract class Poisson {

	//attributs
	private String nom;
	private int sexe;
	private int age;
	private int pointsVie;
	
	//constructeur
	public Poisson(String _nom, int _sexe) {
		this.nom = _nom;
		this.sexe = _sexe;
		this.age = 0;
		this.pointsVie = 10;
	}

	//getters et setters
	public String getNom() {
		return this.nom;
	}

	public void setNom(String _nom) {
		this.nom = _nom;
	}

	public String getSexe() {
		String sexePoisson = "";
		switch(this.sexe) {
		case 1:
			sexePoisson = "mâle";
			break;
		case 2:
			sexePoisson = "femelle";
			break;
		case 3:
			sexePoisson = "hermaphrodite avec l'âge";
			break;
		case 4:
			sexePoisson = "hermaphrodite opportuniste";
			break;
		}
		return sexePoisson;
	}

	public void setSexe(int _sexe) {
		this.sexe = _sexe;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int _age) {
		this.age = _age;
	}

	public int getPointsVie() {
		return this.pointsVie;
	}

	public void setPointsVie(int _pointsVie) {
		this.pointsVie = _pointsVie;
	}
	
	//méthodes abstraites
	
	
	//méthodes concrètes
	public boolean Vieillir() {
		if(this.pointsVie > 0 && this.age < 20) {
			this.pointsVie -= 1;
			this.age += 1;
			//this.DonnerlaVie();
			return true;
		}else {
			System.out.println("Poisson mort ! ");
			return false;
		}
	}
}
