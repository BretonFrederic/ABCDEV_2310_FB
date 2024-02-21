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
		//
	}
	
	//méthodes
	public String DireBonjour() {
		return "Bonjour !!!";
	}
	
	public int CalculAge(int _anneeCourante) {
		return 1;
	}
}
