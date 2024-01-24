package exercice_poupees_Russes_v2;

public class PoupeeRusse {
	//variables d'instances
	private char identifiantPoupee;
	private int taille;
	private boolean estOuverte;
	private boolean contient;
	private boolean estContenuDans;
	private char estContenuDansPoupee;
	private char contientPoupee;
	
	//constructeurs
	public PoupeeRusse(char _identifiantPoupee, int _taille) {
		identifiantPoupee = _identifiantPoupee;
		taille = _taille;
		estOuverte = false;
		contient = false;
		estContenuDans = false;
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
			this.setContenirPoupee(p, p);
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
	public void setContenirPoupee(PoupeeRusse poupeeQuiContient, PoupeeRusse poupeeContenu) {
		//
	}
	public void setViderPoupee(PoupeeRusse poupeeQuiContient, PoupeeRusse poupeeContenu) {
		//
	}
}
