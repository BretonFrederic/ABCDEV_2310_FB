package exercice_date_v1;

public class Date {
	//Attributs
	private int jour;
	private int mois;
	private int annee;
	private boolean estValide;
	private static String[] moisEnLettres;
	
	//Constructeur
	public Date(int _jour, int _mois, int _annee) {
		this.jour = _jour;
		this.mois = _mois;
		this.annee = _annee;
		this.estValide = false;
		this.moisEnLettres = new String[]{"janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre"};
	}
	
	private boolean ValiderDate() {
		//verifie si année est bissextile
		if(this.annee%4 == 0 && this.annee%100 != 0 || this.annee%400 == 0) {
			if(this.mois == 2 && this.jour >= 1 && this.jour <= 29) {
				this.estValide = true;
				return true;
			}else if(this.mois != 2 && this.mois >=1 && this.mois <= 7) {
				if(this.mois%2 == 0) {
					//
				}
			}
			return true;
		}else {
			return false;
		}
	}
	
	public static String Afficher(Date _date) {
		
	}
	
	public boolean Comparer(Date _date) {
		//code
		return false;
	}
}
