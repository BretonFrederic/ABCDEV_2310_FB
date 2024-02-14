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
		boolean estBissextile = this.annee%4 == 0 && this.annee%100 != 0 || this.annee%400 == 0;
		boolean fevrier29 = this.mois == 2 && this.jour >= 1 && this.jour <= 29;
		boolean fevrier28 = this.mois == 2 && this.jour >= 1 && this.jour <= 28;
		
		//valide mois de février à 29 jours années bissextile et mois de février à 28 jours pour années non bissextile
		if(estBissextile && fevrier29 || !estBissextile && fevrier28) {
			this.estValide = true;
		}else{
			this.estValide = false;
		}
		
		boolean semestre1 = this.mois != 2 && this.mois >=1 && this.mois <= 7 && this.mois%2 == 0 && this.jour >= 1 && this.jour <= 30 || this.mois%2 != 0 && this.jour >= 1 && this.jour <= 31;
		boolean semestre2 = this.mois != 2 && this.mois >=8 && this.mois <= 12 && this.mois%2 == 0 && this.jour >= 1 && this.jour <= 31 || this.mois%2 != 0 && this.jour >= 1 && this.jour <= 30;
			
		//valide les mois de 30 jours et de 31 jours de janvier à juillet
		if(semestre1) {
			this.estValide = true;
		}
		//valide les mois de 30 jours et de 31 jours de août à décembre
		if(semestre2) {
			this.estValide = true;
		}
		return this.estValide;
	}
	
	public static String Afficher(Date _date) {
		
	}
	
	public boolean Comparer(Date _date) {
		//code
		return false;
	}
}
