package exercice_ecole;

import java.util.Calendar;

public class Personne {
	
	//attributs
	protected String nom;
	protected String prenom;
	protected int anneeNaissance;
	
	Calendar c = Calendar.getInstance();
	protected int year = c.get(Calendar.YEAR);
	
	//constructeur
	public Personne(String _nom, String _prenom, int _anneeNaissance) {
		this.nom = _nom;
		this.prenom = _prenom;
		this.anneeNaissance = _anneeNaissance;
	}
	
	//méthodes
	public String DireBonjour() {
		return "Bonjour !!!\nJe m'appelle : "+this.prenom+" "+this.nom;
	}
	
	public int CalculAge(int _anneeCourante) {
		int age = this.year - this.anneeNaissance;
		return age;
	}
}
