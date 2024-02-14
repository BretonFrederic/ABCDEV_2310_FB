package exercice_recette_cuisine;

public class Ingredient {
	//attributs
	private String nomAliment, etat, unite;
	private int quantite;
	
	//constructeur
	public Ingredient(String _nomAliment, String _etat, int _quantite, String _unite) {
		this.nomAliment = _nomAliment;
		this.etat = _etat;
		this.quantite = _quantite;
		this.unite = _unite;
	}
	
	//getters et setters
	public String getNomAliment() {
		return this.nomAliment;
	}
}
