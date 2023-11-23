package exercice_algo_lesConditions_exrcice_4;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
        /* VARIABLES */
        
        int heure;
        int minute;
        
        /* DEBUT PROGRAMME */
        
        Scanner utilisateur = new Scanner(System.in);
        System.out.println("Saisir l'heure : ");
        heure = utilisateur.nextInt();
        System.out.println("Saisir les minutes : ");
        minute = utilisateur.nextInt();
        
        if(minute == 59){
            minute = 0;
	        heure = heure + 1;
        }else if(minute < 59){
            minute = minute + 1;
        }
        
        System.out.println("Dans une minute il sera " + heure + " heures " + minute);
        
        utilisateur.close();
        
        /* FIN PROGRAMME */

	}

}
