package algo_les_procedure_et_les_fonctions_partie_1exercice_01;
import java.util.Scanner;

public class App {
	/*
	EXERCICE 1

	Écrivez une fonction qui renvoie la somme de cinq nombres fournis en argument.
	
	ENTIER FONCTION SumNumbers(VAL ENTIER nb1, VAL ENTIER nb2, VAL ENTIER nb3, VAL ENTIER nb4, VAL ENTIER nb5)
	
	sum		ENTIER
	
	sum <-- nb1 + nb2 + nb3 + nb4 + nb5
	
	RETOURNE sum
	
	FIN FONCTION
	 */

	public static int SumNumbers(int nb1, int nb2, int nb3, int nb4, int nb5) {

	int sum;

	sum = nb1 + nb2 + nb3 + nb4 + nb5;

	return sum;
	}

	public static void main(String[] args) {
		int number[]= new int[5];
		int result;
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Saisir 5 nombres.");
		
		for(int i = 0; i <= number.length-1; i++) {
			System.out.print("- Nombre " + (i+1) + " : ");
			number[i] = userInput.nextInt();
			System.out.println(number[i]);
		}
		result = SumNumbers(number[0], number[1], number[2], number[3], number[4]);
		
		System.out.println("La somme de ces nombres est : " + result);
		userInput.close();
	}

}
