package exercice_recette_cuisine;

import java.util.*;

public class Plat {
	//attributs
	private Ingredient[] choucroute;
	
	//constructeur
	public Plat() {
		this.choucroute = new Ingredient[]  {new Ingredient("choucroute","cuite", 500, "g"), 
										new Ingredient("lard","cuit et entier", 150, "g"),
										new Ingredient("saucisse","cuite et entière", 0, "g"),  
										new Ingredient("saucisse","cuite et entière", 0, "g")};
	}
	
	//getters et setters
	
	//méthodes
	public void AjouterIngredient(Ingredient _ingredient) {
		// taille courante du tableau d'ingrédient
	    int longueurTableau = this.choucroute.length;
	    // création d'un nouveau tableau qui est la copy de l'ancien de longueur +1
	    this.choucroute = Arrays.copyOf(this.choucroute, longueurTableau + 1);
	    // ajout d'un nouveau élément au tableau
	    this.choucroute[longueurTableau] = _ingredient;
	}
}
