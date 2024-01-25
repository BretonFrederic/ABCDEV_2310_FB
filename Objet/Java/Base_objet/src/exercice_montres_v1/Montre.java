package exercice_montres_v1;

public class Montre {
	//Variables d'instance
	private char identifiant;
	private boolean estPortee;
	private String proprietaire;
	private int heures;
	private int minutes;
		
	//constructeurs
	public Montre(char _identifiant, int _heures, int _minutes) {
		identifiant = _identifiant;
		estPortee = false;
		proprietaire = "";
		heures = _heures;
		minutes = _minutes;
	}
	
	public Montre(char _identifiant, Montre _montre) {
		identifiant = _identifiant;
		estPortee = false;
		proprietaire = "";
		heures = _montre.heures;
		minutes = _montre.minutes;
	}
	
	//setters et getters
	public void setProprietaire(String _nom) {
		proprietaire = _nom;
	}
	
	public void setEstPortee(boolean _estPortee) {
		estPortee = _estPortee;
	}
	
	public char getIdentifiant() {
		return identifiant;
	}
	
	//méthode
	public String AfficherHeure() {
		return String.format("La montre "+identifiant+" de "+proprietaire+" affiche %02dh%02d", this.heures, this.minutes);
	}
	
	public void AvancerUneMinute() {
		System.out.println("On avance la montre "+this.identifiant+" d'une minute.");
		this.minutes += 1;
		if(this.minutes > 59) {
			this.heures = this.heures + this.minutes/60;
			this.minutes = this.minutes%60;
		}
		if(this.heures > 23) {
			this.heures = this.heures%24;
		}
	}
}