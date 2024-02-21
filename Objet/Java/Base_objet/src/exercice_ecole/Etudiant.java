package exercice_ecole;

public class Etudiant extends Personne {

	//attributs
	private String section;
	
	//constructeur
	public Etudiant(String _nom, String _prenom, int _anneeNaissance, String _section) {
		super(_nom, _prenom, _anneeNaissance);
		this.section = _section;
	}
	
	//méthodes
	public String AffichageAge() {
		int age = super.year - super.anneeNaissance;
		return Integer.toString(age);
	}
	
	public String GoToClasse() {
		return "";
	}
}
