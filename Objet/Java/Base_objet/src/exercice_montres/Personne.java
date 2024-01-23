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
	}
	
	//Setters et getters
	public void setMontre(Montre _montre) {
		montre = _montre;
	}
	
	//Méthodes
	public void MettreMontre(Montre _montre) {
		this.setMontre(_montre);
		this.porteUnemontre = true;
	}
	
	public void EnleverMontre() {
		this.setMontre(null);
		this.porteUnemontre = false;
	}
	
	public String DemanderHeure(Personne _personne) {
		//
		return "00h00";
	}
}
