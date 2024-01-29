package exercice_Rectangle;

public class Rectangle {
	
	//variables d'instance
	private double longueur;
	private double largeur;
	
	//constructeurs
	public Rectangle(double _longueur, double _largeur) {
		longueur = _longueur;
		largeur = _largeur;
	}
	
	//méthodes
	public double Surface() {
		double surface = this.longueur*this.largeur;
		return surface;
	}
	
	public double Perimetre() {
		double perimetre = (this.longueur+this.largeur)*2;
		return perimetre;
	}
	
	public void Afficher() {
		System.out.println("La surface du rectangle est : "+this.Surface()+"\nLe périmètre du rectangle est : "+this.Perimetre());
	}
}
