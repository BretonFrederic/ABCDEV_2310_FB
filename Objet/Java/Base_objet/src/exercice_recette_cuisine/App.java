package exercice_recette_cuisine;

public class App {

	public static void main(String[] args) {
		
		Plat choucroute1 = new Plat("Choucroute");
		Plat choucroute2 = new Plat("Choucroute");
		
		System.out.println(choucroute1.getNomPlat());
		
		if(choucroute1.Comparer(choucroute2)) {
			System.out.println("Il y a au moins un aliment identique et avec le même état dans les 2 plats");
		}
		
		IngredientCru nouveauIngredient = new IngredientCru("choucroute","cru", 500, "g");
		nouveauIngredient.Cuire(80);
		choucroute1.AjouterIngredient(nouveauIngredient);
		
		if(choucroute1.Comparer(choucroute2)) {
			System.out.println("Il y a au moins un aliment identique et avec le même état dans les 2 plats");
		}
	}

}
