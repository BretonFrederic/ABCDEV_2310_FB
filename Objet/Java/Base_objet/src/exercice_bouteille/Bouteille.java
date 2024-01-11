package exercice_bouteille;

public class Bouteille {

	// Attributs
	private String nom;
	private final double capaciteEnL;
	private double contenanceEnL;
	private boolean estOuverte;
	
	// Méthodes
	public boolean ouvrir() {
		if(!estOuverte) {
			estOuverte = true;
			System.out.print("La bouteille est ouverte\n");
		}else if(estOuverte) {
			System.out.print("Déjà ouverte\n");
		}
		return estOuverte;
	}
	
	public boolean fermer() {
		if(estOuverte) {
			estOuverte = false;
			System.out.print("La bouteille est fermée\n");
		}else if(!estOuverte) {
			System.out.print("Déjà fermée\n");
		}
		return estOuverte;
	}
	
	public boolean remplirTout() {
		boolean remplirTout;
		if(contenanceEnL < capaciteEnL && estOuverte) {
			contenanceEnL = capaciteEnL;
			System.out.print("La bouteille est pleine, elle contient : " + contenanceEnL + " Litres\n");
			remplirTout = true;
		}else {
			System.out.print("Déjà remplie ou bouteille fermée\n");
			remplirTout = false;
		}
		return remplirTout;
	}
	
	public boolean remplir(double quantiteEnL) {
		boolean remplir;
		if(quantiteEnL <= capaciteEnL - contenanceEnL && estOuverte) {
			contenanceEnL += quantiteEnL;
			remplir = true;
			System.out.print("La bouteille contient : " + contenanceEnL + " Litres\n");
		}else {
			System.out.print("Quantité à remplir plus grande que la capacité ou bouteille fermée\n");
			remplir = false;
		}
		return remplir;
	}
	
	public boolean viderTout() {
		boolean viderTout;
		if(contenanceEnL > 0 && estOuverte) {
			contenanceEnL = 0;
			System.out.print("La bouteille est vide\n");
			viderTout = true;
		}else {
			System.out.print("Déjà vide ou bouteille fermée\n");
			viderTout = false;
		}
		return viderTout;
	}
	
	public boolean vider(double quantiteEnL) {
		boolean vider;
		if(contenanceEnL >= quantiteEnL && estOuverte) {
			contenanceEnL -= quantiteEnL;
			System.out.print("La bouteille contient : " + contenanceEnL + " Litres\n");
			vider = true;
		}else {
			System.out.print("Quantité à vider plus grande que la contenance ou bouteille fermée\n");
			vider = false;
		}
		return vider;
	}
	
	// Constructeur
	public Bouteille(){
		nom = "Vittel";
		capaciteEnL = 1.5;
		contenanceEnL = 0.5;
		estOuverte = false;
	}
	
	public Bouteille(String _nom, final double _capaciteEnL, double _contenanceEnL, boolean _estOuverte){
		nom = _nom;
		capaciteEnL = _capaciteEnL;
		contenanceEnL = _contenanceEnL;
		estOuverte = _estOuverte;
	}
	
}
