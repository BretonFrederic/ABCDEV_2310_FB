package exercice_fruits_v1;

public class App {

	public static void main(String[] args) {
		
		Apple a = new Apple();
		a.taste();
		a.miam();
		
		PineApple pen = new PineApple();
		pen.taste();
		pen.miam();
		
		// L'opérateur instanceof permet de vérifier si une référence d'objet est 
		// une instance d'une certaine classe ou interface.
		if(!(a instanceof PeelFruit)) {
			System.out.println("Ce fruit n'implemente pas l'interface PeelFruit");
		}
	}

}
