package exercice_algo_lesConditions_exrcice_4_2;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
        /* VARIABLES */
        
        int heure;
        int minute;
        int seconde;
        
        /* DEBUT PROGRAMME */
        
        Scanner utilisateur = new Scanner(System.in);
        
        System.out.println("Saisir l'heure : ");
        heure = utilisateur.nextInt();
        System.out.println("Saisir les minutes : ");
        minute = utilisateur.nextInt();
        System.out.println("Saisir les secondes : ");
        seconde = utilisateur.nextInt();
        
        if(seconde == 59){
            seconde = 0;
	        minute = minute + 1;
        }else if(seconde < 59){
            seconde = seconde + 1;
        }
        
        if(minute >= 59){
            minute = 0;
	        heure = heure + 1;
        }
        
        System.out.println("Dans une minute il sera " + heure + " heure(s) " + minute + " minute(s) et " + seconde + "seconde(s)");
        
        utilisateur.close();
        /* FIN PROGRAMME */

	}

}
