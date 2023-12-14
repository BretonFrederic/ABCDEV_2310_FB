package Algorithme_Procedure_et_fonction_03;

public class App {

	/*
	Enoncé 3:
	Ecrire et utiliser une fonction calculant la moyenne de 2 nombres

	FONCTION Average(REEL nb1, REEL nb2)

	average		REEL

	average <-- (nb1 + nb2)/2
		 
	RETOURNE average
	FIN FONCTION
	*/
	
	public static double Average(double nb1,double nb2) {
		double average;

		average = (nb1 + nb2)/2;
		return average;
	}

	
	public static void main(String[] args) {
		
		/* VARIABLES */
		
		double number1=30;
		double number2=20;
		double result=0;
		
		/* DEBUT PROGRAMME */
		
		System.out.printf("Calcul de la moyenne de 2 nombres : %f et %f\n", number1, number2);
		result = Average(number1, number2);
		//result = Math.round(result*100.0)/100.0;
		System.out.printf("La moyenne de ces 2 nombres est : %.2f", result);
		
		/* FIN PROGRAMME */
		
	}

}
