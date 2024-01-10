package exercice_bouteille;

public class Bouteille {

	// Attributs
	private String nom = "nom";
	private double capaciteEnL = 1.5;
	private double contenanceEnL = 0.5;
	private boolean estOuverte = false;
	
	// Méthodes
	public boolean ouvrir() {
		if(!estOuverte) {
			estOuverte = true;
		}
		return estOuverte;
	}
	
	public boolean fermer() {
		if(estOuverte) {
			estOuverte = false;
		}
		return estOuverte;
	}
	
	public boolean remplirTout() {
		contenanceEnL = capaciteEnL;
		return true;
	}
	
	public boolean remplir(double quantiteEnL) {
		boolean remplir;
		if(quantiteEnL <= capaciteEnL - contenanceEnL) {
			contenanceEnL += quantiteEnL;
			remplir = true;
		}else {
			remplir = false;
		}
		return remplir;
	}
	
	public boolean viderTout() {
		contenanceEnL = 0;
		return true;
	}
	
	public boolean vider(double quantiteEnL) {
		boolean vider;
		if(contenanceEnL >= quantiteEnL) {
			contenanceEnL -= quantiteEnL;
			vider = true;
		}else {
			vider = false;
		}
		return vider;
	}
	
	// Constructeur
	Bouteille(){
		this.nom = "nom";
		this.capaciteEnL = 1.5;
		this.contenanceEnL = 0.5;
		this.estOuverte = false;
	}
	
	Bouteille(String _nom, double _capaciteEnL, double _contenanceEnL, boolean _estOuverte){
		this.nom = _nom;
		this.capaciteEnL = _capaciteEnL;
		this.contenanceEnL = _contenanceEnL;
		this.estOuverte = _estOuverte;
	}
	
}
