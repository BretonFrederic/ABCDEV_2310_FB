package algo_les_procedures_et_les_fonctions_partie_1exercice_03;
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
	
	CHAINE FONCTION TrapChar(VAR STRING myString, VAL CHAR myChar)
		charArray[]	TAB CARACTERE
		newCharArray[]	TAB CARACTERE
		sizeArray		ENTIER
		charEqual			ENTIER
		
		charArray <-- CARACTERE[](myString)
		
		
		POUR i <-- 0 À LONGUEUR(charArray)-1 FAIRE
			Si charArray[i] != myChar ALORS
				sizeArray++
			FIN Si
		FIN POUR
		
		newCharArray[] <-- CARACTERE[sizeArray]
		
		POUR i <-- 0 À LONGUEUR(charArray)-1 FAIRE
			Si charArray[i] != myChar ALORS
				newCharArray[i-charEqual] <-- charArray[i]
			SINON
				charEqual++
			FIN Si
		FIN POUR
		
		myString <-- CHAINE(newCharArray)
		
		RETOURNE myString
	FIN FONCTION
	 */
	
	public static String TrapChar(String myString, char myChar) {
		char charArray[];
		char newCharArray[];
		int sizeArray=0;
		int charEqual=0;
		
		charArray = myString.toCharArray();
		
		
		for(int i = 0; i <= charArray.length-1; i++){
			if(charArray[i] != myChar) {
				sizeArray++;
			}
		}
		
		newCharArray = new char[sizeArray];
		
		for(int i = 0; i <= charArray.length-1; i++){
			if(charArray[i] != myChar) {
				newCharArray[i-charEqual] = charArray[i];
			}
			else {
				charEqual++;
			}
		}
		
		myString = new String(newCharArray);
		
		return myString;
	}

	public static void main(String[] args) {
		
		/* VARIABLES */
		
		String sentence;
		char character;
		
		/* DEBUT PROGRAMME */
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Saisir une chaine de caractère : ");
		sentence = userInput.nextLine();
		
		System.out.println("Saisir un caractère : ");
		character = userInput.next().charAt(0);
		
		sentence = TrapChar(sentence, character);
		
		System.out.println("Chaine de caractère saisie après purge du caractère " + character + " : \n" + sentence);
		
		userInput.close();
		
		/* FIN PROGRAMME */
		
	}

}
