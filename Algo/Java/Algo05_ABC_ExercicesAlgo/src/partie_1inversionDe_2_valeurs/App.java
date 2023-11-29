package partie_1inversionDe_2_valeurs;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/* VARIABLES */

		int a;
		int b;
		int tempA;

		/* DEBUT DE PROGRAMME */
		
		Scanner saisie = new Scanner(System.in);

		System.out.println("Veuillez saisir le nombre a : ");
		a = saisie.nextInt();

		System.out.println("Veuillez saisir le nombre b : ");
		b = saisie.nextInt();

		System.out.println("Valeurs avant inversion.");
		System.out.println("La valeur de a est : " + a);
		System.out.println("La valeur de b est : " + b);

		tempA = a;
		a = b;
		b = tempA;

		System.out.println("Valeurs après inversion.");
		System.out.println("La valeur de a est : " + a);
		System.out.println("La valeur de b est : " + b);
		
		saisie.close();

		/* FIN DE PROGRAMME */

	}

}
