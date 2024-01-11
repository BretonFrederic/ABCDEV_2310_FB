package exercice_bouteille_version1;

public class App {

	public static void main(String[] args) {
		/* VARIABLES */
		String nom = "Evian";
		double capacite = 2.0;
		double contenance = 1.2;
		boolean ouverte = false;
		double quantite = 0.8;
		
		/* DEBUT PROGRAMME */
		
		Bottle bouteille1 = new Bottle();
		
		Bottle bouteille2 = new Bottle(nom, capacite, contenance, ouverte);
		
		/* FIN PROGRAMME */
	}

}
