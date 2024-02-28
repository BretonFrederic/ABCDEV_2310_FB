package exercice_aquarium_v1;
import java.util.Scanner;
import java.util.ArrayList;

public class Aquarium {

	//attributs
	private boolean estRempli;
	private int nbTours;
	private ArrayList<Algue> algue;
	private ArrayList<Poisson> poisson;
	private Scanner sc;
			
	//constructeurs
	public Aquarium() {
		this.estRempli = true;
		this.nbTours = 0;
		this.algue = new ArrayList<Algue>();
		this.poisson = new ArrayList<Poisson>();
		this.sc = new Scanner(System.in);
	}
			
	//getters et setters
			
			
	//méthodes
	public void AjouterAlgue() {
		System.out.println("Vous voulez ajouter une algue...");
	}
	
	public void AjouterPoisson() {
		String saisieNom = "";
		String saisieSexe = "";
		System.out.println("Saisir le nom du poisson : ");
		saisieNom = sc.next();
		System.out.println("Saisir le sexe du poisson : ");
		saisieSexe = sc.next();
		this.poisson.add(new PoissonHerbivore(saisieNom, saisieSexe, RaceH.BAR));
	}
	
	public void PasserTemps() {
		boolean quitterAquarium = false;	
		do {
			char choix = ' ';
			boolean quitterMenu = false;
			do {
				System.out.println("MENU\n\tP -> Ajouter poisson"
						+ "\n\tA -> Ajouter algue"
						+ "\n\tC -> continuer"
						+ "\n\tQ -> quitter\n");
				choix = this.sc.next().charAt(0);
				
				switch(choix) {
				case 'P':
					this.AjouterPoisson();
					break;
				case 'A':
					this.AjouterAlgue();
					break;
				case 'C':
					quitterMenu = true;
					break;
				case 'Q':
					quitterMenu = true;
					quitterAquarium = true;
					//quitter le programme de l'aquarium
					break;
				default:
					System.out.println("Ce choix n'existe pas.");
					break;
				}
			}while(!quitterMenu);
			
			//reproduction + nourrir
			
			//Afficher situation
			if(this.poisson.size() > 0) {
				for(int i = 0; i <= this.poisson.size()-1; i++) {
					System.out.println(this.poisson.get(i).toString());
					this.poisson.get(i).Vieillir();
				}
			}
			
		}while(!quitterAquarium);
		this.sc.close();
	}
}
