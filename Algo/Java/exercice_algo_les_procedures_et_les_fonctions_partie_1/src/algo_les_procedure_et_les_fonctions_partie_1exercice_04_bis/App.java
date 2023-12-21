package algo_les_procedure_et_les_fonctions_partie_1exercice_04_bis;
import java.util.Scanner;

public class App {
	/*
	 EXERCICE 4
	
	Même question que précédemment, mais cette fois, la fonction Purgebis doit pouvoir recevoir un nombre 
	quelconque de caractères à supprimer en argument. Par exemple, Purgebis(phrase, "aeiouy") enlèvera 
	toutes les voyelles que contient la variable phrase.
	
	CHAINE FONCTION TrapString(VAL STRING myString, VAL STRING removeChar)
		
		newString		CHAINE
		
		newString <-- ""
		
		POUR i <-- 0 À LONGUEUR(myString)-1 FAIRE
			POUR j <-- 0 À LONGUEUR(removeChar)-1 FAIRE
				SI myString[i] != removeChar[j] ALORS
					newString <-- newString + myString[i]
				FIN SI
			FIN POUR
		FIN POUR
		
		RETOURNE newString
	FIN FONCTION
	 */
	
	public static String trapString(String myString, String removeChar) {
	
		String newString;
		
		newString = "";
		int count=0;
		
		for(int i = 0; i <= myString.length()-1; i++){
			count = 0;
			for(int j = 0; j <= removeChar.length()-1; j++) {
				if(myString.charAt(i) != removeChar.charAt(j)) {
					count++;
				}
				if(count == removeChar.length()) {
					newString = newString + myString.charAt(i);
				}
			}
		}
		return newString;
	}
	
	public static void main(String[] args) {
		
		String userString="";
		String userChar="";
		String newString;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Saisir une chaine de caractères : ");
		userString = userInput.nextLine();
		
		System.out.println("Saisir les caractères à supprimer : ");
		userChar = userInput.nextLine();
		
		newString=trapString(userString, userChar);
		
		System.out.println("Chaine de caractères purgée : " + newString);
		
		userInput.close();
	}

}
