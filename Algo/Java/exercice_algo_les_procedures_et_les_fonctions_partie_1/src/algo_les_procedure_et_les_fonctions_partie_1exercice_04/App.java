package algo_les_procedure_et_les_fonctions_partie_1exercice_04;

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
	
	public static String TrapString(VAL STRING myString, VAL STRING removeChar) {
	
	char arrayString[];
	char arrayChar[];
	char newString[];
	int arraySize;
	int charEqual;
	
	
	arrayString = myString.tocharArray();
	arrayChar = removeChar.toCharArray();
	
	arraySize = arrayString.length;
	
	for(int i = 0; i <= arrayString.length-1; i++) {
		POUR (int j = 0; j <= arrayChar.length-1; j++){
			SI (arrayString[i] = arrayChar[j]) ALORS
				arraySize--
			FIN SI
		}
	}
	
	newString <-- TAB CARACTERE[arraySize]
	
	POUR (i <-- 0 À LONGUEUR(arraySize)-1) FAIRE
		SI (arrayString[i] != arrayChar[i]) ALORS
			newString[i-charEqual] <-- arrayString[i]
		SINON
			charEqual++
		FIN SI
	FIN POUR
	
	myString = new String(newString);
	
	return myString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
