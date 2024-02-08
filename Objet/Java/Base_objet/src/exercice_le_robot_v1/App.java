package exercice_le_robot_v1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		//Variables
		char quitter = ' ';
		int distance = 0;
		char fleche;
		char scan;
		char recolte;
		char infos;
		int option=0;
		Direction direction = Direction.DROITE;
		
		//Debut programme
		
		Secteur secteur1 = new Secteur();
		Robot r2d2 = new Robot("r2d2");
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t**********************************************");
		System.out.println("\t\t* Explorer un secteur de la lune de 20 x 20. *\n\t\t* Récolter 1000 g de roche lunaire.          *\n\t\t* Attention au niveau de la batterie !       *");
		System.out.println("\t\t*                                            *");
		System.out.println("\t\t**********************************************\n");
		
		//Boucle principale
		
		
		do {
			System.out.println("Saisir une option : \n\t1 - Se déplacer\n\t2 - Activer détecteur(rayon 2)\n\t3 - Récolter\n\t4 - Afficher infos");
			option = sc.nextInt();
			
			if(option == 1) {
				System.out.println("Saisir une distance à parcourir : ");
				distance = sc.nextInt();
				System.out.println("Saisir une direction avec z,q,s,d : ");
				fleche = sc.next().charAt(0);
				switch(fleche) {
					case 'z':
						direction = Direction.HAUT;
						break;
					case 's':
						direction = Direction.BAS;
						break;
					case 'q':
						direction = Direction.GAUCHE;
						break;
					case 'd':
						direction = Direction.DROITE;
						break;
					default:
						System.out.println("mauvaise touche.");
				}
				while(distance > 0) {
					r2d2.Avancer(direction);
					distance--;
				}
			}else if(option == 2) {
					r2d2.Detecter(secteur1);
			}else if(option == 3) {
					r2d2.Recolter(secteur1);
			}else if(option == 4) {
					r2d2.AfficherInfo();
			}
			
			if(r2d2.getStockage() < 999) {
				do {
					System.out.println("\nQuitter : \n\to = oui\n\tn = non\n");
					quitter = sc.next().charAt(0);
				}while(quitter != 'o' && quitter != 'n');
			}
			
			
		}while(quitter == 'n' || r2d2.getStockage() < 999);
		sc.close();
		//Fin programme
	}
}
