import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        /* VARIABLES */
        
        int sexe = 0;
        String sexeString = "";
        int age = 0;
        boolean impot = false;
        String decision = "";
        
        /* DEBUT PROGRAMME */
        
        Scanner user = new Scanner(System.in);
        
        System.out.println("Saisir votre âge : ");
        age = user.nextInt();
        System.out.println("Saisir 1 si vous êtes une femme ou 2 si vous êtes un homme : ");
        sexe = user.nextInt();
        
        if(sexe == 2){
            System.out.println(sexe);
            sexeString = " homme";
        }else if(sexe == 1){
            sexeString = " femme";
        }
        
        if(sexe == 2 && age > 20){
            impot = true;
        }else if(sexe == 1){
            if(age > 17 && age < 36){
                impot = true;
            }
        }else{
            impot = false;
        }
        
        if(impot == true){
            decision = "êtes";
        }else if(impot == false){
            decision = "n'êtes pas";
        }
        
        System.out.println("Vous avez "+ age + " ans et vous êtes un(e)" + sexeString + " vous "+ decision + " imposable.");
        
        /* FIN PROGRAMME */
    }
}