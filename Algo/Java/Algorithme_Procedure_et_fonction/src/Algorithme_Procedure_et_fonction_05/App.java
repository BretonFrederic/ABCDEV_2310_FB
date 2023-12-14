package Algorithme_Procedure_et_fonction_05;

public class App {
	/*
	Enoncé 5:
	Ecrire et utiliser une fonction qui vérifie la validité d’une date passer en paramètre (exemple la date 30/02/2023 n’est pas une date valide)

	FONCTION BOOLEEN IsDateValid(ENTIER day, ENTIER month, ENTIER year)

		month31days	ENTIER
		bissextile	BOOLEEN
		date		BOOLEEN


		SI year mod 4 = 0 ET year mod 100 != 0 OU year mod 400 = 0 ALORS
					bissextile <-- vrai
				SINON
					bissextile <-- faux
			FIN SI

		SI day > 0 Et day < 32 ALORS
			SI month > 0 Et month < 13 ALORS
				SI day = 31 ALORS
					POUR month31days = 1 à 7 par pas de 2 FAIRE
						SI month31days = month ALORS
							date <-- true
						FIN SI
					FIN POUR
					POUR month31days = 8 à 12 par pas de 2 FAIRE
						SI month31days = month ALORS
							date <-- true
						FIN SI
					FIN POUR

				SINON SI month = 2 ALORS
					SI day > 29 ALORS
						date <-- false
					SINON SI day = 29 Et bissextile = vrai Ou day = 28 Et bissextile = faux ALORS
						date <-- true
					SINON
						datte <-- false
					FIN SI
				SINON
					date <-- true
				FIN SI
			SINON
				date <-- false
			FIN SI
		SINON
			date <-- false
		FIN SI

		RETOURNE date
	FIN FONCTION
	*/
	
	public static boolean IsDateValid(int day, int month, int year) {

	int month31days;
	boolean bissextile;
	boolean date=false;


	if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
			bissextile = true;
			}else{
				bissextile = false;
	}

	if (day > 0 && day < 32) {
		if (month > 0 && month < 13) {
			if (day == 31) {
				for (month31days = 1; month31days < 7; month31days+=2) {
					if (month31days == month) {
						date = true;
					}
				}
				for (month31days = 8; month31days < 12; month31days+=2) {
					if (month31days == month) {
						date = true;
					}
				}

			}else if (month == 2) {
				if (day > 29) {
					date = false;
				}else if (day == 29 && bissextile == true || day == 28 && bissextile == false) {
					date = true;
				}else{
					date = false;
				}
			}else {
				date = true;
			}
		}else{
			date = false;
		}
	}else{
		date = false;
	}
	return date;
	}

	public static void main(String[] args) {
		
		/* VARIABLES */
		
		int day=29;
		int month=02;
		int year=2014;
		boolean date=false;
		
		/* DEBUT PROGRAMME */
		
		System.out.println("La fonction de ce programme vérifie si la date " + day + "/" + month + "/" + year + " passée en paramètre est valide");
		// Affectation de la booléen du retour de la fontion de vérification dans date
		date = IsDateValid(day,month,year);
		// on affiche un message suivant le retour de type booléen de la fonction
		if(date) {
			System.out.println("Cette date est valide.");
		}else if(!date){
			System.out.println("Cette date est invalide.");
		}
		
		/* FIN PROGRAMME */
		
	}

}
