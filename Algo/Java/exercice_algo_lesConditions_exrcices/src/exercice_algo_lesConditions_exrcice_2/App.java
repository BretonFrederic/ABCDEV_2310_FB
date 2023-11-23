package exercice_algo_lesConditions_exrcice_2;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
        int nombreUtilisateur1;
        int nombreUtilisateur2;
        Scanner utilisateur = new Scanner(System.in);
        System.out.println("Saisir un premier nombre : ");
        nombreUtilisateur1 = utilisateur.nextInt();
        System.out.println("Saisir un second nombre : ");
        nombreUtilisateur2 = utilisateur.nextInt();
        
        if(nombreUtilisateur1 > 0 && nombreUtilisateur2 < 0){
            System.out.println("Le porduit de ces 2 nombres est négatif");
        }else if(nombreUtilisateur1 < 0 && nombreUtilisateur2 > 0){
            System.out.println("Le porduit de ces 2 nombres est négatif");
        }else if(nombreUtilisateur1 < 0 && nombreUtilisateur2 < 0){
            System.out.println("Le porduit de ces 2 nombres est positif");
        }else if(nombreUtilisateur1 > 0 && nombreUtilisateur2 > 0){
            System.out.println("Le porduit de ces 2 nombres est positif");
        }
        utilisateur.close();
	}

}
