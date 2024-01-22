package exercice_montres;

public class Montre {
	
	//Variables d'instance
	private String nom;
	private int heures;
	private int minutes;
	
	//getters et setters
	public String getNom() {
		String nomDeMontre;
		nomDeMontre = nom;
		return nomDeMontre;
	}
	
	public int getHeures() {
		int heuresDeMontre;
		heuresDeMontre = heures;
		return heuresDeMontre;
	}
	
	public void setMinutes(int _minutes) {
		minutes = _minutes;
	}
	
	public void setHeures(int _heures) {
		heures = _heures;
	}
	
	public int getMinutes() {
		int MinutesDeMontre;
		MinutesDeMontre = minutes;
		return MinutesDeMontre;
	}
	
	//Constructeur
	public Montre(String _nomMontre, int _heures, int _minutes) {
		this.nom = _nomMontre;
		this.Initialisation(_heures, _minutes);
	}
	
	public Montre(Montre _montre) {
		this.nom = _montre.getNom();
		this.heures = _montre.getHeures();
		this.minutes = _montre.getMinutes();
	}
	
	//Méthodes
	public void Initialisation(int _heures, int _minutes) {
        if(_minutes > 59){
            this.setHeures(heures); = _heures + _minutes/60;
            this.minutes = _minutes%60;
        }
        if(this.heures > 23){
        	this.heures = this.heures%24;
        }
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
	
	public void AfficherHeures() {
		System.out.println(this.heures + "h" + this.minutes);
	}
}
