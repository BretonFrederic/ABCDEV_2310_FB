package exercice_porte_garage;

public class PorteDeGarage {
	
	//Attribut
	private String systemeOuverture;
	private final int positionMax;
	private final int positionMin;
	private int pourcentageOuverture;
	private boolean estOuverte;
	private boolean estVerrouillee;
	
	//Méthode
	public boolean OuvrirTout() {
		if(!estOuverte && !estVerrouillee) {
			pourcentageOuverture = positionMax;
			estOuverte = true;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean FermerTout() {
		if(estOuverte && !estVerrouillee) {
			pourcentageOuverture = positionMin;
			estOuverte = false;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean Verrouiller() {
		if(!estOuverte && !estVerrouillee) {
			estVerrouillee = true;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean Deverrouiller() {
		if(!estOuverte && estVerrouillee) {
			estVerrouillee = false;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean Ouvrir(int _pourcentageOuverture) {
		if(_pourcentageOuverture > pourcentageOuverture &&_pourcentageOuverture < positionMax && !estVerrouillee) {
			pourcentageOuverture = _pourcentageOuverture;
			if(pourcentageOuverture == 0) {
				estOuverte = false;
				}else {
					estOuverte = true;
				}
			return true;
		}else {
			return false;
		}
	}
	
	public boolean Fermer(int _pourcentageOuverture) {
		if(_pourcentageOuverture < pourcentageOuverture &&_pourcentageOuverture >= positionMin && !estVerrouillee) {
			pourcentageOuverture = _pourcentageOuverture;
			if(pourcentageOuverture == 0) {
			estOuverte = false;
			}else {
				estOuverte = true;
			}
			return true;
		}else {
			return false;
		}
	}
	
	//Constructeur
	public PorteDeGarage() {
		systemeOuverture = "basculante";
		positionMax = 100;
		positionMin = 0;
		pourcentageOuverture = 0;
		estOuverte = false;
		estVerrouillee = true;
	}
	public PorteDeGarage(String _systemeOuverture, int _positionMax, int _positionMin, int _pourcentageOuverture, boolean _estOuverte, boolean _estVerrouillee) {
		systemeOuverture = _systemeOuverture;
		positionMax = _positionMax;
		positionMin = _positionMin;
		pourcentageOuverture = _pourcentageOuverture;
		estOuverte = _estOuverte;
		estVerrouillee = _estVerrouillee;
	}
}
