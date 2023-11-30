package partie_3_Rechercher_lettre_dans_chaine_caractere;

public class App {

	public static void main(String[] args) {
		
		/* VARIABLES */

		String message;
		int occurence = 0;
		 


		/* DEBUT PROGRAMME */

		System.out.println();
		message = "Donnez l'algorithme d'un programme qui compte le nombre d'occurrences d'une lettre donnée.";

		char[] caractere = message.toCharArray();
		
		System.out.println("Dans la chaine de caractères suivant : ");
		System.out.println(message);

		if(message.equals("")) {
			System.out.println("La phrase est vide");
		}else {
			for(int i = 0; i < message.length(); i++) {
				if (caractere[1] == caractere[i]) {
					occurence = occurence + 1;
				}
			}
		}
		
		if(occurence > 0) {
			System.out.println("La lettre est présente une ou plusieurs fois");
		}else {
			System.out.println("La lettre n'est pas présente");
		}
		
		/* FIN DE PROGRAMME */
		
	}

}
