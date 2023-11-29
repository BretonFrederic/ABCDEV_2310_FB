package partie1_SurfaceSecteurCirculaire;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/* VARIABLES

		rayonR :		REEL
		angleA :		REEL
		aireSecteurCirculaire :	REEL

		/* DEBUT DE PROGRAMME

		Ecrire "Veuillez saisir le rayon R : "
		Lire rayonR

		Ecrire "Veuillez saisir l'angle A : "
		Lire angleA

		aireSecteurCirculaire <-- (π*rayonR^2*angleA)/360

		Ecrire "L'aire du secteur circulaire est : ", aireSecteurCirculaire

		/* FIN DE PROGRAMME */
		
		
		/* VARIABLES */

		double rayonR;
		double angleA;
		double aireSecteurCirculaire;
		double aireSecteurArrondi;

		/* DEBUT DE PROGRAMME */
		
		Scanner secteur = new Scanner(System.in);

		System.out.println("Veuillez saisir le rayon R : ");
		rayonR = secteur.nextDouble();

		System.out.println("Veuillez saisir l'angle A : ");
		angleA = secteur.nextDouble();
		
		secteur.close();

		aireSecteurCirculaire = (Math.PI*Math.pow(rayonR, 2)*angleA)/360;
		aireSecteurArrondi = Math.round(aireSecteurCirculaire * 1000.0) / 1000.0;

		System.out.println("L'aire du secteur circulaire est : " + aireSecteurArrondi);

		/* FIN DE PROGRAMME */

	}

}
