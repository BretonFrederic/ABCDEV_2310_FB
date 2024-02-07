package exercice_le_robot_v1;

public class App {

	public static void main(String[] args) {

		//Variables
		int distance = 7;
		
		//Debut programme
		
		Secteur secteur1 = new Secteur();
		Robot r2d2 = new Robot("r2d2");
		
		while(distance > 0) {
			r2d2.Avancer(Direction.DROITE);
			distance--;
		}
		
		r2d2.Detecter(secteur1);
		r2d2.Recolter(secteur1);
		r2d2.AfficherInfo();
		
		//Fin programme
	}
}
