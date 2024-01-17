package exercice_porte_garage;

public class App {

	public static void main(String[] args) {
		
		//VARIABLES
		String systemeOuverture = "coulissante";
		int positionMax = 100;
		int positionMin = 0;
		int pourcentageOuverture = 50;
		boolean estOuverte = true;
		boolean estVerrouillee = false;
		
		//DEBUT PROGRAMME
		
		PorteDeGarage porteJeune = new PorteDeGarage();
		PorteDeGarage porteClignancourt = new PorteDeGarage(systemeOuverture, positionMax, positionMin, pourcentageOuverture, estOuverte, estVerrouillee);
		
		//Appelle méthode porteJeune
		boolean deverrouiller = porteJeune.Deverrouiller();
		boolean ouvrirTout = porteJeune.OuvrirTout();
		boolean ouvrir = porteJeune.Ouvrir(pourcentageOuverture);
		boolean fermer = porteJeune.Fermer(pourcentageOuverture);
		boolean fermerTout = porteJeune.FermerTout();
		boolean verrouiller = porteJeune.Verrouiller();
		
		
		//Réninitialisation des boolean
		ouvrirTout = false;
		fermerTout = false;
		ouvrir = false;
		fermer = false;
		verrouiller = false;
		deverrouiller = false;
		
		//Appelle méthode porteClignancourt
		deverrouiller = porteClignancourt.Deverrouiller();
		ouvrirTout = porteClignancourt.OuvrirTout();
		ouvrir = porteClignancourt.Ouvrir(pourcentageOuverture);
		fermer = porteClignancourt.Fermer(pourcentageOuverture);
		fermerTout = porteClignancourt.FermerTout();
		verrouiller = porteClignancourt.Verrouiller();
		
		
		//FIN PROGRAMME
	}

}
