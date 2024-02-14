package exercice_recette_cuisine;

import java.util.Arrays;

public class Plat {
	//attributs
	private Ingredient[] choucroute;
	
	//constructeur
	public Plat() {
		choucroute = new Ingredient[]  {new Ingredient("choucroute","cuite", 500, "g"), 
										new Ingredient("lard","cuit", 150, "g"), 
										new Ingredient("lard","entier", 150, "g"), 
										new Ingredient("saucisse","cuite", 0, "g"),
										new Ingredient("saucisse","cuite", 0, "g"),
										new Ingredient("saucisse","entière", 0, "g"), 
										new Ingredient("saucisse","entière", 0, "g")};
	}
	
	//getters et setters
	public void setChoucroute(Ingredient _ingredient) {
		choucroute = choucroute + _ingredient;
	}
}
