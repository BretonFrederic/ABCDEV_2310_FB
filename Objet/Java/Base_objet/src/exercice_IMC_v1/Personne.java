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
	private double Imc() {
		return this.poids/Math.pow(this.taille, 2);
	}
	
	public void Interpretation() {
		this.Imc();
		if(this.Imc() < 16) {
			System.out.println("Risque de maladie elevé, maigreur extrême.");
		}else if(this.Imc() >= 16 && this.Imc()<= 18.4) {
			System.out.println("Risque de maladie moyen, insuffisance pondérale.");
		}else if(this.Imc() >= 18.5 && this.Imc()<= 24.9) {
			System.out.println("Risque de maladie faible, corpulance normale.");
		}else if(this.Imc() >= 25 && this.Imc()<= 29.9) {
			System.out.println("Risque de maladie moyen, surpoids.");
		}else if(this.Imc() >= 30 && this.Imc()<= 34.9) {
			System.out.println("Risque de maladie élevé, obésité.");
		}else if(this.Imc() >= 35 && this.Imc()<= 40) {
			System.out.println("Risque de maladie très élevé, obésité sévère.");
		}else if(this.Imc() > 40) {
			System.out.println("Risque de maladie extrêmement elevé, obésité morbide.");
		}
	}
}
