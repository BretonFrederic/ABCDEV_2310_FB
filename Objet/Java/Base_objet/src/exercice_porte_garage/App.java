package exercice_porte_garage;

public class App {

	public static void main(String[] args) {
		
		//VARIABLES
		String systemeOuverture = "coulissante";
		int positionMax = 100;
		int positionMin = 0;
		int pourcentageOuverture = 0;
		boolean estOuverte = false;
		boolean estVerrouillee = true;
		
		//DEBUT PROGRAMME
		
		PorteDeGarage porteJeune = new PorteDeGarage();
		PorteDeGarage porteClignancourt = new PorteDeGarage(systemeOuverture,
				positionMax, 
				positionMin, 
				pourcentageOuverture, 
				estOuverte, 
				estVerrouillee);
		
		//Appelle méthode porteJeune
		boolean deverrouiller = porteJeune.Deverrouiller();
		pourcentageOuverture = 50;
		boolean ouvrir = porteJeune.Ouvrir(pourcentageOuverture);
		boolean ouvrirTout = porteJeune.OuvrirTout();
		boolean fermer = porteJeune.Fermer(pourcentageOuverture);
		boolean fermerTout = porteJeune.FermerTout();
		boolean verrouiller = porteJeune.Verrouiller();
		
		
		//Réninitialisation des boolean
		ouvrirTout = false;
		fermerTout = false;
		ouvrir = false;
		fermer = false;
		verrouiller = true;
		deverrouiller = false;
		pourcentageOuverture = 50;
		
		//Appelle méthode porteClignancourt
		deverrouiller = porteClignancourt.Deverrouiller();
		pourcentageOuverture = 50;
		ouvrir = porteClignancourt.Ouvrir(pourcentageOuverture);
		ouvrirTout = porteClignancourt.OuvrirTout();
		fermer = porteClignancourt.Fermer(pourcentageOuverture);
		fermerTout = porteClignancourt.FermerTout();
		verrouiller = porteClignancourt.Verrouiller();
		
		
		//FIN PROGRAMME
	}

}
