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
		
		Montre montre1 = new Montre("test", 13, 45);
		
		Personne paul = new Personne("Paul");
		boolean mettreMontre = paul.MettreMontre(montre1);
		boolean enleverMontre = paul.EnleverMontre();
		
		//paul.montre.AfficherHeure();
	}

}
