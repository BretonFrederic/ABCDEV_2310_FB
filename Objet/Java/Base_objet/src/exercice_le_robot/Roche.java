package exercice_le_robot;

public class Roche {
	
	//attributs
	private Position position;
	private Rectangle dimension;
	private int pourcentageOxygene;
	private int pourcentageSilicium;
	private int pourcentageAluminium;
	private int pourcentageCalcium;
	private int pourcentageFer;
	private int pourcentageMagnesium;
	private int pourcentageTitane;
	private int pourcentageSodium;
	
	//constructeur
	public Roche() {
		position = new Position(2, 2); // La position est en haut à droite de la zone de dimension 20*20
		dimension = new Rectangle(4, 4); // // La surface au sol est un carre de 4*4
		pourcentageOxygene = 3;
		pourcentageSilicium = 60;
		pourcentageAluminium = 5;
		pourcentageCalcium = 12;
		pourcentageFer = 7;
		pourcentageMagnesium = 6;
		pourcentageTitane = 2;
		pourcentageSodium = 5;
	}
}
