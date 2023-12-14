package Algorithme_Procedure_et_fonction_04;
import java.util.Scanner;
public class App {
	/*
	Enoncé 4:
	Ecrire et utiliser une fonction déterminant si une année passée en paramètre est bissextile ou non


	FONCTION BOOLEEN Bissextile(ENTIER annee)
		bissextile BOOLEEN
			
		SI annee mod 4 = 0 ET annee mod 100 != 0 OU annee mod 400 = 0 ALORS
				bissextile <-- vrai
			SINON
				bissextile <-- faux
		FIN SI
			
		RETOURNE bissextile
	FIN FONCTION
	*/
	
	public static boolean Bissextile(int annee) {
		boolean bissextile;
			
		if(annee%4 == 0 && annee%100 != 0 || annee%400 == 0){
				bissextile = true;
		}else {
			bissextile = false;
			}
		return bissextile;
	}
	public static void main(String[] args) {
		
		/* VARIABLES */
		
		int annee;
		
		/* DEBUT PROGRAMME */
		
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.println("Saisir une année pour voir si elle est bissextile : ");
		annee = userInput.nextInt();
		
		if(Bissextile(annee)) {
			System.out.println("L'année est bissextile.");
		}else {
			System.out.println("L'année n'est pas bissextile.");
		}
		
		
		userInput.close();
		
		/* FIN PROGRAMME */
		
		
	}

}
