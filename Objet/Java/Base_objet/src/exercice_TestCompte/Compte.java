package exercice_TestCompte;

public class Compte {
	
	//variables d'instance
	private double solde;
	
	//constructeurs
	public Compte(double _solde) {
		solde = _solde;
	}
	
	//méthodes
	public void Deposer(double _somme) {
		solde += _somme;
	}
	
	public void Retirer(double _somme) {
		solde -= _somme;
	}
	
	public void Afficher() {
		System.out.println("Il y a "+solde+" sur le compte.");
	}
}
