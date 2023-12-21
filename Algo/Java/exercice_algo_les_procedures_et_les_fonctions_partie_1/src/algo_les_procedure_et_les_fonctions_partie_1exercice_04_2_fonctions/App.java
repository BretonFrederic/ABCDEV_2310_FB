package algo_les_procedure_et_les_fonctions_partie_1exercice_04_2_fonctions;

import java.util.Scanner;

public class App {

	/*
	 EXERCICE 4
	
	Même question que précédemment, mais cette fois, la fonction Purgebis doit pouvoir recevoir un nombre 
	quelconque de caractères à supprimer en argument. Par exemple, Purgebis(phrase, "aeiouy") enlèvera 
	toutes les voyelles que contient la variable phrase.
	
	
	FONCTION CHAINE delCharInString(VAL CHAINE myString, VAL CARACTERE myChar)
		newString		CHAINE
	
		newString <-- ""
	
		POUR i <-- 0 À LONGUEUR(myString)-1 FAIRE
			SI myString[i] != myChar ALORS
				newString <-- newString + myString[i]
			FIN SI
		FIN POUR
		RETOURNE newString
	FIN FONCTION

	FONCTION CHAINE delStringInString(VAL CHAINE myString, VAL CHAINE myChars)
		newString		CHAINE
	
		newString <-- ""
	
		POUR i <-- 0 À LONGUEUR(myChars)-1 FAIRE
			newString <-- delCharInString(myString, myChars[i])
		FIN POUR
		RETOURNE newString
	FIN FONCTION
	 */
	
	public static String delCharInString(String myString, char myChar) {
		String newString;
	
		newString = "";
	
		for (int i = 0; i <= myString.length()-1; i++) {
			if(myString.charAt(i) != myChar) {
				newString = newString + myString.charAt(i);
			}
		}
		return newString;
	}

	public static String delStringInString(String myString, String myChars) {
		String newString;
	
		newString = "";
	
		for (int i = 0; i <= myChars.length()-1; i++) {
			newString = delCharInString(myString, myChars.charAt(i));
		}
		return newString;
	}
	
	
	public static void main(String[] args) {
		
		String userString="";
		String userChars="";
		String newString;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Saisir une chaine de caractères : ");
		userString = userInput.nextLine();
		
		System.out.println("Saisir les caractères à supprimer : ");
		userChars = userInput.nextLine();
		
		newString=delStringInString(userString, userChars);
		
		System.out.println("Chaine de caractères purgée : " + newString);
		
		userInput.close();
	}

}
