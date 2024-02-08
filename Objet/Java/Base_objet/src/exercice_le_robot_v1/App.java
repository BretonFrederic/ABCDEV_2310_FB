package exercice_le_robot_v1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		//Variables
		char quitter = 'n';
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
			System.out.printf("\nPosition robot : x = %d, y = %d\n", r2d2.getPosition().getPositionX(), r2d2.getPosition().getPositionY());
			System.out.println("\nSaisir une option : \n\t1 - Se déplacer\n\t2 - Activer détecteur(rayon 2)\n\t3 - Récolter\n\t4 - Afficher infos\n\t5 - Quitter");
			
			option = sc.nextInt();
			
			if(option == 1) {
				System.out.println("Saisir une distance à parcourir : ");
				distance = sc.nextInt();
				System.out.println("Saisir une direction avec Z (nord) , Q (est) , S (sud), D (ouest) : ");
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
			}else if(option == 5) {
				do {
					System.out.println("\nQuitter : \n\to = oui\n\tn = non\n");
					quitter = sc.next().charAt(0);
				}while(quitter != 'o' && quitter != 'n');
			}

			if(r2d2.getStockage() > 999) {
				System.out.println("Mission réussie !\nTotal : "+r2d2.getStockage()+" gramme(s)");
			}else if(r2d2.getStockage() < 999 && r2d2.getBatterie() == 0) {
				System.out.println("Mission échouée !\nBatterie : "+r2d2.getBatterie()+" %");
			}
		}while(quitter == 'n' && r2d2.getStockage() < 999 && r2d2.getBatterie() > 0);
		sc.close();
		//Fin programme
	}
}
