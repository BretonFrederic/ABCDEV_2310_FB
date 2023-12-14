package Algorithme_Procedure_et_fonction_02;

public class App {
	/*
	Enoncé 2: 
		
	Ecrire et utiliser une procédure calculant le périmètre et l'aire d'un triangle en connaissant les 3 côtés
	Périmètre = p = a + b + c et aire = ((p/2-a)(p/2-b)(p/2-c))1/2


	PROCEDURE TriPeriArea(REEL a, REEL b, REEL c)

		peri	REEL
		area	REEL

		peri = a + b + c
		area = ((peri/2-a)(peri/2-b)(peri/2-c))1/2
			
		ECRIRE "Le périmètre du triangle est : ", peri
		ECRIRE "L'aire du triangle est : ", area
			
	FIN PROCEDURE
	*/
	
	public static void TriPeriArea(double a,double b,double c) {
		double peri;
		double area;

		peri = a + b + c;
		// Formule de Héron 𝐴 = √ 𝑑 ( 𝑑 − 𝑎 ) ( 𝑑 − 𝑏 ) ( 𝑑 − 𝑐 )
		// où 𝑑 est le demi-périmètre du triangle ou la moitié de son périmètre.
		
		double d = peri/2;
		area = Math.sqrt(d*(d-a)*(d-b)*(d-c));
			
		System.out.println("Le périmètre du triangle est : " + peri);
		System.out.println("L'aire du triangle est : " + area);
	}

	public static void main(String[] args) {
		
		/* VARIABLE */
		
		double a=20, b=24, c=28;
		
		/* DEBUT PROGRAMME */
		
		System.out.printf("Le périmètre et l'aire d'un triangle\na = " + a + "\nb = " + b + "\nc = " + c + "\n");
		TriPeriArea(a, b, c);
		
		/* FIN PROGRAMME */
	}

}
