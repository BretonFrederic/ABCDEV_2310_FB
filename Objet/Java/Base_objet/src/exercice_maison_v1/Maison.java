package exercice_maison_v1;

public class Maison {
	
	//attributs
	protected int surface;
	protected Porte unePorte;
	
	//construteur
	public Maison(int _surface) {
		this.surface = _surface;
		this.unePorte = new Porte("rouge");
	}
	//getters et setters
	public int getSurface() {
		return this.surface;
	}
	
	public void setSurface(int _surface) {
		this.surface = _surface;
	}
	
	//méthodes
	@Override
	public String toString() {
		return "\nJ'habite une maison, d'une surface de " + this.surface + " m2";
	}
}
