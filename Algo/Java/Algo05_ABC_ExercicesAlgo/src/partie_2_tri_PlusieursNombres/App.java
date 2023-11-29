package partie_2_tri_PlusieursNombres;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/* VARIABLES */

		double nombreA;
		double nombreB;
		double nombreC;

		double nombre1 = 0;
		double nombre2 = 0;
		double nombre3 = 0;

		/* DEBUT DE PROGRAMME */
		
		Scanner saisie = new Scanner(System.in);

			System.out.println("Saisir un premier nombre réel double précision : ");
			nombreA = saisie.nextDouble();
			System.out.println("Saisir un deuxième nombre réel double précision : ");
			nombreB = saisie.nextDouble();
			System.out.println("Saisir un troisième nombre réel double précision : ");
			nombreC = saisie.nextDouble();

		if(nombreA < nombreB){
			nombre1 = nombreA;
			nombre2 = nombreB;
		}else {
			nombre1 = nombreB;
			nombre2 = nombreA;
		}

		if(nombreC > nombre2) {
			nombre3 = nombreC;
			}else if(nombreC < nombre1) {
				nombre3 = nombre2;
				nombre2 = nombre1;
				nombre1 = nombreC;
			}else if(nombreC > nombre1 && nombreC < nombre2) {
				nombre3 = nombre2;
				nombre2 = nombreC;
		}
			
		System.out.println("L'ordre croissant des trois nombres réel double précision est : " + nombre1 + " " + nombre2 + " " + nombre3);
		saisie.close();
	}

}
