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
	
	//setters et getters
	public void setProprietaire(String _nom) {
		proprietaire = _nom;
	}
	
	public char getIdentifiant() {
		return identifiant;
	}
	
	//méthodes
	public Montre(char _identifiant, Montre _montre) {
		identifiant = _identifiant;
		estPortee = false;
		proprietaire = "";
		heures = _montre.heures;
		minutes = _montre.minutes;
	}
	
	public String AfficherHeure(Montre _montre) {
		return String.format("%02dh%02d", _montre.heures, _montre.minutes);
	}
	
	public void AvancerUneMinute() {
		this.minutes += 1;
		if(this.minutes > 59) {
			this.heures = this.heures + this.minutes/60;
			this.minutes = this.minutes%60;
		}
	}
}