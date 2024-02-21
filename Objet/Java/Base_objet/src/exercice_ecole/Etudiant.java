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
		return "J'ai : "+Integer.toString(this.CalculAge(super.year))+" ans.";
	}
	
	public String GoToClasse() {
		return "Je suis en "+this.section+" Je vais en cours.\n";
	}
}
