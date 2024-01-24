package exercice_montres_v1;

public class App {

	public static void main(String[] args) {
		//Création des montres
				Montre montre1 = new Montre(3, 145);
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
