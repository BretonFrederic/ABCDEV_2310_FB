package partie_1_conversionKmsMiles;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		/* VARIABLES */

		double kilometres = 0.0;
		String valeurString = "init";
		double resultatMiles = 0.0;
		boolean quitter = false;

		/* CONSTANTES */

		final double KMS_TO_MILES = 1.609;

		/* DEBUT DE PROGRAMME */
		
		Scanner saisie = new Scanner(System.in);

		do {
			System.out.println("Saisir une valeur en kilomètres comprise entre 0.01 et 1 000 000 ou q pour quitter : ");
			valeurString = saisie.next();

			if(valeurString.compareTo("q") == 0) {
				quitter = true;
				//break;
				System.out.println("test_debug_q");
			}else if(valeurString.compareTo("q") != 0){
				kilometres = Double.parseDouble(valeurString);
				System.out.println("test_debug_no_q");
			}
		}while(kilometres < 0.01 || kilometres > 1000000 && quitter == false);

		if(quitter == false) {
			resultatMiles = kilometres/KMS_TO_MILES;
			System.out.println("La conversion de la valeur saisie est : " + resultatMiles);
		}else {
			System.out.println("Fin du programme.");		
		}
		saisie.close();
		/* FIN DE PROGRAMME */
	}
}
