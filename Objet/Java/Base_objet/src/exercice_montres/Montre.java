package exercice_montres;

public class Montre {
	
	//Variables d'instance
	private String proprietaire;
	private int heures;
	private int minutes;
	private boolean estPortee;
	
	//getters et setters
	public void setProprietaire(String _proprietaire) {
		this.proprietaire = _proprietaire;
	}
	
	public void setEstPortee(boolean _estPortee) {
		this.estPortee = _estPortee;
	}
	
	public void setMinutes(int _minutes) {
		this.minutes = _minutes%60;
	}
	
	public void setHeures(int _heures) {
		this.heures = _heures%24;
	}
	
	public boolean getEstPortee() {
		return estPortee;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int getHeures() {
		return heures;
	}
	
	//Constructeur
	public Montre(int _heures, int _minutes) {
		this.proprietaire = "inconnu";
		setHeures(_heures);
		setMinutes(_minutes);
		this.estPortee = false;
	}
	
	public Montre(Montre _montre) {
		this.proprietaire = "inconnu";
		setHeures(_montre.getHeures());
		setMinutes(_montre.getMinutes());
		this.estPortee = false;
	}
	
	//Méthodes
	public String AfficherHeure() {
		String heures = Integer.toString(this.getHeures());
		String minutes = String.valueOf(this.getMinutes());
		String heureActuelle = "";
		
		if(this.getHeures() > 9 && this.getMinutes() > 9) {
			heureActuelle = heures+"h"+minutes;
		}else if(this.getHeures() < 10 && this.getMinutes() > 9) {
			heureActuelle = "0"+heures+"h"+minutes;
		}else if(this.getHeures() > 9 && this.getMinutes() < 10) {
			heureActuelle = heures+"h0"+minutes;
		}else if(this.getHeures() < 10 && this.getMinutes() < 10) {
			//heureActuelle = "0"+heures+"h0"+minutes;
			heureActuelle = String.format("%02dh%02d", this.getHeures(), this.getMinutes());
		}
		return heureActuelle;
	}
	
	public void AvancerUneMinute() {
		int heures=0;
		int min = 0;
		min = this.getMinutes()+1;
		if(min > 59){
            heures = this.getHeures() + min/60;
            this.setHeures(heures);
    		this.setMinutes(min);
        }else if(min <= 59) {
        	this.setMinutes(min);
        }
    }
}
