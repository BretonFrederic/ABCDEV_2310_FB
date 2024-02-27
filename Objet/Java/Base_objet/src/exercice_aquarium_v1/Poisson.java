package exercice_aquarium_v1;

public abstract class Poisson {

	//attributs
	private String nom;
	private String sexe;
	private int age;
	private int pointsVie;
	
	//constructeur
	public Poisson(String _nom, String _sexe) {
		this.nom = _nom;
		this.sexe = _sexe;
		this.age = 0;
		this.pointsVie = 10;
	}

	//getters et setters
	public String getSexe() {
		return this.sexe;
	}

	public void setSexe(String _sexe) {
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
			this.pointsVie += 1;
			this.age += 1;
			System.out.println("Age poisson : "+this.getAge());
			System.out.println("Points de Vie : "+this.getPointsVie()+"\n");
			//this.DonnerlaVie();
			return true;
		}else {
			System.out.println("Poisson mort ! ");
			return false;
		}
	}
}
