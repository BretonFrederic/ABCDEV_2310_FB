package exercice_recette_cuisine;
import java.util.*;

public class Plat {
	//attributs
	private Ingredient[] recette;
	private String nomPlat;
	
	//constructeur
	public Plat(String _nomPlat) {
		nomPlat = _nomPlat;
		this.recette = new Ingredient[]{new Ingredient("choucroute", "cuit", 500, "g"), 
										new Ingredient("lard","cuit et entier", 150, "g"),
										new Ingredient("saucisse","cuit et entier", 0, "g"),  
										new Ingredient("saucisse","cuit et entier", 0, "g")};
	}
	
	//getters et setters
	public String getNomPlat() {
		return this.nomPlat;
	}
	
	public Ingredient[] getRecette() {
		return this.recette;
	}
	
	//méthodes
	public void AjouterIngredient(Ingredient _ingredient) {
		// taille courante du tableau d'ingrédient
	    int longueurTableau = this.recette.length;
	    // création d'un nouveau tableau qui est la copy de l'ancien de longueur +1
	    this.recette = Arrays.copyOf(this.recette, longueurTableau + 1);
	    // ajout d'un nouveau élément au tableau
	    this.recette[longueurTableau] = _ingredient;
	}
	
	public boolean Comparer(Plat _plat) {
		int compteur = 0;
		boolean identique = false;
		for(int i = 0; i <= this.recette.length-1; i++) {
			for(int j = 0; j <= _plat.recette.length-1; j++) {
				if(this.recette[i].Comparer(_plat.recette[j])) {
					compteur++;
				}
			}
		}
		if(compteur > 0) {
			identique = true;
		}
		return identique;
	}
}
