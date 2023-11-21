package partie1_calculAireVolumeSphere;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/* 
		VARIABLES

		rayonR :	REEL
		aireSphere :	REEL
		volumeSphere :	REEL

		DEBUT DE PROGRAMME

		Ecrire "Veuillez saisir le rayon R : "
		Lire rayonR

		aireSphere <-- 4*π*rayonR^2
		volumeSphere <-- (4*π*rayonR^3)/3

		Ecrire "L'aire de la Sphere est : ", aireSphere
		Ecrire "Le volume de la Sphere est : ", volumeSphere

		FIN DE PROGRAMME 
		*/
		
		/* VARIABLES */

		double rayonR;
		double aireSphere;
		double volumeSphere;

		/* DEBUT DE PROGRAMME */

		Scanner rayon = new Scanner(System.in);
		
		System.out.println("Veuillez saisir le rayon R : ");
		rayonR = rayon.nextDouble();

		aireSphere = 4*Math.PI*Math.pow(rayonR,2);
		volumeSphere = (4*Math.PI*Math.pow(rayonR,3)/3);

		System.out.println("L'aire de la Sphere est : " + aireSphere);
		System.out.println("Le volume de la Sphere est : " + volumeSphere);
		
		rayon.close();

		/* FIN DE PROGRAMME */
	}

}
