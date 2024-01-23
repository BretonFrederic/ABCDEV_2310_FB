package exercice_montres;

public class App {

	public static void main(String[] args) {
		/*TEST CLASSE MONTRE--------------------
		Montre montre1 = new Montre("", 13, 45);
		//Afficher l'heure
		montre1.AfficherHeure();
		
		//Avancer d'une minute n fois
		for(int i = 1; i <= 15; i++) {
			montre1.AvancerUneMinute();
			//Afficher l'heure
			montre1.AfficherHeure();
		}
		
		Montre montre2 = new Montre("", montre1);
		//Afficher l'heure
		montre2.AfficherHeure();
		
		//Avancer d'une minute n fois
		for(int i = 1; i <= 15; i++) {
			montre2.AvancerUneMinute();
			//Afficher l'heure
			montre2.AfficherHeure();
		}
		-------------------------------------*/
		//Création des montres
		Montre montre1 = new Montre(13, 45);
		Montre montre2 = new Montre(montre1);
		
		//Création des personnes
		Personne paul = new Personne("Paul");
		Personne jessica = new Personne("Jessica");
		
		//Paul mets la montre1
		boolean mettreMontrePaul = paul.MettreMontre(montre1);
		
		//On afficher le resultat de Jessica qui demande l'heure à Paul
		System.out.println(jessica.DemanderHeure(paul));
		
		//On avance la montre1 d'une minute
		montre1.AvancerUneMinute();
		
		//On afficher le resultat de Jessica qui demande l'heure à Paul
		System.out.println(jessica.DemanderHeure(paul));
		
		//paul enlève sa montre
		boolean enleverMontre = paul.EnleverMontre();
		
		//On afficher le resultat de Jessica qui demande l'heure à Paul
		System.out.println(jessica.DemanderHeure(paul));
		
		//Jessica mets la montre1
		boolean mettreMontreJessica = jessica.MettreMontre(montre1);
		
		//Paul mets la montre2
		mettreMontrePaul = paul.MettreMontre(montre2);
		
		//On afficher le resultat de Paul qui demande l'heure à Jessica
		System.out.println(paul.DemanderHeure(jessica));
		
		//On avance la montre2 de deux minutes
		montre2.AvancerUneMinute();
		montre2.AvancerUneMinute();
		
		//On afficher le resultat de Jessica qui demande l'heure à Paul
		System.out.println(jessica.DemanderHeure(paul));
	}

}
