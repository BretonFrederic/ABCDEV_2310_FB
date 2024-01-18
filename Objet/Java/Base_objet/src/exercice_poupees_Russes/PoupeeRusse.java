package exercice_poupees_Russes;

public class PoupeeRusse {
	//Attributs
	private String nom;
	private int taille;
	private boolean estOuverte;
	private boolean estContenant;
	private boolean estContenu;
	
	private static int nombreInstance;
	
	//Constructeur
	public PoupeeRusse(String _nom, boolean _estOuverte) {
		this.nom = _nom;
		this.estOuverte = _estOuverte;
		this.estContenant = false;
		this.estContenu = false;
		nombreInstance ++;
		public void setTaille() {
			//
		}
	}
	
	//Méthodes
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
		}else {
			return false;
		}
	}
	
	public boolean Fermer(){
		if(!this.estContenu && this.estOuverte) {
			this.estOuverte = false;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean PlacerDans(PoupeeRusse poupee){
		if(this.taille < poupee.getTaille() && poupee.getEstOuverte()) {
			poupee.estContenant = true;
			this.estContenu = true;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean SortirDe(PoupeeRusse poupee){
		if(this.estContenu && poupee.estContenant && poupee.getEstOuverte()) {
			poupee.estContenant = false;
			this.estContenu = false;
			return true;
		}else {
			return false;
		}
	}
}
