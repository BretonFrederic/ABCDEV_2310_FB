package exercice_montres;

public class App {

	public static void main(String[] args) {
		Montre montre1 = new Montre("", 23, 59);
		montre1.AfficherHeure(montre1);
		montre1.AvancerUneMinute();
		montre1.AfficherHeure(montre1);
	}

}
