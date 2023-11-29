package partie_3_recherche_nombre_dans_tableau;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/* VALEURS */

		int nombreAleatoire;
		int liste[]= new int[10];
		int nombreUtilisateur;
		int devinerNombre = 0;
		int indice;

		/* DEBUT PROGRAMME */

		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Saisir un nombre entier entre 0 et 100 : ");
		nombreUtilisateur = saisie.nextInt();
		
		for(int i = 0; i < 10; i++) {
			nombreAleatoire = (int)Math.round(Math.random()*100);
			liste[i] = nombreAleatoire;
		}

		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(liste[i] < liste[j]) {
					int temp = liste[i];
					liste[i] = liste[j];
					liste[j] = temp;
				}
			}
		}

		for(int i = 0; i < 10; i++) {
			if(liste[i] == nombreUtilisateur) {
				indice = i+1;
				devinerNombre++;
				System.out.println("Votre nombre se trouve à l'indice " + indice);
			}
		}
		if(devinerNombre == 0) {
			System.out.println("404 Not found");
		}
		
		saisie.close();

		/* FIN PROGRAMME */
		
	}

}
