package exercice_recette_cuisine;

public class IngredientCru extends Ingredient{
	
	//constructeur
	public IngredientCru(String _nomAliment, String _etat, int _quantite, String _unite) {
		super(_nomAliment, _etat, _quantite, _unite);
	}
	
	//méthodes
	public void Cuire(int _temperature) {
		if(this.getEtat().equals("cru")&& _temperature > 70) {
			this.setEtat("cuit");
		}
	}
}
