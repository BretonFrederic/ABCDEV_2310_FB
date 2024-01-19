package exercice_poupees_Russes;

public class App {

	public static void main(String[] args) {
		PoupeeRusse poupee1 = new PoupeeRusse("poupee1", false);
		PoupeeRusse poupee2 = new PoupeeRusse("poupee2", false);
		PoupeeRusse poupee3 = new PoupeeRusse("poupee3", false);
		
		boolean ouvrirP3 = poupee3.Ouvrir();

		boolean PlacerDans = poupee1.PlacerDans(poupee3);
		boolean FermerP3 = poupee3.Fermer();
		PlacerDans = poupee3.PlacerDans(poupee2);
		//boolean FermerP2 = poupee2.Fermer();
		boolean SortirDe = poupee1.SortirDe(poupee3);
	}
}
