package exercice_recette_cuisine;

public class App {

	public static void main(String[] args) {
		
		Plat choucroute1 = new Plat();
		Plat choucroute2 = new Plat();
		
		if(choucroute1.Comparer(choucroute2)) {
			System.out.println("Il y a au moins un aliment identique et avec le même état dans les 2 plats");
		}
		
	}

}
