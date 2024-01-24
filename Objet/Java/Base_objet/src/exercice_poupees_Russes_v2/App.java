package exercice_poupees_Russes_v2;

public class App {

	public static void main(String[] args) {
		PoupeeRusse p1 = new PoupeeRusse('A', 2);
		PoupeeRusse p2 = new PoupeeRusse('B', 4);
		PoupeeRusse p3 = new PoupeeRusse('C', 6);
		
		p2.Ouvrir();
		p1.PlacerDans(p2);
		p2.Fermer();
		p3.Ouvrir();
		p2.PlacerDans(p3);
		p3.Fermer();
		
		p3.Ouvrir();
		p2.SortirDe(p3);
		p3.Fermer();
		p2.Ouvrir();
		p1.SortirDe(p2);
		p2.Fermer();
	}

}
