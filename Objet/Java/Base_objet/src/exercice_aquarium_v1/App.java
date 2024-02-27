package exercice_aquarium_v1;

public class App {

	public static void main(String[] args) {
		
		int count = 0;
		Algue a1 = new Algue();
		PoissonHerbivore p1 = new PoissonHerbivore("Philibert", "mâle", RaceH.BAR);
		
		//BOUCLE PRINCIPALE
		do {
			//Algue
			a1.Vieillir();
			
			//Poisson
			p1.Vieillir();
			
			count++;
		}while(count <= 20);
		
		
	}

}
