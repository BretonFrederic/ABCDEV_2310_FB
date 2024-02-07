package exercice_le_robot;

public class Roche {
	
	//attributs
	private Position position;
	private Rectangle dimension;
	private String[] materiaux;
	private int[] pourcentage;
	
	//constructeur
	public Roche() {
		position = new Position(2, 4); // La position est en haut à droite de la zone de dimension 20*20
		dimension = new Rectangle(4, 4); // // La surface au sol est un carre de 4*4
		materiaux = new String[]{"pourcentageOxygene", 
								"pourcentageSilicium", 
								"pourcentageAluminium", 
								"pourcentageCalcium", 
								"pourcentageFer", 
								"pourcentageMagnesium", 
								"pourcentageTitane", 
								"pourcentageSodium"};
		pourcentage = new int[] {3, 60, 5, 12, 7, 6, 2, 5};
	}
	
	//getters et setters
	public Position getPosition() {
		return this.position;
	}
	
	public void setPosition() {
		this.position = new Position(-2,-2);
	}
	
	public String[] getMateriaux() {
		return this.materiaux;
	}
	
	public int[] getPourcentage() {
		return this.pourcentage;
	}
	
	public void setPourcentage(int[] _pourcentage) {
		this.pourcentage = _pourcentage;
	}
	
	//méthodes
}
