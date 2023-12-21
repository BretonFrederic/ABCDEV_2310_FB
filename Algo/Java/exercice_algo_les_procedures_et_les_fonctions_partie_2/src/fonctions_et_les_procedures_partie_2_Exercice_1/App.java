package fonctions_et_les_procedures_partie_2_Exercice_1;
import java.util.Scanner;

public class App {
	/*
	EXERCICE 1

	Écrivez la fonction pourcentage(), qui permet de calculer les pourcentages d’utilisation de la Carte Bleue, du chéquier et des 
	virements automatiques, sachant que la formule de calcul du pourcentage pour la Carte Bleue est :
	Nombre de paiements par Carte Bleue / Nombre total de paiements * 100
	Résultat attendu :
	Nombre de paiement par Carte Bleue : 5
	Nombre de chèques émis : 10
	Nombre de virements automatiques : 5
	Vous avez émis 20 ordres de débit dont :
	25.0 % par Carte Bleue
	50.0 % par cheque
	25.0 % par virement

	REEL FONCTION percentage(VAL ENTIER nbPaiements, VAL ENTIER nbTotalPaiements)

		pourcentage		REEL
		pourcentage <-- nbPaiements / nbTotalPaiements * 100
		RETOURNE pourcentage
		
	FIN FONCTION
	*/
	
	public static double percentage(int nbPayments, int totalNumberPayments) {

		double percentage;
		percentage = (double)nbPayments / (double)totalNumberPayments * 100;
		return percentage;	
	}
	
	public static void main(String[] args) {
		
		/* VARIABLES */
		
		int nbPayments[] = new int[3];
		int totalNumberPayments;
		double percentage[] = new double[3];
		
		/* DEBUT PROGRAMME */
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Saisir le nombre de paiement par Carte Bleue : ");
		nbPayments[0] = userInput.nextInt();
		
		System.out.println("Saisir le nombre de chèques émis : ");
		nbPayments[1] = userInput.nextInt();
		
		System.out.println("Saisir le nombre de virements automatiques : ");
		nbPayments[2] = userInput.nextInt();
		
		totalNumberPayments = nbPayments[0] + nbPayments[1] + nbPayments[2];
		System.out.printf("Vous avez émis %d ordres de débit dont :\n", totalNumberPayments);
		
		for(int i = 0; i <= percentage.length-1; i++) {
		percentage[i] = percentage(nbPayments[i], totalNumberPayments);
		}
		
		System.out.printf("%.1f %% par Carte Bleue\n", percentage[0]);
		System.out.printf("%.1f %% par cheque\n", percentage[1]);
		System.out.printf("%.1f %% par virement\n", percentage[2]);
		
		userInput.close();

		/* FIN PROGRAMME */
		
	}

}
