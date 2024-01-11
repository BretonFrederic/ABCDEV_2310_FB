package exercice_bouteille_version1;

public class App {

	public static void main(String[] args) {
		/* VARIABLES */
		String nom = "Evian";
		double capacite = 2.0;
		double contenance = 1.2;
		boolean ouverte = false;
		double quantite = 0.4;
		
		/* DEBUT PROGRAMME */
		
		Bottle bouteille1 = new Bottle();
		
		boolean testOuverture = bouteille1.ouvrir();
		boolean testRemplir = bouteille1.remplir(quantite);
		boolean vider = bouteille1.vider(quantite);
		boolean testRemplirTout = bouteille1.remplirTout();
		boolean testViderTout = bouteille1.viderTout();
		
		Bottle bouteille2 = new Bottle(nom, capacite, contenance, ouverte);
		
		testOuverture = bouteille2.ouvrir();
		testRemplir = bouteille2.remplir(quantite);
		vider = bouteille2.vider(quantite);
		testRemplirTout = bouteille2.remplirTout();
		testViderTout = bouteille2.viderTout();
		
		/* FIN PROGRAMME */
	}

}
