package partie1_calculDeLaMoyenneDe2Nombres;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/* VARIABLES */
		
		int nombre1;
		int nombre2;
		double moyenne;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le premier nombre : ");
		nombre1 = sc.nextInt();
		
		System.out.println("Saisir le deuxième nombre : ");
		nombre2 = sc.nextInt();
		
		moyenne = (nombre1 + nombre2)/2d;
		
		System.out.println("La moyenne de " + nombre1 + " et " + nombre2 + " est " + moyenne );
		
		sc.close();
	}

}
