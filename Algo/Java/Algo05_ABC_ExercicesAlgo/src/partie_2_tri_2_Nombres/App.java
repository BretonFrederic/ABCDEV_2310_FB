package partie_2_tri_2_Nombres;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/* VARIABLES */

		int nombreA = 0;
		int nombreB = 0;
		boolean nombreValide = false;

		/* DEBUT DE PROGRAMME */

		nombreValide = false;
		
		Scanner saisie = new Scanner(System.in);

		while(nombreValide == false) {
			System.out.println("Saisir un premier nombre entier : ");
			nombreA = saisie.nextInt();
			System.out.println("Saisir un deuxième nombre entier : ");
			nombreB = saisie.nextInt();
			if(nombreA == nombreB) {
				System.out.println("Vous devez saisir deux nombres entier différents");
			}else {
				nombreValide = true;
			}
		}

		if(nombreA < nombreB) {
			System.out.println("L'ordre croissant des deux nombres entiers est : " + nombreA + ", " + nombreB);
			}else{
			System.out.println("L'ordre croissant des deux nombres entiers est : " + nombreB + ", "  + nombreA);
		}
		
		saisie.close();

		/* FIN DE PROGRAMME */

	}

}
