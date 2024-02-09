package exercice_IMC_v1;

public class Personne {
	
	//Attributs
	private double taille;
	private double poids;
	private int age;
	
	//Constructeur
	public Personne(double _taille, double _poids, int _age) {
		this.taille = _taille;
		this.poids = _poids;
		this.age = _age;
	}
	
	//Méthodes
	public double Imc() {
		return this.poids/Math.pow(this.taille, 2);
	}
	
	public String Interpretation() {
		this.Imc();
		}
	}
}
