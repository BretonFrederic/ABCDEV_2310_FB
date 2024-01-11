package exercice_bouteille_version1;

public class Bottle {
	// Attributs
		private String nom;
		private final double capaciteEnL;
		private double contenanceEnL;
		private boolean estOuverte;
		
		// Méthodes
		public boolean ouvrir() {
			if(!estOuverte) {
				estOuverte = true;
				return true;
			}else {
				return false;
			}
		}
		
		public boolean fermer() {
			if(estOuverte) {
				estOuverte = false;
				return true;
			}else {
				return false;
			}
		}
		
		public boolean remplirTout() {
			if(contenanceEnL < capaciteEnL && estOuverte) {
				contenanceEnL = capaciteEnL;
				return true;
			}else {
				return false;
			}
		}
		
		public boolean remplir(double quantiteEnL) {
			if(quantiteEnL <= capaciteEnL - contenanceEnL && estOuverte) {
				contenanceEnL += quantiteEnL;
				return true;
			}else {
				return false;
			}
		}
		
		public boolean viderTout() {
			if(contenanceEnL > 0 && estOuverte) {
				contenanceEnL = 0;
				return true;
			}else {
				return false;
			}
		}
		
		public boolean vider(double quantiteEnL) {
			if(contenanceEnL >= quantiteEnL && estOuverte) {
				contenanceEnL -= quantiteEnL;
				return true;
			}else {
				return false;
			}
		}
		
		// Constructeur
		public Bottle(){
			nom = "Vittel";
			capaciteEnL = 1.5;
			contenanceEnL = 0.5;
			estOuverte = false;
		}
		
		public Bottle(String _nom, final double _capaciteEnL, double _contenanceEnL, boolean _estOuverte){
			nom = _nom;
			capaciteEnL = _capaciteEnL;
			contenanceEnL = _contenanceEnL;
			estOuverte = _estOuverte;
		}
}
