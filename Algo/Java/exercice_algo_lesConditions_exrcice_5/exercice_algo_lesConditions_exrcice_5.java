import java.util.Scanner;
import java.text.DecimalFormat;

public class MyClass {
    public static void main(String args[]) {
        /* VARIABLES */
        
        int photocopie = 0;
        double facture = 0.0;
        
        /* DEBUT PROGRAMME */
        
        Scanner montant = new Scanner(System.in);
        
        System.out.println("Saisir le nombre de photocopie(s) que vous souhaitez : ");
        photocopie = montant.nextInt();
        
        
        for(int i = 0; i < photocopie; i++){
        	if(i <= 10){
        	    facture = facture + 0.1;
        	}else if(i >= 11 && i <= 20){
        	    facture = facture + 0.09;
        	}else if(i > 20){
        	    facture = facture + 0.08;
        	}
        }
        
        DecimalFormat decimal = new DecimalFormat("0.00");
        
        System.out.println("Le montant de la facture pour " + photocopie + " photocopie(s) est de :" + decimal.format(facture) + " Euro(s) ");
        
        /* FIN PROGRAMME */
    }
}