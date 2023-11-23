package exercice_algo_lesConditions_exrcice_1;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		/* VARIABLES */

		int nombreUtilisateur;

		/* DEBUT DE PROGRAMME */

		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Saisir un nombre : ");
		nombreUtilisateur = saisie.nextInt(); 

		if(nombreUtilisateur > 0) {
			System.out.println("Ce nombre est positif");
		}else{
			System.out.println("Ce nombre est négatif");
		}
		saisie.close();
		/* FIN DE PROGRAMME */
	}

}
