package exercice_algo_les_boucles_exercice_09;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		EXERCICE 9

		Écrire un algorithme qui permette de connaître ses chances de gagner au tiercé, quarté, quinté et autres 
		impôts volontaires. 
		On demande à l’utilisateur le nombre de chevaux partants, et le nombre de chevaux joués. Les deux 
		messages affichés devront être : 
		Dans l’ordre : une chance sur X de gagner 
		Dans le désordre : une chance sur Y de gagner
		X et Y nous sont donnés par la formule suivante, si n est le nombre de chevaux partants et p le nombre de 
		chevaux joués, le signe ! signifie « factorielle » :
		X = n ! / (n - p) ! 
		Y = n ! / (p ! * (n – p) !)
		NB : cet algorithme peut être écrit d’une manière simple, mais relativement peu performante. Ses 
		performances peuvent être singulièrement augmentées par une petite astuce. Vous commencerez par 
		écrire la manière la plus simple, puis vous identifierez le problème, et écrirez une deuxième version 
		permettant de le résoudre.


		--VARIABLES--

		nbHorses			ENTIER 32bits // nombre de chevaux partants
		horseBet			ENTIER 32bits // nombre de chevaux joués
		factorial_nbHorses	ENTIER 64bits // factorial de nombre de chevaux partants
		factorial_horseBet	ENTIER 64bits // factorial de nombre de chevaux joués
		factorial_diff		ENTIER 64bits // factorial de la différence nbHorses et horseBet
		diff				ENTIER 32bits // la différence nbHorses et horseBet
		ordre				ENTIER 64bits // une chance sur X de gagner
		desordre			ENTIER 64bits // une chance sur Y de gagner 
		i					ENTIER 32bits
		j					ENTIER 32bits
		k					ENTIER 32bits

		--DEBUT PROGRAMME--

		ECRIRE "Saisir le nombre de chevaux sur la grille de départ ? :"
		LIRE nbHorses
		ECRIRE "Saisir le nombre de chevaux joués ? :"
		LIRE horseBet

		factorial_nbHorses <-- 1
		factorial_horseBet <-- 1
		factorial_diff <-- 1
		diff <-- nbHorses – horseBet

		POUR i <-- 2 À nbHorses FAIRE
			factorial_nbHorses = factorial_nbHorses*i
		FIN POUR

		POUR j <-- 2 À horseBet FAIRE
			factorial_horseBet = factorial_horseBet*i
		FIN POUR


		POUR k <-- 2 À diff FAIRE
			factorial_diff = factorial_diff*i
		FIN POUR

		ordre = factorial_nbHorses / factorial_diff
		desordre = factorial_nbHorses / (factorial_horseBet * factorial_diff)


		ECRIRE "Dans l’ordre : une chance sur ", ordre, " de gagner."
		ECRIRE "Dans le désordre : une chance sur ", desordre, " de gagner." 

		--FIN PROGRAMME--
		*/
		
		/*VARIABLES*/

		int nbHorses; // nombre de chevaux partants
		int horseBet; // nombre de chevaux joués
		long factorial_nbHorses; // factorial de nombre de chevaux partants
		long factorial_horseBet; // factorial de nombre de chevaux joués
		long factorial_divide; 
		int diff; // la différence nbHorses et horseBet

		/*DEBUT PROGRAMME*/

		factorial_nbHorses = 1;
		factorial_horseBet = 1;
		factorial_divide = 1;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Saisir le nombre de chevaux sur la grille de départ ? :");
		nbHorses = userInput.nextInt();
		
		System.out.println("Saisir le nombre de chevaux joués ? :");
		horseBet = userInput.nextInt();

		// initialisation de diff pour calcul de sa factorielle
		diff = nbHorses-horseBet;

		// probabilité de gagner dans l'ordre
		for(int i = nbHorses; i > diff; i--) {
			factorial_nbHorses = factorial_nbHorses*i;
		}
		
		System.out.println("Dans l’ordre : une chance sur " + factorial_nbHorses + " de gagner.");

		for(int j = 2; j <= horseBet; j++) {
			factorial_horseBet = factorial_horseBet*j;
		}

		factorial_divide = factorial_nbHorses/factorial_horseBet;

		System.out.println("Dans le désordre : une chance sur " + factorial_divide + " de gagner."); 

		userInput.close();	
		
		/*FIN PROGRAMME*/
	}

}
