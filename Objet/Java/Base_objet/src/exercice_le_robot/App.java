package exercice_le_robot;

public class App {

	public static void main(String[] args) {
		
		//variables
		Direction dir = Direction.GAUCHE;
		
		
		//début programme
		
		Zone zone1 = new Zone();
		zone1.getRobot().AfficherDonneesRobot();//
		zone1.getBase().AfficherDonnees();
		
		for(int i = 1; i <= 14; i++) {
			dir = Direction.GAUCHE;
			switch(dir) {
			case HAUT:
				zone1.getRobot().Haut();
				break;
			case BAS:
				zone1.getRobot().Haut();
				break;
			case GAUCHE:
				zone1.getRobot().Gauche();
				break;
			case DROITE:
				zone1.getRobot().Droite();
				break;
			}
		}
		
		zone1.getRobot().Recolter(zone1);
		zone1.getRobot().AfficherDonneesRobot();
		
		for(int i = 1; i <= 14; i++) {
			dir = Direction.DROITE;
			switch(dir) {
			case HAUT:
				zone1.getRobot().Haut();
				break;
			case BAS:
				zone1.getRobot().Haut();
				break;
			case GAUCHE:
				zone1.getRobot().Gauche();
				break;
			case DROITE:
				zone1.getRobot().Droite();
				break;
			}
		}
		
		zone1.getRobot().ViderTout(zone1);
		zone1.getRobot().AfficherDonneesRobot();
		zone1.getBase().AfficherDonnees();
		
		//fin programme
	}

}
