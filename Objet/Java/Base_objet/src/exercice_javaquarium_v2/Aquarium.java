package exercice_javaquarium_v2;
import java.util.Scanner;
import java.util.ArrayList;

public class Aquarium {

	//attributs
	ArrayList<Poisson> poisson;
	ArrayList<Algue> algue;
	
	//constructeur
	public Aquarium() {
		this.poisson = new ArrayList<Poisson>();
		this.algue = new ArrayList<Algue>();
	}
	
	//getters et setters

	
	//méthodes
	Scanner sc = new Scanner(System.in);
	
	private String ChoisirNom() {
		String saisieNom = "";
		System.out.println("Saisir le nom du poisson : ");
		return saisieNom = sc.next();
	}
	
	private int ChoisirSexe() {
		int saisieSexe = 0;
		do {
			System.out.println("Saisir le sexe du poisson : \n\t1 -> mâle\n\t2 -> femelle");
			saisieSexe = sc.nextInt();
		}while(saisieSexe < 1 || saisieSexe > 2);
		return saisieSexe;
	}
	
	private Race ChoisirRace() {
		int saisieRace= 0;
		Race racePoisson = Race.CARPE;
		do {
			System.out.println("Saisir la race du poisson : \n\t1 -> mérou(carnivore)\n\t2 -> thon(carnivore)\n\t3 -> poisson-clown(carnivore)\n\t4 -> sole(herbivore)\n\t5 -> bar(herbivore)\n\t6 -> carpe(herbivore)");
			saisieRace = sc.nextInt();
		}while(saisieRace < 1 || saisieRace > 6);
		switch(saisieRace) {
		case 1:
			 racePoisson = Race.MEROU;
			break;
		case 2:
			 racePoisson = Race.THON;
			break;
		case 3:
			 racePoisson = Race.POISSON_CLOWN;
			break;
		case 4:
			 racePoisson = Race.SOLE;
			break;
		case 5:
			 racePoisson = Race.BAR;
			break;
		case 6:
			 racePoisson = Race.CARPE;
			break;
		default:
			 System.out.println("Ce choix n'existe pas.");
			break;
		}
		return racePoisson;
	}
	
	public void AjouterPoisson() {
		String nomPoisson = ChoisirNom();
		int sexePoisson = ChoisirSexe();
		final Race racePoisson = ChoisirRace();
		this.poisson.add(new Poisson(nomPoisson, sexePoisson, racePoisson));
	}
	
	public void AjouterAlgue() {
		this.algue.add(new Algue());
	}
	
	public void Afficher() {
		if(this.poisson.size() > 0 || this.algue.size() > 0) {
			//for(int i = 0; i <= this.algue.size()-1; i++) {
				System.out.println("Nombre d'algue : " + this.algue.size());
			//}

			for(int i = 0; i <= this.poisson.size()-1; i++) {
				System.out.println(this.poisson.get(i).toString());
			}
			System.out.println("");
		}else {
			System.out.println("L'aquarium est vide.");
		}
		
	}
	
	public void PasserTemps() {
		
		boolean quitter = false;
		do {
			int saisieChoix = 0;
			boolean quitterMenu = false;
			do {
				System.out.println("Menu\n\t1 -> Ajouter poisson\n\t2 -> Ajouter algue\n\t3 -> Passer le temps\n\t4 -> quitter");
				saisieChoix = sc.nextInt();
				switch(saisieChoix) {
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
					System.out.println("Fin du programme.");
					quitterMenu = true;
					quitter = true;
					break;
				default:
					System.out.println("Ce choix n'existe pas.");
					break;
				}
			}while(!quitterMenu);
			
			//actions du tour
			for(int i = 0; i <= this.poisson.size()-1; i++) {
				this.poisson.get(i).Manger(this);
			}
			this.Afficher();
		}while(!quitter);	
	}
}
