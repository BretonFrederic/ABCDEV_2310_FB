package exercice_montres;

public class Personne {
	
	//Variable d'instance
	private String nom;
	private boolean porteUneMontre;
	private Montre montre;
	
	//Constructeurs
	public Personne(String _nom) {
		this.nom = _nom;
		this.porteUneMontre = false;
	}
	
	//Méthodes
	public boolean MettreMontre(Montre _montre) {
		if(!this.porteUneMontre && !_montre.getEstPortee()) {
			this.porteUneMontre = true;
			_montre.setEstPortee(true);
			this.montre = _montre;
			this.montre.setProprietaire(nom);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean EnleverMontre() {
		if(this.porteUneMontre && this.montre.getEstPortee()) {
			this.montre.setProprietaire("inconnu");
			this.porteUneMontre = false;
			this.montre.setEstPortee(false);
			this.montre = null;
			return true;
		}else {
			return false;
		}
	}
	
	public String DemanderHeure(Personne _personne) {
		String heureActuelle = "";
		if(_personne.porteUneMontre) {
			heureActuelle = _personne.montre.AfficherHeure();
		}else {
			heureActuelle = "Désolé, je n'ai pas de montre.";
		}
		return heureActuelle;
	}
}
