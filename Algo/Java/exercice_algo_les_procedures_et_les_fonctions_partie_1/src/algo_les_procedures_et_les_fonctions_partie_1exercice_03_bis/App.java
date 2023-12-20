package algo_les_procedures_et_les_fonctions_partie_1exercice_03_bis;

import java.util.Scanner;

public class App {

	/*
	 EXERCICE 3
	Ecrivez une fonction qui purge une chaîne d'un caractère, la chaîne comme le caractère étant passés en 
	argument. Si le caractère spécifié ne fait pas partie de la chaîne, celle-ci devra être retournée intacte. Par 
	exemple :
	• Purge("Bonjour","o") renverra "Bnjur"
	• Purge("J'ai horreur des espaces"," ") renverra "J'aihorreurdesespaces"
	• Purge("Bonjour tout le monde", "y") renverra "Bonjour tout le monde"
	 */
	
	public static String DelCharInString(String myString, char myChar) {
		String newString="";
		
		for(int i = 0; i <= myString.length()-1; i++) {
			if(myString.charAt(i) != myChar) {
				newString = newString + myString.charAt(i);
			}
		}
		return newString;
	}
	
	public static void main(String[] args) {
		
/* VARIABLES */
		
		String userString;
		char removeChars;
		String newString;
		
		
		/* DEBUT PROGRAMME */
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Saisir une chaine de caractère : ");
		userString = userInput.nextLine();
		
		System.out.println("Saisir les caractères à supprimer : ");
		removeChars = userInput.nextLine().charAt(0);
		
		newString = DelCharInString(userString, removeChars);
		System.out.println("Chaine de caractère saisie après purge des caractères " + removeChars + " : \n" + newString);
		
		userInput.close();
		
	}

}
