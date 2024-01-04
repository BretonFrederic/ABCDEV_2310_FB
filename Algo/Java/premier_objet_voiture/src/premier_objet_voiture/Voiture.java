package premier_objet_voiture;

public class Voiture {
	/* Attributs */
	String marque;
	String modele;
	int vitesseMax;
	double consoMixte;
	int reservoir;
	
	/* Méthodes */

	public void accelerer(){
		System.out.println("La voiture accélère !");
	}
	
	public void freiner(){
		System.out.println("La voiture est à l'arrêt !");
	}
}
