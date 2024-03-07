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
	public ArrayList<Algue> getAlgue() {
		return this.algue;
	}
	
	public ArrayList<Poisson> getPoisson() {
		return this.poisson;
	}
			
	//méthodes
	private String ChoisirNomPoisson() {
		String saisieNom = "";
		System.out.println("Saisir le nom du poisson : ");
		saisieNom = sc.next();
		return saisieNom;
	}
	
	private int ChoisirSexePoisson() {
		int saisieSexe = 0;
		String sexePoisson="";
		do {
			System.out.println("Saisir le sexe du poisson : "
					+ "\n\t1 -> mâle"
					+ "\n\t2 -> femelle\n");
			saisieSexe = sc.nextInt();
			
		}while(saisieSexe < 1 || saisieSexe > 2);

		switch(saisieSexe) {
		case 1:
			sexePoisson = Race.;
		break;
		case 2:
			sexePoisson = Race.BAR;
			break;
		return sexePoisson;
	}
	
	private Race ChoisirRacePoisson() {
		int saisieRace = 0;
		int choixRace = 0;
		Race racePoisson = null;
		boolean selection = false;

			do{
				System.out.println("Saisir la race du poisson : "
						+ "\n\t1 -> CARPE(herbivore)"
						+ "\n\t2 -> BAR(herbivore)"
						+ "\n\t3 -> SOLE(herbivore)"
						+ "\n\t4 -> THON(carnivore)"
						+ "\n\t5 -> MEROU(carnivore)"
						+ "\n\t6 -> POISSON_CLOWN(carnivore)\n");
				saisieRace = sc.nextInt();
				selection = saisieRace == 1 || saisieRace == 2 || saisieRace == 3 || saisieRace == 4  || saisieRace == 5  || saisieRace == 6;
			}while(!selection);
			
			choixRace = saisieRace;
			switch(choixRace) {
			case 1:
				racePoisson = Race.CARPE;
			break;
			case 2:
				racePoisson = Race.BAR;
				break;
			case 3:
				racePoisson = Race.SOLE;
				break;
			case 4:
				racePoisson = Race.THON;
				break;
			case 5:
				racePoisson = Race.MEROU;
				break;
			case 6:
				racePoisson = Race.POISSON_CLOWN;
				break;
			}
		return racePoisson;
	}
	
	private int ChoisirAgePoisson() {
		int saisieAge = 0;
		do {
		System.out.println("saisir l'âge du poisson : ");
		saisieAge = sc.nextInt();
		return saisieAge;
		}while(saisieAge < 0 || saisieAge > 20);
	}
	
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
		String nomPoisson = ChoisirNomPoisson();
		int sexePoisson = ChoisirSexePoisson();
		Race racePoisson = ChoisirRacePoisson();
		int agePoisson = ChoisirAgePoisson();
		
		if(racePoisson.getSexualite().equals("Hermaphrodite avec l'âge")) {
			if(agePoisson < 10) {
				sexePoisson = 1;
			}else {
				sexePoisson = 2;
			}
		}
		
		if(racePoisson.getRegimeAlimentaire().equals("herbivore")) {
			this.poisson.add(new PoissonHerbivore(nomPoisson, sexePoisson, racePoisson));
		}else if(racePoisson.getRegimeAlimentaire().equals("carnivore")) {
			this.poisson.add(new PoissonCarnivore(nomPoisson, sexePoisson, racePoisson));
		}		
	}
	
	public void PasserTemps() {
		//init
		this.algue.add(new Algue());
		this.algue.add(new Algue());
		this.algue.add(new Algue());
		this.algue.add(new Algue());
		this.algue.add(new Algue());
		this.algue.add(new Algue());
		/*
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
		*/

		//gameloop
		boolean quitterAquarium = false;	
		do {
			int choix = 0;
			boolean quitterMenu = false;
			do {
				System.out.println("MENU\n\t1 -> Ajouter poisson"
						+ "\n\t2 -> Ajouter algue"
						+ "\n\t3 -> continuer"
						+ "\n\t4 -> quitter\n");
				choix = this.sc.nextInt();
				
				switch(choix) {
				case 1:
					this.AjouterPoisson();
					break;
				case 2:
					this.AjouterAlgue();
					break;
				case 3:
					quitterMenu = true;
					break;
				case 4:
					quitterMenu = true;
					quitterAquarium = true;
					break;
				default:
					System.out.println("Ce choix n'existe pas.");
					break;
				}
			}while(!quitterMenu);
			
			//Poissons mangent
			if(this.poisson.size() > 0) {
				for(int i = 0; i <= this.poisson.size()-1; i++) {
					if(this.poisson.get(i).getPointsVie() <=5) {
						this.poisson.get(i).Manger(this);
					}
				}
			}
			
			
			//Afficher situation
			
			//les algues
			if(this.algue.size() > 0) {
				ArrayList<String> algueMort = new ArrayList<>();
				
				for(int i = 0; i <= this.algue.size()-1; i++) {
					if(!this.algue.get(i).Vieillir()) {
						algueMort.add(this.algue.get(i).toString());
					}else {
						System.out.println(this.algue.get(i).toString());
					}
				}
				//supprimer algues mortes
				for(int i = 0; i <= algueMort.size()-1; i++) {
					for(int j = 0; j <= this.algue.size()-1; j++) {
						if(algueMort.get(i).toString().equals(this.algue.get(j).toString())) {
							this.algue.remove(j);
						}
					}
				}
			}else {
				System.out.println("Il n'y a pas d'algues dans l'aquarium\n");
			}
			System.out.println(this.algue.size());
			
			//les poissons
			if(this.poisson.size() > 0) {
				ArrayList<String> poissonMort = new ArrayList<>();
				
				for(int i = 0; i <= this.poisson.size()-1; i++) {
					if(!this.poisson.get(i).Vieillir(this)) {
						poissonMort.add(this.poisson.get(i).toString());
					}else {
						System.out.println(this.poisson.get(i).toString());
					}
				}
				for(int i = 0; i <= poissonMort.size()-1; i++) {
					for(int j = 0; j <= this.poisson.size()-1; j++) {
						if(poissonMort.get(i).toString().equals(this.poisson.get(j).toString())) {
							this.poisson.remove(j);
						}
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
