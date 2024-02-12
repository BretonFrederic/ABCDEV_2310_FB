package exo_Robot_correction;

public class App {

	public static void main(String[] args) {
		Robot r2d2 = new Robot();
		Telecommande cispeo = new Telecommande(r2d2);
		cispeo.Allumer();
		cispeo.Allumer();
		cispeo.Avancer();
		
	}

}
