package exercice_maison_v1;

public class Personne {
	
	//attributs
	private String nom;
	private Maison uneMaison;
	
	//constructeur
	public Personne(String _nom, Maison _uneMaison){
		this.nom = _nom;
		this.uneMaison =_uneMaison;
	}
	
	//méthodes
	@Override
	public String toString() {
		return "Je m'appelle " + this.nom + this.uneMaison.toString() + this.uneMaison.unePorte.toString() + "\n";
	}
}
