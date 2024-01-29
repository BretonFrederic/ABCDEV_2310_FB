package exercice_geometry;

public class Point {
	
	//variables d'instance
	private double abscisse;
	private double ordonnee;
	
	//constructeurs
	public Point(double _abscisse, double _ordonnee) {
		this.abscisse = _abscisse;
		this.ordonnee = _ordonnee;
	}
	
	//getters
	public double getAbscisse(){
		return this.abscisse;
	}
	
	public double getOrdonnee(){
		return this.ordonnee;
	}
}
