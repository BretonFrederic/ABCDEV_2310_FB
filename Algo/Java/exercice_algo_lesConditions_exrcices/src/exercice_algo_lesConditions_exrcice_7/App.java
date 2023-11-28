package exercice_algo_lesConditions_exrcice_7;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/* VARIABLES */

		double scoreCandidat1;
		double scoreCandidat2;
		double scoreCandidat3;
		double scoreCandidat4;

		/* DEBUT PROGRAMME */
		
		Scanner saisie = new Scanner(System.in);

		System.out.println("Saisir le score du premier candidat : ");
		scoreCandidat1 = saisie.nextInt();
		
		System.out.println("Saisir le score du premier candidat : ");
		scoreCandidat2 = saisie.nextInt();

		System.out.println("Saisir le score du premier candidat : "); 
		scoreCandidat3 = saisie.nextInt();

		System.out.println("Saisir le score du premier candidat : ");
		scoreCandidat4 = saisie.nextInt();

		saisie.close();
		if(scoreCandidat1 > 50){
			System.out.println("il est élu dès le premier tour.");
		}else if(scoreCandidat1 < 12.5){ 
			System.out.println("il est battu dès le premier tour.");
		}else {
			if(scoreCandidat1 > scoreCandidat2 && scoreCandidat1 > scoreCandidat3 && scoreCandidat1 > scoreCandidat4){
				System.out.println("il se trouve en ballottage favorable");
			}else {
				System.out.println("il se trouve en ballottage défavorable");
			}
		}


		/* FIN PROGRAMME */

	}

}













