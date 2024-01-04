package premier_objet_voiture;

public class App {

	public static void main(String[] args) {
		
		Voiture maVoiture = new Voiture();
		
		maVoiture.marque = "Peugeot";
		maVoiture.modele = "306";
		maVoiture.reservoir = 60;
		System.out.println(maVoiture.marque);
		
		maVoiture.accelerer();
		maVoiture.freiner();	
	}

}
