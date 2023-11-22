package partie_1_ComparaisonDeNombres;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/* VARIABLES */

		int age;

		/* CONSTANTE */

		int majorite;

		/* DEBUT DE PROGRAMME */
		
		Scanner saisie = new Scanner(System.in);

		majorite = 18;

		System.out.println("Saisir votre âge (en années): ");
		age = saisie.nextInt();
		
		if(age < 0) {
			System.out.println("Vous n'êtes pas encore né");
		}else if(age >= majorite) {
			System.out.println("Vous êtes majeur");
		}else {
			System.out.println("Vous êtes mineur");
		}
		
		saisie.close();

		/* FIN DE PROGRAMME */

	}

}
