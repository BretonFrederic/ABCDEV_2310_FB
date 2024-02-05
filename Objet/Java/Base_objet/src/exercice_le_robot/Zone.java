package exercice_le_robot;

public class Zone {
	
	//attributs
	private String nom;
	private Rectangle taille;
	private Roche roche;
	private Base base;
	private Robot robot;
	
	//constructeur
	public Zone() {
		nom = "Mer de tranquillité";
		taille = new Rectangle(2, 2);
		roche = new Roche();
		base = new Base();
		robot = new Robot();
	}
	
	//getters
	public Robot getRobot() {
		return robot;
	}
}
