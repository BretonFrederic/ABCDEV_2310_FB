package exercice_TestCompte;

public class TestCompte {

	public static void main(String[] args) {
		Compte monCompte = new Compte(500.25);
		monCompte.Afficher();
		monCompte.Deposer(1000.55);
		monCompte.Afficher();
		monCompte.Retirer(15700.68);
		monCompte.Afficher();
	}

}
