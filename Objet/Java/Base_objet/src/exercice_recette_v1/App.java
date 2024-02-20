package exercice_recette_v1;

public class App {

	public static void main(String[] args) {
		
		Plat plat1 = new Plat("Choucroute");
		plat1.addIngredient(new Ingredient("Choucroute",500,"g"));
		plat1.addIngredient(new Ingredient("Lard",150,"g"));
		plat1.addIngredient(new Ingredient("Saucisse",2,"unite"));
		
		System.out.println(plat1);
		
		Plat plat2 = new Plat("Choucroute au poisson");
		plat2.addIngredient(new Ingredient("Choucroute",250,"g"));
		plat2.addIngredient(new Ingredient("Lard",100,"g"));
		plat2.addIngredient(new Ingredient("Saucisse",50,"g"));
		
		boolean test1 = plat1.equals(plat2);
		
		System.out.println(test1);

	}

}
