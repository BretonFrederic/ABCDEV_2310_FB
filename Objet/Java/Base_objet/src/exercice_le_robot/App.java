package exercice_le_robot;

public class App {

	public static void main(String[] args) {
		
		//variables
		String direction;
		
		
		//début programme
		
		Zone zone1 = new Zone();
		zone1.getRobot().AfficherDonnees();
		zone1.getBase().AfficherDonnees();
		
		for(int i = 1; i <= 14; i++) {
			direction = Direction.GAUCHE.getDir();
			switch(direction) {
			case "haut":
				zone1.getRobot().Haut();
				break;
			case "bas":
				zone1.getRobot().Haut();
				break;
			case "gauche":
				zone1.getRobot().Gauche();;
				break;
			case "droite":
				zone1.getRobot().Droite();;
				break;
			}
		}
		
		zone1.getRobot().Recolter(zone1);
		zone1.getRobot().AfficherDonnees();
		
		for(int i = 1; i <= 14; i++) {
			direction = Direction.DROITE.getDir();
			switch(direction) {
			case "haut":
				zone1.getRobot().Haut();
				break;
			case "bas":
				zone1.getRobot().Haut();
				break;
			case "gauche":
				zone1.getRobot().Gauche();;
				break;
			case "droite":
				zone1.getRobot().Droite();;
				break;
			}
		}
		
		zone1.getRobot().ViderTout(zone1);
		zone1.getRobot().AfficherDonnees();
		zone1.getBase().AfficherDonnees();
		
		//fin programme
	}

}
