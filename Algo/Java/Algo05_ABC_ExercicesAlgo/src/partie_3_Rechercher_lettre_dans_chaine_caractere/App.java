package partie_3_Rechercher_lettre_dans_chaine_caractere;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/* VARIABLES */

		String message;
		int occurence = -1;
		 


		/* DEBUT PROGRAMME */
		
		Scanner saisie = new Scanner(System.in);

		System.out.println("Saisir une chaine de caractères : ");
		message = saisie.nextLine();
		char[] caractere = message.toCharArray();

		if(message.equals("") || message.equals(".")) {
			System.out.println("La phrase est vide");
		}else {
			for(int i = 0; i < message.length(); i++) {
				if (caractere[1] == caractere[i]) {
					occurence = occurence + 1;
				}
			}
			if(occurence == 0) {
				System.out.println("\nLa lettre n'est pas présente(pas d'occurence)");
			}
		}
		
		if(occurence > 0) {
			if(caractere[1] >= 'a' && caractere[1] <= 'z' || caractere[1] >= 'A' && caractere[1] <= 'Z') {
				System.out.println("\nLa lettre \'" + caractere[1] + "\' est présente une ou plusieurs fois");
			}else {
				System.out.println("\nLe caractère spécial " + caractere[1] + " est présente une ou plusieurs fois");
			}
		}
		saisie.close();
		/* FIN DE PROGRAMME */
		
	}

}
