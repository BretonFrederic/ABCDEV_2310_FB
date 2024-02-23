package exercice_maison_v1;

public class Porte {

	//attributs
	private String couleur;
	
	//constructeur
	public Porte(String _couleur){
		
	}
	
	//getters et setters
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String _couleur) {
		this.couleur = _couleur;
	}
	
	//méthodes
	@Override
	public String toString(){
		return "\nSa porte est de couleur " + this.couleur;
	}
}
