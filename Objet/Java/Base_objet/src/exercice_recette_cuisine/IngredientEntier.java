package exercice_recette_cuisine;

public class IngredientEntier extends Ingredient{

	//constructeur
	public IngredientEntier(String _nomAliment, String _etat, int _quantite, String _unite) {
		super(_nomAliment, _etat, _quantite, _unite);
	}
	
	//méthodes
	public void Decouper() {
		if(this.getEtat().equals("entier")) {
			this.setEtat("découpé");
		}
	}
}
