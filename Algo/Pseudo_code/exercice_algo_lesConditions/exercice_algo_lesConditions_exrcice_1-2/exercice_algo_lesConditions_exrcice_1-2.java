import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        int nombreUtilisateur;
        Scanner utilisateur = new Scanner(System.in);
        System.out.println("Saisir un nombre : ");
        nombreUtilisateur = utilisateur.nextInt();
        
        if(nombreUtilisateur == 0){
            System.out.println("Vous avez saisie le nombre zéro qui est ni positif ni négatif");
        }else if(nombreUtilisateur > 0){
            System.out.println("Ce nombre est positif");
        }else if(nombreUtilisateur < 0){
            System.out.println("Ce nombre est négatif");
        }
    }
}