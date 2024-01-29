package voiture;

public class Voiture {
	/*
	//variables d'instance
	Moteur moteur;
	int capaciteConsommation;
	boolean contientConducteur;
	final int vitesseMax;
	int vitesseReelle;
	int rapportVitesse;
	int poidsVoiture;
	
	//getters et setters
	
	//méthode
	public boolean Demarrer() {
		if(contientConducteur && !(moteur == null) && this.Arreter()) {
			this.moteur.AllumerMoteur();
			return true;
		}else {
			return false;
		}
	}
	
	public boolean Arreter() {
		if(contientConducteur && !(moteur == null) && this.Demarrer()) {
			this.moteur.EteindreMoteur();
			return true;
		}else {
			return false;
		}
	}
	
	public boolean PasserVitesseSup() {
		if(contientConducteur && this.Demarrer() && !this.Accelerer()) {
			if(rapportVitesse < 6) {
				rapportVitesse += 1;
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	public boolean PasserVitesseInf() {
		if(contientConducteur && this.Demarrer() && !this.Accelerer()) {
			if(rapportVitesse > -1) {
				rapportVitesse -= 1;
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	/*
	public boolean Accelerer() {
		if(contientConducteur && !this.Accelerer() && !this.Freiner()) {
			//320 = 18000/320
			// |  6   | 5   | 4   | 3   | 2   | 1 |
			// |56.25 |     
			vitesseReelle = this.moteur.toursMinuteMax/this.vitesseMax*rapportVitesse;
		}
	}
	
	//public boolean Freiner() {
	//	if(contientConducteur && !this.Accelerer()) {
			
	//	}
	}
	
	//constructeur
	//public Voiture(Moteur _moteur, int _capaciteConsommation, )
	*/
}
