package exercice_algo_lesConditions_exercice_2_2;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
        int nombreUtilisateur1;
        int nombreUtilisateur2;
        
        Scanner nombre = new Scanner(System.in);
        System.out.println("Saisir un premier nombre : ");
        nombreUtilisateur1 = nombre.nextInt();
        
        System.out.println("Saisir un deuxième nombre : ");
        nombreUtilisateur2 = nombre.nextInt();
        
        if(nombreUtilisateur1 == 0 || nombreUtilisateur2 == 0){
            System.out.println("Le produit de ces 2 nombres est nul vous avez saisie au moins un nombre égal à zéro");
        }else if(nombreUtilisateur1 > 0 && nombreUtilisateur2 < 0){
            System.out.println("Le produit de ces 2 nombres est négatif");
        }else if(nombreUtilisateur1 < 0 && nombreUtilisateur2 > 0){
            System.out.println("Le produit de ces 2 nombres est négatif");
        }else if(nombreUtilisateur1 < 0 && nombreUtilisateur2 < 0){
            System.out.println("Le produit de ces 2 nombres est positif");
        }else if(nombreUtilisateur1 > 0 && nombreUtilisateur2 > 0){
            System.out.println("Le produit de ces 2 nombres est positif");
        }
        nombre.close();
	}

}
