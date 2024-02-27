package exercice_aquarium_v1;

import java.util.ArrayList;

public class Aquarium {

	//attributs
	private boolean estRempli;
	private int nbTours;
	private ArrayList<Algue> algue;
	private ArrayList<Poisson> poisson;
			
	//constructeurs
	public Aquarium() {
		this.estRempli = true;
		this.nbTours = 0;
		this.algue = new ArrayList<Algue>();
		this.poisson = new ArrayList<Poisson>();
	}
			
	//getters et setters
			
			
	//méthodes
	public boolean AjouterAlgue() {
		return false;
	}
	
	public boolean AjouterPoisson() {
		return false;
	}
}
