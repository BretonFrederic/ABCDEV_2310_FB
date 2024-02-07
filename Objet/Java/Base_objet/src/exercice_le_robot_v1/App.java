package exercice_le_robot_v1;

public class App {

	public static void main(String[] args) {

		Secteur secteur1 = new Secteur();
		Robot r2d2 = new Robot("r2d2");
		r2d2.Avancer(Direction.DROITE);
		r2d2.Avancer(Direction.DROITE);
		r2d2.Avancer(Direction.DROITE);
		r2d2.Avancer(Direction.DROITE);
		//r2d2.Avancer(Direction.DROITE);
		//r2d2.Avancer(Direction.DROITE);
		//r2d2.Avancer(Direction.DROITE);
		r2d2.Detecter(secteur1);
		r2d2.Recolter(secteur1);
	}
}
