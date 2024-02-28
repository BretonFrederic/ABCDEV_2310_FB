package exercice_aquarium_v1;

public class Algue {

	//attributs
	private int age;
	private int pointsVie;
	private boolean parent;
	
	//constructeur
	public Algue() {
		this.age = 0;
		this.pointsVie = 10;
		this.parent = false;
	}

	//getters et setters
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPointsVie() {
		return pointsVie;
	}

	public void setPointsVie(int pointsVie) {
		this.pointsVie = pointsVie;
	}
	
	//méthodes
	public boolean Vieillir() {
		if(this.pointsVie > 0 && this.age < 20) {
			this.pointsVie += 1;
			this.age += 1;
			//this.DonnerlaVie();
			return true;
		}else {
			System.out.println("Algue morte ! ");
			return false;
		}
	}
	
	public boolean DonnerlaVie() {
		if(this.pointsVie > 0 && this.age >= 10 && !this.parent) {
			this.pointsVie /= 2;
			System.out.println("Algue majeur se reproduit\n");
			this.parent = true;
			return true;
		}else if(this.pointsVie > 0 && this.age >= 10 && this.parent) {
			System.out.println("Algue majeur s'est déjà reproduit\n");
			return false;
		}else {
			System.out.println("Algue trop jeune pour se reproduire\n");
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Algue, age=" + this.getAge() + ", pointsVie=" + this.getPointsVie()+"\n";
	}
}
