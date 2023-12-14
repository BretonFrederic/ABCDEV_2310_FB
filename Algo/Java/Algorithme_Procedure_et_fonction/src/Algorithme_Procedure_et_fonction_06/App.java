package Algorithme_Procedure_et_fonction_06;

public class App {
	/*
	Enoncé 6:
	Ecrire et utiliser une procédure qui reçoit une chaîne de caractères et qui retourne 
	cette même chaîne inversée (Le dernier caractère devient le premier, l'avant dernier 
	le deuxième…). Un seul argument sera utilisé.

	FONCTION CHAINE reverse(CHAINE sentence)

	temp[]				CARACTERE
	reverseSentence[]	CARACTERE
	revesrseString		CHAINE

	//temp = sentence.toCharArray();
	temp <-- CARACTERE[](sentence)
	POUR i <-- 0 À LONGUEUR(sentence) FAIRE
		reverseSentence[LONGUEUR(sentence)-i] <-- temp[i]
	FIN POUR

	revesrseString <-- CHAINE(reverseSentence)

	RETOURNE reverseSentence
	FIN FONCTION
	*/
	
	public static String reverse(String sentence) {

	char temp[];
	char reverseSentence[];
	String reverseString;

	temp = sentence.toCharArray();
	reverseSentence= sentence.toCharArray();
	
	for (int i = 0; i <= temp.length-1; i++){
		reverseSentence[(temp.length-1)-i] = temp[i];
	}
	
	reverseString = String.valueOf(reverseSentence);

	return reverseString;
	}

	public static void main(String[] args) {
		
		/* VARIABLE */
		
		String userString = "pneumonoultramicroscopicsilicovolcanoconiosis";
		String newString;
		
		/* DEBUT PROGRAMME */
		
		System.out.println("Chaîne de caractères avant inversion : " + userString);
		newString = reverse(userString);
		System.out.println("\nChaîne de caractères après inversion : " + newString);
		
		/* FIN PROGRAMME */
	}

}
