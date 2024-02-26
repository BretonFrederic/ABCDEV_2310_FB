package exercice_aquarium_v1;

import java.util.ArrayList;
import java.util.Scanner;

public class Aquarium {
	//attributs
	private ArrayList<Algues> listeAlgue;
	private ArrayList<Poisson> listePoisson;
	
	//constructeur
	public Aquarium() {
		this.listeAlgue = new ArrayList<Algues>();
		this.listePoisson = new ArrayList<Poisson>();
	}
	
	//getters et setters
	public ArrayList<Poisson> getListePoisson(){
		return this.listePoisson;
	}
	
	public ArrayList<Algues> getListeAlgue(){
		return this.listeAlgue;
	}
	
	//méthode
	public void AjouterPoissonHerbivore(String _nom, String _sexe, PoissonH _race) {
		this.listePoisson.add(new PoissonHerbivore(_nom, _sexe, _race));
	}
	
	public void AjouterPoissonCarnivore(String _nom, String _sexe, PoissonC _race) {
		this.listePoisson.add(new PoissonCarnivore(_nom, _sexe, _race));
	}
	
	public void AjouterAlgue(int _nbre) {
		this.listeAlgue.add(new Algues(_nbre, 0));
	}

	public void PasserTemps(){
	
		Scanner sc = new Scanner(System.in);
		char continuer;
		
		//BOUCLE PRINCIPALE
		do {
			//Les poissons mangent
			for(int u = 0; u <= this.listePoisson.size()-1; u++) {
				if(this.listePoisson.get(u).getRace()=="MEROU" || this.listePoisson.get(u).getRace()=="THON" ||  this.listePoisson.get(u).getRace()=="POISSON_CLOWN") {
					//si algue > 0 alors manger algue aléatoire de la liste
					if(this.listeAlgue.size() > 0) {
						this.listePoisson.get(u).Manger(this.listeAlgue.get(u));
					}
				}else if(this.listePoisson.get(u).getRace()=="SOLE" || this.listePoisson.get(u).getRace()=="BAR" ||  this.listePoisson.get(u).getRace()=="CARPE") {
					if(this.listePoisson.size() > 0) {
						this.listePoisson.get(u).Manger(this.listePoisson.get(u));
					}
				}
			}
			
			//affichage liste algues
			if(this.listeAlgue.size() > 0) {
				System.out.println("\n"+"nombre algues : "); 
				System.out.println("\t" + this.listeAlgue.size());
			}else {
				System.out.println("Il n'y a pas d'algue(s) dans l'aquarium.");
			}
			
			//affichage liste poissons
			if(this.listePoisson.size() > 0) {
				System.out.println("liste poissons :"); 
				for(int i = 0 ; i <= this.listePoisson.size()-1; i++){
					System.out.println("\t" + listePoisson.get(i).getNom() + " " + listePoisson.get(i).getSexe()+ " " + listePoisson.get(i).getRace());
				}
			}else {
				System.out.println("Il n'y a pas de poissons dans l'aquarium.");
			}
		System.out.println("Saisir n pour quitter");
		continuer = sc.next().charAt(0);
		}while(continuer != 'n');
		sc.close();
	}
}
