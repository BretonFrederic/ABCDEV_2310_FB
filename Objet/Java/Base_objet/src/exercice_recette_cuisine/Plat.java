package exercice_recette_cuisine;

import java.util.*;

public class Plat {
	//attributs
	private Ingredient[] recette;
	
	//constructeur
	public Plat() {
		this.recette = new Ingredient[]  {new Ingredient("choucroute","cuite", 500, "g"), 
										new Ingredient("lard","cuit et entier", 150, "g"),
										new Ingredient("saucisse","cuite et entière", 0, "g"),  
										new Ingredient("saucisse","cuite et entière", 0, "g")};
	}
	
	//getters et setters
	
	//méthodes
	public void AjouterIngredient(Ingredient _ingredient) {
		// taille courante du tableau d'ingrédient
	    int longueurTableau = this.recette.length;
	    // création d'un nouveau tableau qui est la copy de l'ancien de longueur +1
	    this.recette = Arrays.copyOf(this.recette, longueurTableau + 1);
	    // ajout d'un nouveau élément au tableau
	    this.recette[longueurTableau] = _ingredient;
	}
}
