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
		int saisieNbAlgue = 0;
		int count = 0;
		System.out.println("Nombre d'algue à ajouter : ");
		saisieNbAlgue = sc.nextInt();
		while(saisieNbAlgue > count) {
			this.algue.add(new Algue());
			count++;
		}
	}
	
	public void AjouterPoisson() {
		String saisieNom = "";
		int saisieSexe = 0;
		int saisieRace = 0;
		boolean selection = false;
		int index = 0;
		
		System.out.println("Saisir le nom du poisson : ");
		saisieNom = sc.next();
		System.out.println("Saisir le sexe du poisson : "
				+ "\n\t1 -> mâle"
				+ "\n\t2 -> femelle"
				+ "\n\t3 -> hermaphrodite avec l'âge"
				+ "\n\t4 -> hermaphrodite opportuniste\n");
		saisieSexe = sc.nextInt();
		//choix de race fonction du sexe
		//mâle 1 ----------------------->	carpe || thon ||
		//									  bar || mérou
		//
		//femelle 2 --------------------> 	carpe || thon
		//hermaphrodite age 3 ----------> 	 bar  || mérou
		//hermaphrodite opportuniste 4 -> 	 sole || poisson-clown
		switch(saisieSexe) {
		case 1:
			do{
				System.out.println("Saisir la race du poisson : "
						+ "\n\t1 -> BAR"
						+ "\n\t2 -> CARPE"
						+ "\n\t3 -> MEROU"
						+ "\n\t4 -> THON\n");
				saisieRace = sc.nextInt();
				selection = saisieRace == 1 || saisieRace == 2 || saisieRace == 3 || saisieRace == 4;
			}while(!selection);
			index = saisieRace;
			Race poisson = Race.values()[index];
			if(index < 4) {
				this.poisson.add(new PoissonHerbivore(saisieNom, saisieSexe, poisson));
			}else {
				this.poisson.add(new PoissonCarnivore(saisieNom, saisieSexe, poisson));
			}
			
			break;
		case 2:
			do {
				System.out.println("Saisir la race du poisson : "
						+ "\n\t1 -> CARPE"
						+ "\n\t2 -> THON\n");
				saisieRace = sc.nextInt();
				selection = saisieRace == 1 || saisieRace == 2;
			}while(!selection);
			index = saisieRace*2;
			poisson = Race.values()[index];
			if(index < 4) {
				this.poisson.add(new PoissonHerbivore(saisieNom, saisieSexe, poisson));
			}else {
				this.poisson.add(new PoissonCarnivore(saisieNom, saisieSexe, poisson));
			}
			break;
		case 3:
			do {
				System.out.println("Saisir la race du poisson : "
						+ "\n\t1 -> BAR"
						+ "\n\t2 -> MEROU\n");
				saisieRace = sc.nextInt();
				selection = saisieRace == 1 || saisieRace == 2;
			}while(!selection);
			index = saisieRace+(saisieRace-1);
			poisson = Race.values()[index];
			if(index < 4) {
				this.poisson.add(new PoissonHerbivore(saisieNom, saisieSexe, poisson));
			}else {
				this.poisson.add(new PoissonCarnivore(saisieNom, saisieSexe, poisson));
			}
			break;
		case 4:
			do {
				System.out.println("Saisir la race du poisson : "
						+ "\n\t1 -> SOLE"
						+ "\n\t2 -> POISSON_CLOWN\n");
				saisieRace = sc.nextInt();
				selection = saisieRace == 1 || saisieRace == 2;
			}while(!selection);
			index = saisieRace=5*saisieRace-5;
			poisson = Race.values()[index];
			if(index < 4) {
				this.poisson.add(new PoissonHerbivore(saisieNom, saisieSexe, poisson));
			}else {
				this.poisson.add(new PoissonCarnivore(saisieNom, saisieSexe, poisson));
			}
			break;
		}
		selection = false;
	}
	
	public void PasserTemps() {
		//init
		this.algue.add(new Algue());
		this.algue.add(new Algue());
		this.algue.add(new Algue());
		this.algue.add(new Algue());
		this.algue.add(new Algue());
		this.algue.add(new Algue());
		this.poisson.add(new PoissonHerbivore("Maurice", 1, Race.CARPE));
		this.poisson.add(new PoissonHerbivore("Josette", 2, Race.CARPE));
		this.poisson.add(new PoissonCarnivore("Edouard", 1, Race.THON));
		this.poisson.add(new PoissonCarnivore("Pauline", 2, Race.THON));
		this.poisson.add(new PoissonHerbivore("Prisca", 3, Race.BAR));
		this.poisson.add(new PoissonHerbivore("Alix", 3, Race.BAR));
		this.poisson.add(new PoissonCarnivore("Gilbert", 3, Race.MEROU));
		this.poisson.add(new PoissonCarnivore("Appoline", 3, Race.MEROU));
		this.poisson.add(new PoissonHerbivore("Brigitte", 4, Race.SOLE));
		this.poisson.add(new PoissonHerbivore("Donald", 4, Race.SOLE));
		this.poisson.add(new PoissonCarnivore("Odette", 4, Race.POISSON_CLOWN));
		this.poisson.add(new PoissonCarnivore("Igor", 4, Race.POISSON_CLOWN));
		
		//gameloop
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
					break;
				default:
					System.out.println("Ce choix n'existe pas.");
					break;
				}
			}while(!quitterMenu);
			
			//reproduction + nourrir
			
			//Afficher situation
			if(this.algue.size() > 0) {
				for(int i = 0; i <= this.algue.size()-1; i++) {
					if(!this.algue.get(i).Vieillir()) {
						this.algue.remove(i);
					}else {
						System.out.println(this.algue.get(i).toString());
					}
				}
			}else {
				System.out.println("Il n'y a pas d'algues dans l'aquarium\n");
			}
			System.out.println(this.algue.size());
			
			if(this.poisson.size() > 0) {
				for(int i = 0; i <= this.poisson.size()-1; i++) {
					if(!this.poisson.get(i).Vieillir()) {
						this.poisson.remove(i);
					}else {
						System.out.println(this.poisson.get(i).toString());
					}
				}
			}else {
				System.out.println("Il n'y a pas de poissons dans l'aquarium\n");
			}
			System.out.println(this.poisson.size());
			
		}while(!quitterAquarium);
		this.sc.close();
	}
}
