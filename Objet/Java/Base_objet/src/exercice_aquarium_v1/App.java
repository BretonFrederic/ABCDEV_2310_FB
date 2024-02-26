package exercice_aquarium_v1;

public class App {

	public static void main(String[] args) {
		
		Aquarium a = new Aquarium();

		/*
		PoissonHerbivore poisson1 = new PoissonHerbivore("Maurice", "mâle", PoissonH.MEROU);
		PoissonHerbivore poisson2 = new PoissonHerbivore("Paulette", "femelle", PoissonH.POISSON_CLOWN);
		PoissonHerbivore poisson3 = new PoissonHerbivore("Albert", "mâle", PoissonH.THON);
		PoissonCarnivore poisson4 = new PoissonCarnivore("Janette", "femelle", PoissonC.BAR);
		PoissonCarnivore poisson5 = new PoissonCarnivore("Philibert", "mâle", PoissonC.CARPE);
		PoissonCarnivore poisson6 = new PoissonCarnivore("Antoinette", "femelle", PoissonC.SOLE);
		*/

		a.AjouterPoissonHerbivore("Maurice", "mâle", PoissonH.MEROU);
		a.AjouterPoissonHerbivore("Paulette", "femelle", PoissonH.POISSON_CLOWN);
		a.AjouterPoissonHerbivore("Albert", "mâle", PoissonH.THON);
		a.AjouterPoissonCarnivore("Janette", "femelle", PoissonC.BAR);
		a.AjouterPoissonCarnivore("Philibert", "mâle", PoissonC.CARPE);
		a.AjouterPoissonCarnivore("Antoinette", "femelle", PoissonC.SOLE);

		a.AjouterAlgue(5);
		a.AjouterAlgue(10);
		a.AjouterAlgue(7);
		


		a.PasserTemps();		
	}

}
