package exercice_maison_v1;

public class Appartement extends Maison {
	
	//constructeur
	public Appartement() {
		super(50);
	}
	//méthode
	@Override
	public String toString(){
		return "\nJ'habite un appartement, d'une surface de " + this.getSurface() + " m2 ";
	}
}
