package premier_objet_voiture;

public class App {

	public static void main(String[] args) {
		
		int kilometresHeure=0;
		
		Voiture maVoiture = new Voiture();
		
		maVoiture.marque = "Peugeot";
		System.out.println(maVoiture.marque);
		kilometresHeure = maVoiture.accelerer(kilometresHeure);
		System.out.printf("La voiture roule à : %d km/h\n", kilometresHeure);
		kilometresHeure = maVoiture.accelerer(kilometresHeure);
		System.out.printf("La voiture roule à : %d km/h\n", kilometresHeure);
		kilometresHeure = maVoiture.accelerer(kilometresHeure);
		System.out.printf("La voiture roule à : %d km/h\n", kilometresHeure);
		kilometresHeure = maVoiture.freiner(kilometresHeure);
		System.out.printf("La voiture roule à : %d km/h\n", kilometresHeure);
		
	}

}
