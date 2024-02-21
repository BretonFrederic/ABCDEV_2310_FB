package exercice_aquarium_v1;

public class App {

	public static void main(String[] args) {
		
		Aquarium a = new Aquarium();
		a.PasserTemps();
		a.AjouterAlgue();
		a.PasserTemps();
		Poisson poisson1 = new Poisson("Maurice", "mâle");
		Poisson poisson2 = new Poisson("Paulette", "femelle");
		a.AjouterPoisson(poisson1);
		a.PasserTemps();
		a.AjouterPoisson(poisson2);
		a.PasserTemps();		
	}

}
