package exercice_le_robot;

public class Base {
	
	//attributs
	private String nom;
	private Position position;
	private Rectangle dimension;
	private int batterie;
	private Roche reserveEchantillon;
	private int pieceMecanique;
	
	//constructeur
	public Base() {
		nom = "Base lunaire";
		position = new Position(16, 4); // La position est en haut à gauche de la zone de dimension 20*20
		dimension = new Rectangle(8, 8); // La surface au sol est un carre de 8*8
		batterie = 100;
		reserveEchantillon = new Roche();
		pieceMecanique = 10;
	}
}
