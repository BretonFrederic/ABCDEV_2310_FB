package exercice_algo_les_boucles_exercice_08;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		EXERCICE 8

		Lire la suite des prix (en euros entiers et terminée par zéro) des achats d’un client. Calculer la somme qu’il 
		doit, lire la somme qu’il paye, et simuler la remise de la monnaie en affichant les textes "10 Euros", "5 
		Euros" et "1 Euro" autant de fois qu’il y a de coupures de chaque sorte à rendre.

		--VARIABLES--

		prix		ENTIER
		somme		ENTIER


		--DEBUT PROGRAMME--

		DEBUT TANT QUE
		FAIRE
			ECRIRE "Saisir le prix de votre achat : "
			LIRE prix
			somme <-- somme + prix
			
		TANT QUE prix !=0
		FIN TANT QUE

		ECRIRE "Pour payer la somme de ", somme, " € ", " en monnaie vous devez donner : "

		TANT QUE somme > 0 FAIRE
			SI somme >= 10 ALORS
				ECRIRE " 10 €"
				somme = somme - 10
			SINON SI somme >= 5 ALORS
				ECRIRE " 5 €"
				somme = somme - 5
			SINON SI somme >= 1 ALORS
				ECRIRE " 1 €"
				somme = somme - 1
			FIN SI
		FIN TANT QUE

		--FIN PROGRAMME--
		*/
		
		/*VARIABLES*/

		int prix;
		int somme=0;


		/*DEBUT PROGRAMME*/

		Scanner userInput = new Scanner(System.in);
		
		
		do {
			System.out.println("Saisir le prix de votre achat : ");
			prix = userInput.nextInt();
			somme = somme + prix;
		}while(prix !=0);
			
			

		System.out.println("Pour payer la somme de " + somme + " € " + " en monnaie vous devez donner : \n");

		while(somme > 0) {
			if(somme >= 10) {
				somme -= 10;
				System.out.print("\t 10 €");
			}else if(somme >= 5) {
				somme -= 5;
				System.out.print("\t 5 €");
			}else if(somme >= 1) {
				somme -= 1;
				System.out.print("\t 1 €");
			}
		}

		userInput.close();

		/*FIN PROGRAMME*/
	}

}
