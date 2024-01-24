package exercice_poupees_Russes_v1;

public class App {

	public static void main(String[] args) {
		PoupeeRusse p1 = new PoupeeRusse(2, false, false, false);
		PoupeeRusse p2 = new PoupeeRusse(4, false, false, false);
		PoupeeRusse p3 = new PoupeeRusse(6, false, false, false);
		
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
