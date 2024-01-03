package premier_objet_voiture;

public class Voiture {
	/* Attributs */
	String marque;
	String modele;
	int vitesseMax;
	double consoMixte;
	int reservoir;
	
	

	/* Méthodes */

	public int accelerer(int kilometresHeure){
		int vitesse = 10;
		vitesse += kilometresHeure;
		return vitesse;
	}
	
	public int freiner(int kilometresHeure){
		int vitesse = -10;
		if(kilometresHeure >= 10) {
			vitesse += kilometresHeure;
		}
		return vitesse;
	}
}
