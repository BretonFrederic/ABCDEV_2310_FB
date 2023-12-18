package algo_les_procedure_et_les_fonctions_partie_1exercice_02;
import java.util.Scanner;

public class App {

	/*
	 EXERCICE 2

Écrivez une fonction qui renvoie le nombre de voyelles contenues dans une chaîne de caractères passée en 
argument.

CHAINE ENTIER VowelExtractor(VAL CHAINE myString)

vowel	BOOLEEN
count	ENTIER

vowel <-- myString[i] = 'A' || myString[i] = 'a' || myString[i] = 'E' || myString[i] = 'e' || myString[i] = 'I' || myString[i] = 'i' || myString[i] = 'O' || myString[i] = 'o' || myString[i] = 'U' || myString[i] = 'u' || myString[i] = 'Y' || myString[i] = 'y'

POUR I <-- 0 À LONGUEUR(myString)-1 FAIRE
	SI vowel ALORS
		count++
	FIN SI
FIN POUR

RETOURNE count
FIN FONCTION
	 */
	
	public static int VowelExtractor(String myString) {
		
		char myChar[] = myString.toCharArray();
		int count = 0;
		

		for(int i = 0; i <= myChar.length-1; i++) {
			if(myChar[i] == 'A' || myChar[i] == 'a' || myChar[i] == 'E' || myChar[i] == 'e' || myChar[i] == 'I' || myChar[i] == 'i' || myChar[i] == 'O' || myChar[i] == 'o' || myChar[i] == 'U' || myChar[i] == 'u' || myChar[i] == 'Y' || myChar[i] == 'y') {
				count++;
			}
		}

		return count;
	}

	
	public static void main(String[] args) {
		
		String userString;
		int vowelNumber;
		
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.println("Saisir une chaine de caractères : ");
		userString = userInput.nextLine();
		
		vowelNumber = VowelExtractor(userString);
		
		System.out.println("Le nombre de voyelle(s) dans cette chaine de caractères est : " + vowelNumber);
		
		userInput.close();
	}

}
