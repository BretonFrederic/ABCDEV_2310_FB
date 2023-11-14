import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        /* VARIABLES */

        int ageEnfant;

        /* DEBUT PRoGRAMME */

        Scanner age = new Scanner(System.in);

        System.out.println("Saisir l'âge d'un enfant : ");
        ageEnfant = age.nextInt();

        if(ageEnfant >= 6 && ageEnfant <= 7){
            System.out.println("L'enfant est un Poussin");
        }else if(ageEnfant >= 8 && ageEnfant <= 9){
            System.out.println("L'enfant est un Pupille");
        }else if(ageEnfant >= 10 && ageEnfant <= 11){
            System.out.println("L'enfant est un Minime");
        }else if(ageEnfant >= 12){
            System.out.println("L'enfant est un Cadet");
        }

        /* FIN PROGRAMME */
    }
}