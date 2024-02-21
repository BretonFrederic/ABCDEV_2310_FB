package exercice_ecole;

public class Professeur extends Personne {

	//attributs
	private String sujet;
	
	//constructeur
		public Professeur(String _nom, String _prenom, int _anneeNaissance, String _sujet) {
			super(_nom, _prenom, _anneeNaissance);
			this.sujet = _sujet;
		}
		
		//méthodes
		public String AffichageAge() {
			return "J'ai : "+Integer.toString(this.CalculAge(super.year))+" ans.";
		}
		
		public String ACours() {
			return "Le cours va commencer.\n";
		}
}
