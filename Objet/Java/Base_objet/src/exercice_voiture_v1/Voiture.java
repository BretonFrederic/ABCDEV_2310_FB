package exercice_voiture_v1;

public class Voiture {
	
	//variables d'instance
	private String marque;
	private double prix;
	
	//constructeurs
	public Voiture() {
		marque = "inconnue";
		prix = 0;
	}
	
	public Voiture(String _marque, double _prix) {
		marque = _marque;
		prix = _prix;
	}
	
	//getters et setters
	public String getMarque() {
		return marque;
	}
	
	public double getPrix() {
		return prix;
	}
	
	public void setMarque(String _marque) {
		marque = _marque;
	}
	
	public void setPrix(double _prix) {
		prix = _prix;
	}
	
	//méthode
	public void Afficher() {
		System.out.println("La marque de la voiture est : "+ this.marque + " son prix est de : " + this.prix);
	}
}
