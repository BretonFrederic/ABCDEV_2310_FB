package exercice_algo_lesConditions_exrcice_8;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/* VARIABLES */

		int age;
		int ageDuPermis;
		int accident;
		int anneesDeFidelite;
		String tarif = "init";
		String refuse;

		/* DEBUT PROGRAMME */
		
		Scanner saisie = new Scanner(System.in);

		refuse = "Nous ne pouvons pas vous assurer.";

		System.out.println("Saisir votre âge : ");
		age = saisie.nextInt();
		System.out.println("Saisir depuis combien d'année(s) vous êtes titulaire du permis : "); 
		ageDuPermis = saisie.nextInt();
		System.out.println("Saisir le nombre d'accident(s) que vous avez eu : ");
		accident = saisie.nextInt();
		System.out.println("Saisir vos année(s) d'ancienneté dans notre compagnie d'assurance automobile : ");
		anneesDeFidelite = saisie.nextInt();

		saisie.close();
		if(age < 25 && ageDuPermis < 2){
			if(accident == 0){
				tarif = "rouge";
			}else {
			System.out.println(refuse);
			}
		}

		if(age < 25 && ageDuPermis > 2 || age > 25 && ageDuPermis < 2) {
			if(accident == 0) {
				tarif = "orange";
			}else if(accident == 1) {
				tarif = "rouge";
			}else {
				System.out.println(refuse);
			}
			
		}

		if(age > 25 && ageDuPermis > 2) {
			if(accident == 0) {
				tarif = "vert";
			}else if(accident == 1) {
				tarif = "orange";
			}else if(accident == 2) {
				tarif = "rouge";
			}else if(accident > 2) {
				System.out.println(refuse);
			}
		}

		if(age >= 23 && ageDuPermis >= 5 && anneesDeFidelite > 5) {
			if(tarif.equals("vert")) {
				tarif = "bleu";
			}else if(tarif.equals("orange")) {
				tarif = "vert";
			}else if(tarif.equals("rouge")) {
				tarif = "orange";
			}
		}

		System.out.println("Nous pouvons vous assurer, voici votre tarif : " + tarif );

		/* FIN PROGRAMME */
		
	}

}
