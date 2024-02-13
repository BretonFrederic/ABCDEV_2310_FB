package exo_Robot_correction;

public class Telecommande {
	//Attributs
	private Robot robot;
	private boolean allumer, eteindre, avancer,tournerADroite, tournerAGauche, reculer;
	
	
	//Constructeur
	public Telecommande(Robot _robot) {
		this.robot = _robot;
		this.allumer = false;
		this.eteindre = false;
		this.avancer = false;
		this.tournerADroite = false;
		this.tournerAGauche = false;
		this.reculer = false;
	}
	//Méthodes
	
	/**
	 * Méthode qui permet d'activer le bouton Allumer de la 
	 * télécommande du robot donné en argument à la télécommande.
	 * @return
	 */
	public boolean Allumer() {
		if(!this.allumer) {
			this.robot.action(Bouton.ALLUMER);
			this.allumer = true;
			this.eteindre = false;
			System.out.println("Robot allumé");
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Méthode qui permet d'activer le bouton Eteindre de la 
	 * télécommande du robot donné en argument à la télécommande.
	 * @return
	 */
	public boolean Eteindre() {
		if(!this.eteindre) {
			this.robot.action(Bouton.ETEINDRE);
			this.allumer = false;
			this.eteindre = true;
			System.out.println("Robot éteint");
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Méthode qui permet d'activer le bouton Avancer de la 
	 * télécommande du robot donné en argument à la télécommande.
	 * @return
	 */
	public boolean Avancer() {
		if(!this.reculer && this.allumer) {
			this.robot.action(Bouton.AVANCER);
			this.avancer = true;
			this.reculer = false;
			System.out.println("Robot avance");
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Méthode qui permet d'activer le bouton TournerADroite de la 
	 * télécommande du robot donné en argument à la télécommande.
	 * @return
	 */
	public boolean TournerADroite() {
		if(!this.tournerAGauche && this.allumer) {
			this.robot.action(Bouton.TOURNERADROITE);
			this.tournerADroite = true;
			this.tournerAGauche = false;
			System.out.println("Robot tourne à droite");
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Méthode qui permet d'activer le bouton TournerAGauche de la 
	 * télécommande du robot donné en argument à la télécommande.
	 * @return
	 */
	public boolean TournerAGauche() {
		if(!this.tournerADroite && this.allumer) {
			this.robot.action(Bouton.TOURNERAGAUCHE);
			this.tournerADroite = false;
			this.tournerAGauche = true;
			System.out.println("Robot tourne à gauche");
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Méthode qui permet d'activer le bouton Reculer de la 
	 * télécommande du robot donné en argument à la télécommande.
	 * @return
	 */
	public boolean Reculer() {
		if(!this.avancer && this.allumer) {
			this.robot.action(Bouton.RECULER);
			this.avancer = false;
			this.reculer = true;
			System.out.println("Robot recule");
			return true;
		}else {
			return false;
		}
	}
}
