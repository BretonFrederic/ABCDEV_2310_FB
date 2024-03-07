package exercice_aquarium_v1;

public abstract class Poisson {

	//attributs
	private String nom;
	private int sexe;
	private int age;
	private int pointsVie;
	private boolean parent;
	
	//constructeur
	public Poisson(String _nom, int _sexe) {
		this.nom = _nom;
		this.sexe = _sexe;
		this.age = 0;
		this.pointsVie = 10;
		this.parent = false;
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
	
	public boolean getParent() {
		return this.parent;
	}
	
	public void setParent(boolean _parent) {
		this.parent = _parent;
	}
	
	public abstract Race getRace();


	public void setPointsVie(int _pointsVie) {
		this.pointsVie = _pointsVie;
	}
	
	//méthodes abstraites
	public abstract boolean Manger(Aquarium _aquarium);
	public abstract boolean DonnerlaVie(Aquarium _aquarium);

	//méthodes concrètes
	public boolean Vieillir(Aquarium _aquarium) {
		if(this.pointsVie > 0 && this.age < 20) {
			this.pointsVie -= 1;
			if((this.toString().contains("bar") || this.toString().contains("mérou")) && this.getAge() < 10) {
				this.setSexe(1);
			}else {
				this.setSexe(2);
			}
			this.age += 1;
			this.DonnerlaVie(_aquarium);
			return true;
		}else {
			System.out.println("Poisson mort ! ");
			return false;
		}
	}
}
