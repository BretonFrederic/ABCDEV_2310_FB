package exercice_maison_v1;

public class App {

	public static void main(String[] args) {
		
		Maison m1 = new Appartement();
		m1.unePorte.setCouleur("bleu");
		Personne paul = new Personne("Paul",m1);
		System.out.println(paul.toString());
		
		Maison m2 = new Maison(250);
		m2.unePorte.setCouleur("vert");
		Personne vanessa = new Personne("Vanessa",m2);
		System.out.println(vanessa.toString());
		
		Porte p1 = new Porte("jaune");
	}

}
