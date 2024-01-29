package exercice_geometry;

public class Cercle {
	
	//variables d'instance
	Point centre;
	double rayon;
	
	//constructeurs
	public Cercle(Point _centre, double _rayon) {
		this.centre = _centre;
		this.rayon = _rayon;
	}
	
	public double perimetre() {
		double perimetre = 2* Math.PI * this.rayon;//2PIr
		return perimetre;
	}
	
	public double surface() {
		double surface = Math.PI * Math.pow(rayon, 2);
		return surface;
	}
	
	public void Appartenance(Point _point) {
		//distancePoint = racineCarre(valeur abs(_point.x - this.point.x)² + valeur abs(_point.y - this.point.y)²)
		double distancePoint = Math.sqrt(Math.abs(_point.getAbscisse()- this.centre.getAbscisse()) + Math.abs(_point.getOrdonnee()- this.centre.getOrdonnee()));
		if(rayon == distancePoint) {
			System.out.println("Le point appartient au cercle.");
		}else {
			System.out.println("Le point n'appartient pas au cercle.");
		}
	}
	
	public void Afficher() {
		System.out.println("Le périmètre du cercle est : "+this.perimetre()+"\nLa surface du disque est : "+this.surface());
	}
}
