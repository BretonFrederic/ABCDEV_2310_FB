package partie_3_Barnabe_fait_ses_courses;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/* VARIABLES */

		int magasin;
		int sommeDepart;
		double depense;

		/* DEBUT PROGRAMME */

		magasin = 0;
		
		Scanner saisie = new Scanner(System.in);
		System.out.println("Saisir une somme de départ supérieure à 1 : ");
		sommeDepart = saisie.nextInt();

		depense = (double)sommeDepart;

		if(depense > 1) {
			magasin = 1;
			while (depense > 1) {
				depense = depense / 2 - 1;
				magasin = magasin + 1;
			}
		}else {
			System.out.println("Vous devez saisir une somme supérieure à 1");
		}

		saisie.close();
		
		System.out.println("Barnabé a fait ses courses dans " + magasin + " magasin(s).");

		/* FIN PROGRAMME */
		
	}

}
