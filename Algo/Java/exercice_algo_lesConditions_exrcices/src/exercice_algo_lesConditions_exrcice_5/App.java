package exercice_algo_lesConditions_exrcice_5;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
/* VARIABLES */
        
        int photocopie = 0;
        double facture = 0.0;
        double arrondi = 0.0;
        double factureFinale = 0.0;
        
        /* DEBUT PROGRAMME */
        
        Scanner montant = new Scanner(System.in);
        
        System.out.println("Saisir le nombre de photocopie(s) que vous souhaitez : ");
        photocopie = montant.nextInt();
        
        
        for(int i = 0; i < photocopie; i++){
        	if(i < 10){
        	    facture = facture + 10;
        	}else if(i > 9 && i < 20){
        	    facture = facture + 9;
        	}else if(i > 19){
        	    facture = facture + 8;
        	}
        }
        
        arrondi = Math.round(facture);
        factureFinale = arrondi/100;
        
        System.out.println("Le montant de la facture pour " +  photocopie + " photocopie(s) est de : " + factureFinale + " Euro(s)");
        //System.out.printf("Le montant de la facture pour %d photocopie(s) est de : %.2f Euro(s)\n", photocopie, facture);
        montant.close();
        
        /* FIN PROGRAMME */

	}

}
