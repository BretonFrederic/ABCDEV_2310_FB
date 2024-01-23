package exercice_montres;

public class Personne {
	
	//Variable d'instance
	private String nom;
	private boolean porteUnemontre;
	protected Montre montre;
	
	//Constructeurs
	public Personne(String _nom) {
		this.nom = _nom;
		this.porteUnemontre = false;
		//this.montre = new Montre(_nom, 13, 45);
	}
	
	//Setters et getters
	public void setMontre(Montre _montre) {
		_montre.setProprietaire(this.nom);
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
