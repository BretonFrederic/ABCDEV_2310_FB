package exercice_aquarium_v1;

public class Algues {

	//attributs
	int age;
	private int pointsVie;
	
	//constructeur
	public Algues(int _pointsVie, int _age) {
		this.pointsVie = _pointsVie;
		this.age = _age;
	}
	
	//getters et setters
	public int getpointsVie() {
		return this.pointsVie;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setpointsVie(int _ptsVie) {
		this.pointsVie = _ptsVie;
	}
	
	public void setAge(int _age) {
		this.age = _age;
	}
}
