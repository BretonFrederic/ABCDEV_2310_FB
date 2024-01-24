package exercice_poupees_Russes_v1;

public class PoupeeRusse {
	//variables d'instances
	private int taille;
	private boolean estOuverte;
	private boolean contientPoupee;
	private boolean estContenuDans;
	
	//constructeurs
	public PoupeeRusse(int _taille, boolean _estOuverte, boolean _contientPoupee, boolean _estContenuDans) {
		this.taille = _taille;
		this.estOuverte = _estOuverte;
		this.contientPoupee = _contientPoupee;
		this.estContenuDans = _estContenuDans;
	}
	
	//méthodes
	public boolean Ouvrir() {
		if(!this.estContenuDans && !this.estOuverte) {
			this.estOuverte = true;
			return true;
		}else {
			return false;
		}
	}
	public boolean Fermer() {
		if(!this.estContenuDans && this.estOuverte) {
			this.estOuverte = false;
			return true;
		}else {
			return false;
		}
	}
	public boolean PlacerDans(PoupeeRusse p) {
		if(!this.estContenuDans && !this.estOuverte && p.estOuverte && this.taille < p.taille) {
			this.estContenuDans = true;
			return true;
		}else {
			return false;
		}
	}
	public boolean SortirDe(PoupeeRusse p) {
		if(this.estContenuDans && p.estOuverte) {
			this.estContenuDans = false;
			return true;
		}else {
			return false;
		}
	}
}
