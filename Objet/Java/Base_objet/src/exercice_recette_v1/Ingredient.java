package exercice_recette_v1;

import java.util.ArrayList;

public class Ingredient {

	private  String nomAliment;
	private ArrayList<Etat> etatIngredient;
	private int quantite;
	private String unite;
	
	public Ingredient(String _nomAliment, int _quantite, String _unite) {
		this.nomAliment = _nomAliment;
		this.etatIngredient = new ArrayList<Etat>();
		this.etatIngredient.add(Etat.CRU);
		this.etatIngredient.add(Etat.ENTIER);
		this.quantite = _quantite;
		this.unite = _unite;
	}
	
	public String getNom() {
		return this.nomAliment;
	}
	
	public ArrayList<Etat> getEtat(){
		return this.etatIngredient;
	}
	
	public int getQuantite() {
		return this.quantite;
	}
	
	public String getUnite() {
		return this.unite;
	}
	
	public boolean equals(Object o) {
		return (o instanceof Ingredient) && this.nomAliment.equals(((Ingredient)o).nomAliment) && this.etatIngredient.equals(etatIngredient);
	}
}
