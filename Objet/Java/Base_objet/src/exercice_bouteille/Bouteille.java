package exercice_bouteille;

public class Bouteille {

	// Attributs
	private String marque = "nom";
	private String parfum = "nom";
	private boolean gazeux = false;
	private int volumeMax = 1000;
	private int volumeReel = 500;
	private boolean estFermer = true;
	
	// Méthodes
	public void ouvrir() {
		if(estFermer) {
			estFermer = false;
		}
	}
	
	public void fermer() {
		if(!estFermer) {
			estFermer = true;
		}
	}
	
	public void vider(int _quantite) {
		int volumeReel = volumeReel - _quantite;
		if(!estFermer && volumeReel >= 0) {
			estFermer = true;
		}
	}
}
