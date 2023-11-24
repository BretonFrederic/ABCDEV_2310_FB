package partie_2_conversionKmsMiles;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		/*EXERCICE 2.7 : CONVERSION KILOMETRES → MILES
		L'utilisateur saisit une valeur en kilomètres comprise entre 0.01 et 1 000 000. Si la valeur est hors limite, l'utilisateur est invité à 
		saisir une nouvelle valeur. Si la valeur est égale à "q", le programme se termine et se ferme. 
		Formule km vers mi : 1 miles = 1.609 kilomètres
		Le programme affiche le résultat de la conversion sous forme de nombre réel double précision.*/
		
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
			
			if(valeurString.equals("q")) {
				quitter = true;
				System.out.println("Fin du programme.");
			}else if(!valeurString.equals("q")){
				kilometres = Double.parseDouble(valeurString);
				if(kilometres >= 0.01 && kilometres <= 1000000) {
					resultatMiles = kilometres/KMS_TO_MILES;
					System.out.println("La conversion de la valeur saisie est : " + resultatMiles);
					quitter = true;
					}else if(kilometres < 0.01 && kilometres > 1000000) {
						System.out.println("Vous avez saisie une valeur hors limite.");
						quitter = false;
				}
			}
		}while(quitter == false);
		saisie.close();
		/* FIN DE PROGRAMME */
	}
}
