package exercice_algo_lesConditions_exrcice_5;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
/* VARIABLES */
        
        int photocopie = 0;
        double facture = 0.0;
        
        //double arrondi = 0.0;
        //double factureFinale = 0.0;
        
        /* DEBUT PROGRAMME */
        
        Scanner montant = new Scanner(System.in);
        
        System.out.println("Saisir le nombre de photocopie(s) que vous souhaitez : ");
        photocopie = montant.nextInt();
        
        
        for(int i = 0; i < photocopie; i++){
        	if(i < 11){
        		//aireSecteurArrondi = Math.round(aireSecteurCirculaire * 1000.0) / 1000.0;
        	    facture = facture + 0.1;
        	    facture = Math.round(facture * 1000.0) / 1000.0;
        	}else if(i > 10 && i < 31){
        	    facture = facture + 0.09;
        	    facture = Math.round(facture * 1000.0) / 1000.0;
        	}else if(i > 30){
        	    facture = facture + 0.08;
        	    facture = Math.round(facture * 1000.0) / 1000.0;
        	}
        }
        
        //arrondi = Math.round(facture);
        //factureFinale = (arrondi/100)*100;
        
        System.out.println("Le montant de la facture pour " +  photocopie + " photocopie(s) est de : " + facture + " Euro(s)");
        //System.out.printf("Le montant de la facture pour %d photocopie(s) est de : %.2f Euro(s)\n", photocopie, facture);
        montant.close();
        
        /* FIN PROGRAMME */

	}

}
