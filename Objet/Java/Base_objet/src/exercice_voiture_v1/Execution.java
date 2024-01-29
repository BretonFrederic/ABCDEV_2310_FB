package exercice_voiture_v1;

public class Execution {

	public static void main(String[] args) {
		
		Voiture voiture1 = new Voiture();
		Voiture voiture2 = new Voiture("Peugeot 308", 30420);
		
		voiture1.Afficher();
		voiture2.Afficher();
		
		voiture1.setMarque("Citroën C4");
		voiture1.setPrix(27250);
		
		voiture1.Afficher();
		
	}

}
