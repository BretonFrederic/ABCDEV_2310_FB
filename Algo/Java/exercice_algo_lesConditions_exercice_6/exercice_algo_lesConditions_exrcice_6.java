import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        /* VARIABLES */
        
        String sexe = "";
        String sexeFinal = "";
        int age = 0;
        boolean impot = false;
        String decision = "";
        
        /* DEBUT PROGRAMME */
        
        Scanner user = new Scanner(System.in);
        Scanner user1 = new Scanner(System.in);
        
        System.out.println("Saisir votre âge : ");
        age = user.nextInt();
        System.out.println("Saisir f si vous êtes une femme ou h si vous êtes un homme : ");
        sexe = user1.nextLine();
        
        if(sexe == "h" && age > 20){
            impot = true;
        }else if(sexe == "f"){
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
        
        if(sexe == "h"){
            sexeFinal = "homme";
            
        }else if(sexe == "f"){
            sexeFinal = "femme";
        }
        
        System.out.println("Vous avez "+ age + " ans et vous êtes un(e)" + sexeFinal + " vous "+ decision + " imposable.");
        
        /* FIN PROGRAMME */
    }
}