package exercice_TestCompte;

public class TestCompte {

	public static void main(String[] args) {
		Compte monCompte = new Compte(500);
		monCompte.Afficher();
		monCompte.Deposer(1000);
		monCompte.Afficher();
		monCompte.Retirer(700);
		monCompte.Afficher();
	}

}
