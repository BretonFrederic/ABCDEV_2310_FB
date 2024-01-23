package exercice_montres;

public class Montre {
	
	//Variables d'instance
	private String proprietaire;
	private int heures;
	private int minutes;
	
	//getters et setters
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
	
	//Méthodes
	public void AfficherHeure(Montre _montre) {
		System.out.println(_montre.getHeures()+"h"+_montre.getMinutes());
	}
	
	public void AvancerUneMinute() {
		int min = this.getMinutes()+1;
		
		this.setMinutes(min);
        //if(this.getMinutes() > 59){
        //    heures = heures + minutes/60;
        //    this.minutes = minutes%60;
        //}
        //if(this.getHeures() > 23){
        //	this.heures = heures%24;
        //}
    }
	/*
	public void AvancerMinutes() {
		if(this.minutes < 59) {
		this.minutes += 1;
		}else {
			this.minutes = 0;
			if(this.heures < 23) {
				this.heures += 1;
			}else {
				this.heures = 0;
			}
		}
	}*/
}
