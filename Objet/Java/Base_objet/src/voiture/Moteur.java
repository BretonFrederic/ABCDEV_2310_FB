package voiture;

public class Moteur {
	
	//variables d'instance
	int puissanceEnKw;
	int vitesseToursMinute;
	final int toursMinuteMax;
	boolean estAllumee;
	
	//getters et setters
	public int getToursMinute() {
		return vitesseToursMinute;
	}
	
	public void setToursMinute(int _vitesseToursMinute) {
		vitesseToursMinute =_vitesseToursMinute;
	}
	
	//méthodes
	public boolean AllumerMoteur() {
		if(!estAllumee) {
			estAllumee = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean EteindreMoteur() {
		if(estAllumee) {
			estAllumee = false;
			return true;
		}else {
			return false;
		}
	}
	
	//constructeur
	public Moteur(int _puissanceEnKw, int _vitesseToursMinute, int _toursMinuteMax, boolean _estAllumee) {
		puissanceEnKw = _puissanceEnKw;
		vitesseToursMinute = _vitesseToursMinute;
		toursMinuteMax = _toursMinuteMax;
		estAllumee = _estAllumee;
	}
}
