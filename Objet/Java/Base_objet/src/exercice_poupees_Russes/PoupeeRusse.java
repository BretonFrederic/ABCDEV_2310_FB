package exercice_poupees_Russes;

public class PoupeeRusse {
	//Attributs
	private String nom;
	private int taille;
	private boolean estOuverte;
	private boolean estContenant;
	private boolean estContenu;
	
	//Variables de Classe
	private static int nombreInstance;
	
	//Constructeur
	public PoupeeRusse(String _nom, boolean _estOuverte) {
		this.nom = _nom;
		this.estOuverte = _estOuverte;
		this.estContenant = false;
		this.estContenu = false;
		this.setTaille();
		nombreInstance ++;
	}
	
	//Méthodes
	public void setTaille() {
		this.taille = nombreInstance;
	}
	
	public int getTaille(){
		int poupeeTaille;
		poupeeTaille = this.taille;
		return poupeeTaille;
	}
	
	public boolean getEstOuverte(){
		boolean poupeeOuverte;
		poupeeOuverte = this.estOuverte;
		return poupeeOuverte;
	}
	
	public boolean Ouvrir(){
		if(!this.estContenu && !this.estOuverte) {
			this.estOuverte =  true;
			return true;
		//Un contenu ouvert dans un contenant ouvert, on peut l'ouvrir et le fermer
		//}else if(this.estContenu){
		//	if(le contenant est ouvert) {
		//		this.estOuverte =  true;
		//		return true;
		//	}else {
		//		return false;
		//	}
		}else {
			return false;
		}
	}
	
	public boolean Fermer(){
		if(!this.estContenu && this.estOuverte) {
			this.estOuverte = false;
			return true;
		//}else if(this.estContenu){
		//	if(le contenant est ouvert) {
		//		this.estOuverte =  false;
		//		return true;
		//	}else {
		//		return false;
		//	}
		}else {
			return false;
		}
	}
	
	public boolean PlacerDans(PoupeeRusse poupee){
		if(this.taille < poupee.getTaille() && poupee.getEstOuverte() == true && poupee.estContenant == false) {
			poupee.estContenant = true;
			this.estContenu = true;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean SortirDe(PoupeeRusse poupee){
		if(this.estContenu && poupee.estContenant && poupee.getEstOuverte() == true) {
			poupee.estContenant = false;
			this.estContenu = false;
			return true;
		}else {
			return false;
		}
	}
}
