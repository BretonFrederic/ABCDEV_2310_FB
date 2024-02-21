package exercice_aquarium_v1;

import java.util.ArrayList;

public class Aquarium {
	//attributs
		private  int algue;
		private Poisson poisson;
		private ArrayList<Poisson> listePoisson;
		
		//constructeur
		public Aquarium() {
			this.algue = 0;
			this.listePoisson = new ArrayList<Poisson>();
		}
		
		//méthode
		public void AjouterPoisson(Poisson _poisson) {
			this.listePoisson.add(_poisson);
		}
		
		public void AjouterAlgue() {
			this.algue += 1;
		}
		
		public ArrayList<Poisson> getListePoisson(){
			return this.listePoisson;
		}

		public void PasserTemps(){
		
			//futur code on fait toutes les actions
			//...
			System.out.println("\n"+"nombre algues : " + this.algue+ "\n");
			if(this.listePoisson.size() > 0) {
				System.out.println("liste poissons :"); 
				for(int i = 0 ; i <= this.listePoisson.size()-1; i++){
					System.out.println("\t" + listePoisson.get(i).getNom() + " " + listePoisson.get(i).getSexe());
				}
			}else {
				System.out.println("Il n'y a pas de poissons dans l'aquarium.");
			}
		}
}
