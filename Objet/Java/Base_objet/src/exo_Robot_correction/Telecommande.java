package exo_Robot_correction;
import java.util.Scanner;


public class Telecommande {
	//Attributs
	private Robot robot;
	private char touche;
	Scanner sc;
	
	//private String touche;
	
	//Constructeur
	public Telecommande(Robot _robot) {
		this.robot = _robot;
		this.touche = ' ';
		this.sc = new Scanner(System.in);
	}
	//Méthodes
	
	/**
	 * Méthode qui permet de contrôler les actions d'un robot avec les touches du clavier.
	 * z - avancer, q - tourner à gauche, s - reculer, d - tourner à droite, a - allumer, e - eteindre, k - Fin du programme
	 * @param _touche
	 */
	public void Controleur() {
		while(touche != 'k') {
			System.out.println("\nMenu télécommande : \n\tA - Allumer\n\tE - Eteindre\n\tZ - Avancer\n\tS - Reculer\n\tQ - tourner à gauche\n\tD - Tourner à droite\n\tI - info robot\n\tK - Quitter\n");
			touche = sc.next().charAt(0);
			switch(touche) {
			case 'z':
				robot.action(Bouton.AVANCER);
				break;
			case 'q':
				robot.action(Bouton.TOURNERAGAUCHE);
				break;
			case 's':
				robot.action(Bouton.RECULER);
				break;
			case 'd':
				robot.action(Bouton.TOURNERADROITE);
				break;
			case 'a':
				robot.action(Bouton.ALLUMER);
				break;
			case 'e':
				robot.action(Bouton.ETEINDRE);
				break;
			case 'i':
				System.out.println(this.robot.affichageRobotInfo());
				break;
			case 'k':
				System.out.println("Fin de programme.");
				break;
				default:
					System.out.println("Erreur de touche.");
			}
			System.out.println(this.robot.affichageRobotInfo());
		}
		
		sc.close();
	}
}
