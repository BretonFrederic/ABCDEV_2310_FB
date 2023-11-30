package Jalon_Algorithme_Fibonacci;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/* VARIABLES */

		int position;
		int nb;
		String resultat;
		long nbPrecedent;
		long nbCourant;
		long nbSuivant;

		/* DEBUT PROGRAMME */
		
		Scanner saisie = new Scanner(System.in);

		System.out.println("Combien de nombres de la suite de Fibonacci souhaitez-vous afficher : ");
		nb = saisie.nextInt();
		
		position = 2;
		resultat = "\t0\n\t1";
		nbPrecedent = 0;
		nbCourant = 1;
		if (nb > 2) {
			while (position < nb) {
				nbSuivant = nbPrecedent + nbCourant;
				resultat = resultat + "\n\t" + nbSuivant;
				nbPrecedent = nbCourant;
				nbCourant = nbSuivant;
				position = position + 1;
			}
		}else {
			nb = 2;
		}
		System.out.println("Les" + nb + " premiers nombres de la suite de Fibonacci sont \n" + resultat);
		System.out.println(nb + " nombres affichés");
		saisie.close();

		/* FIN PROGRAMME */
		
	}

}
