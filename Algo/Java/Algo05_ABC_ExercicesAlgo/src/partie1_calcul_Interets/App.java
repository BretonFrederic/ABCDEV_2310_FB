package partie1_calcul_Interets;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/* VARIABLES

		sommePlacee :	REEL
		interet :	REEL
		interetReel :	REEL
		nombreAnnees :	ENTIER
		interetSimple :	REEL
		interetCompose :REEL

		/* DEBUT DE PROGRAMME

		Ecrire "Veuillez saisir la somme placée sur un compte : "
		Lire sommePlacee

		Ecrire "Veuillez saisir l'intérêt offert par la banque : "
		Lire interet

		Ecrire "Veuillez saisir le nombre d'années de placement de la somme : "
		Lire nombreAnnees

		interetReel <-- interet/100

		interetSimple <-- sommePlacee * ( 1 + nombreAnnees * interetReel)
		interetCompose <-- sommePlacee * ( 1 + interetReel)^nombreAnnees

		Ecrire "Valeur acquise par la somme de ", sommePlacee,  ", placée pendant ", nombreAnnees, " année(s) : "

		Ecrire "	.  avec un intérêt simple : ", interetSimple
		Ecrire "	.  avec un intérêt composé : ", interetCompose

		FIN DE PROGRAMME */
		
		
		/* VARIABLES */

		double sommePlacee;
		double interet;
		double interetReel;
		int nombreAnnees;
		double interetSimple;
		double interetCompose;

		/* DEBUT DE PROGRAMME */
		
		Scanner saisie = new Scanner(System.in);

		System.out.println("Veuillez saisir la somme placée sur un compte : ");
		sommePlacee = saisie.nextDouble();

		System.out.println("Veuillez saisir l'intérêt offert par la banque : ");
		interet = saisie.nextDouble();

		System.out.println("Veuillez saisir le nombre d'années de placement de la somme : ");
		nombreAnnees = saisie.nextInt();
		
		saisie.close();

		interetReel = interet/100;

		interetSimple = sommePlacee * ( 1 + nombreAnnees * interetReel);
		interetCompose = sommePlacee * Math.pow(( 1.0 + interetReel),nombreAnnees);

		
		
		System.out.println("Valeur acquise par la somme de " + sommePlacee +  ", placée pendant " + nombreAnnees + " année(s) : ");

		System.out.println("	.  avec un intérêt simple : " + interetSimple);
		System.out.println("	.  avec un intérêt composé : " + interetCompose);

		/* FIN DE PROGRAMME */

	}

}
