package exercice_le_robot;

public class Detecteur {
	//attributs
	Position position;
	double rayon;
	
	//constructeurs
	public Detecteur(Position _position, double _rayon) {
		this.position = _position;
		this.rayon = _rayon;
	}
	
	//méthode
	public double perimetre() {
		double perimetre = 2* Math.PI * this.rayon;
		return perimetre;
	}
	
	public double surface() {
		double surface = Math.PI * Math.pow(this.rayon, 2);
		return surface;
	}
	
	public boolean Detecter(Position _position) {
		//pythagore
		double distancePoint = Math.sqrt(Math.abs(Math.pow(((_position.getPositionX() - this.position.getPositionX())), 2)) + Math.abs(Math.pow(((_position.getPositionY() - this.position.getPositionY())), 2)));
		if(rayon <= distancePoint) {
			System.out.println("Le scanner a détecté de la roche lunaire.");
			return true;
		}else {
			System.out.println("Le scanner n'a pas détecté de roche lunaire.");
			return false;
		}
	}
}
