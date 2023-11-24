package partie_2_anneeBissextile;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		/* VARIABLES */

		int annee;
		double anneeMod4;
		double anneeMod100;
		double anneeMod400;

		/* DEBUT DE PROGRAMME */

		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Saisir une année : ");
		annee = saisie.nextInt();

		anneeMod4 = annee%4;
		anneeMod100 = annee%100;
		anneeMod400 = annee%400;

		if(anneeMod4 > 0) {
			System.out.println("L'année n'est pas bissextile");
		}

		if(anneeMod4 == 0) {
			if(anneeMod100 == 0 && anneeMod400 > 0) {
				System.out.println("L'année n'est pas bissextile");
		}else {
				System.out.println("L'année est bissextile");
			}
		}
		
		saisie.close();

		/* FIN DE PROGRAMME */
		
	}
}
