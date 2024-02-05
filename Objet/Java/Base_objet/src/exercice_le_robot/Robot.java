package exercice_le_robot;

public class Robot {
	
	//attributs
	private String nom;
	private Position position;
	private int batterie;
	private int moteur;
	private int chassi;
	private int brasArticule;
	private int roues;
	private Roche reserveEchantillon;
	private Detecteur scanner;
	
	//constructeur
	public Robot() {
		nom = "Lunokhod";
		position = new Position(16, 4); // La position est en haut à gauche de la zone de dimension 20*20
		//taux d'usure des composants du robot en pourcentage
		batterie = 100;
		moteur = 100;
		chassi = 100;
		brasArticule = 100;
		roues = 100;
		reserveEchantillon = new Roche();
		scanner = new Detecteur(this.position, 4);
	}
}
