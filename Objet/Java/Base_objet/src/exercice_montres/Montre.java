package exercice_montres;

public class Montre {
	
	//Variables d'instance
	private String proprietaire;
	private int heures;
	private int minutes;
	
	//getters et setters
	public void setProprietaire(String _proprietaire) {
		this.proprietaire = _proprietaire;
	}
	
	public void setMinutes(int _minutes) {
		this.minutes = _minutes%60;
	}
	
	public void setHeures(int _heures) {
		this.heures = _heures%24;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int getHeures() {
		return heures;
	}
	
	//Constructeur
	public Montre(String _proprietaire, int _heures, int _minutes) {
		this.proprietaire = _proprietaire;
		setHeures(_heures);
		setMinutes(_minutes);
	}
	
	public Montre(String _proprietaire, Montre _montre) {
		this.proprietaire = _proprietaire;
		setHeures(_montre.getHeures());
		setMinutes(_montre.getMinutes());
	}
	
	//Méthodes
	public void AfficherHeure() {
		if(this.getHeures() > 9 && this.getMinutes() > 9) {
			System.out.println(this.getHeures()+"h"+this.getMinutes());
		}else if(this.getHeures() < 10 && this.getMinutes() > 9) {
			System.out.println("0"+this.getHeures()+"h"+this.getMinutes());
		}else if(this.getHeures() > 9 && this.getMinutes() < 10) {
			System.out.println(this.getHeures()+"h0"+this.getMinutes());
		}else if(this.getHeures() < 10 && this.getMinutes() < 10) {
			System.out.println("0"+this.getHeures()+"h0"+this.getMinutes());
		}
		
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
