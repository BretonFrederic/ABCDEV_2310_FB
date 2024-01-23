package exercice_montres;

public class Personne {
	
	//Variable d'instance
	private String nom;
	private boolean porteUnemontre;
	private Montre montre;
	
	//Constructeurs
	public Personne(String _nom) {
		this.nom = _nom;
		this.porteUnemontre = false;
		this.montre = new Montre(_nom, 13, 45);
	}
	
	//Setters et getters
	//public void setProprietaireMontre(Montre _montre) {
	//	_montre.setProprietaire(this.nom);
	//	montre = _montre;
	//}
	
	//Méthodes
	public boolean MettreMontre(Montre _montre) {
		if(!this.porteUnemontre) {
			this.porteUnemontre = true;
			this.montre = _montre;
			this.montre.setProprietaire(nom);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean EnleverMontre() {
		if(this.porteUnemontre) {
			this.porteUnemontre = false;
		//	this.setProprietaireMontre(_montre);
			return true;
		}else {
			return false;
		}
	}
	
	public String DemanderHeure(Personne _personne) {
		//
		return "00h00";
	}
}
