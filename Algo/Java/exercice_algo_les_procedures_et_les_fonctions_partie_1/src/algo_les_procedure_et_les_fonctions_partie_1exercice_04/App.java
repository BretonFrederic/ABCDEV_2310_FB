package algo_les_procedure_et_les_fonctions_partie_1exercice_04;
import java.util.Scanner;

public class App {
	/*
	 EXERCICE 4

	Même question que précédemment, mais cette fois, la fonction Purgebis doit pouvoir recevoir un nombre 
	quelconque de caractères à supprimer en argument. Par exemple, Purgebis(phrase, "aeiouy") enlèvera 
	toutes les voyelles que contient la variable phrase.
	
	CHAINE FONCTION TrapString(VAL STRING myString, VAL STRING removeChar)
		
		arrayString[]		TAB CARACTERE
		arrayChar[]			TAB CARACTERE
		newString[]			TAB CARACTERE
		arraySize			ENTIER
		charEqual			ENTIER
		
		
		arrayString <-- TAB CARACTERE(myString)
		arrayChar <-- TAB CARACTERE(removeChar)
		
		arraySize <-- LONGUEUR(arrayString)
		
		POUR i <-- 0 À LONGUEUR(arrayString)-1 FAIRE
			POUR j <-- 0 À LONGUEUR(arrayChar)-1 FAIRE
				SI arrayString[i] = arrayChar[j] ALORS
					arraySize--
				FIN SI
			FIN POUR
		FIN POUR
		
		newString <-- TAB CARACTERE[arraySize]
		
		POUR i <-- 0 À LONGUEUR(arraySize)-1 FAIRE
			SI arrayString[i] != arrayChar[i] ALORS
				newString[i-charEqual] <-- arrayString[i]
			SINON
				charEqual++
			FIN SI
		FIN POUR
		
		myString <-- CHAINE(newString)
		
		RETOURNE myString
	FIN FONCTION
	 */
	
	public static String TrapString(String myString, String removeChar) {
	
	char arrayString[];
	char arrayChar[];
	char newString[];
	int arraySize=0;
	int charEqual=0;
	int count=0;
	
	// on mets les chaines de caractères dans un tableau de char
	arrayString = myString.toCharArray();
	arrayChar = removeChar.toCharArray();
	
	// on récupère la taille du tableau de la chaine de caractères à purger
	arraySize = myString.length();
	
	// si les deux tableaux on un caractère en commun on retire 1 à la taille du tableau purgé 
	for(int i = 0; i <= arrayString.length-1; i++) {
		for(int j = 0; j <= arrayChar.length-1; j++){
			if(arrayString[i] == arrayChar[j]){
				arraySize--;
			}
		}
	}
	
	// on initialise la taille du tableau qui doit contenir la chaine purgé
	newString = new char[arraySize];
	
	// on compare chaque lettre de la chaine aux caractères de purge
	for(int i = 0; i <= arrayString.length-1; i++) {
		for(int j = 0; j <= arrayChar.length-1; j++){
			if(arrayString[i] != arrayChar[j]) {
				charEqual++;
			}
		}
		// si le compteur de non égalité vaut le nombre de caractères de purge
		// on ajoute la lettre dans le nouveau tableau
		if(arrayChar.length == charEqual) {
			newString[i-count] = arrayString[i];
		}else {
			count++;
		}
		charEqual = 0;
	}
	
	myString = new String(newString);
	
	return myString;
	}

	public static void main(String[] args) {
		
		/* VARIABLES */
		
		String userString;
		String removeChars;
		String newString;
		
		
		/* DEBUT PROGRAMME */
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Saisir une chaine de caractère : ");
		userString = userInput.nextLine();
		
		System.out.println("Saisir les caractères à supprimer : ");
		removeChars = userInput.nextLine();
		
		newString = TrapString(userString, removeChars);
		System.out.println("Chaine de caractère saisie après purge des caractères " + removeChars + " : \n" + newString);
		
		userInput.close();
		
		/* FIN PROGRAMME */
		
		
	}

}
