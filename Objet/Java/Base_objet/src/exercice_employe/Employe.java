package exercice_employe;
import java.util.Calendar;

public class Employe {
	
	//variables d'instance
	private String matricule;
	private String nom;
	private String prenom;
	private int anneeNaissance;
	private int anneeEmbauche;
	private double salaire;
	
	private Calendar cal = Calendar.getInstance();
	private int anneeCourante = cal.get(Calendar.YEAR);
	
	//constructeur
	public Employe(String _matricule, String _nom, String _prenom, int _anneeNaissance, int _anneeEmbauche, double _salaire) {
		this.matricule = _matricule;
		this.nom = _nom;
		this.prenom = _prenom;
		this.anneeNaissance = _anneeNaissance;
		this.anneeEmbauche = _anneeEmbauche;
		this.salaire = _salaire;
	}
	
	//méthodes
	public int age() {
		int age = anneeCourante - anneeNaissance;
		return age;
	}
	
	public int anciennete() {
		int anciennete = anneeCourante - anneeEmbauche;
		return anciennete;
	}
	
	public void AugmentationDuSalaire() {
		int anciennete = anciennete();
		if(anciennete < 5) {
			this.salaire += this.salaire*0.02;
		}else if(anciennete < 10) {
			this.salaire += this.salaire*0.05;
		}else {
			this.salaire += this.salaire*0.1;
		}
	}
	
	public void AfficherEmploye() {
		System.out.printf("Matricule : %s\nNom : %s\nPrénom : %s\nAge : %d\nAncienneté : %d\nSalaire : %.1f", this.matricule, this.nom, this.prenom, this.age(), this.anciennete(), this.salaire);
	}
}
