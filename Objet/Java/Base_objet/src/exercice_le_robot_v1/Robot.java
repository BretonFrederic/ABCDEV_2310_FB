package exercice_le_robot_v1;

public class Robot {
	
	//Attributs
	private String nom;
	private Position position;
	private int stockage;
	private final double rayonDetection;
	
	//Constructeurs
	public Robot(String _nom) {
		this.nom = _nom;
		this.position = new Position(10, 10);
		this.stockage = 0;
		rayonDetection = 2;
	}
	
	//Méthodes
	public void Avancer(Direction _direction) {
		boolean horsLimiteX = this.position.getPositionX()== 20 || this.position.getPositionX()== 0;
		boolean horsLimiteY = this.position.getPositionY()== 20 || this.position.getPositionY()== 0;
		switch(_direction) {
		case HAUT:
			if(!horsLimiteY) {
				this.position.setPositionY(this.position.getPositionY()+1);
			}
			break;
		case BAS:
			if(!horsLimiteY) {
				this.position.setPositionY(this.position.getPositionY()-1);
			}
		case GAUCHE:
			if(!horsLimiteX) {
			this.position.setPositionX(this.position.getPositionX()-1);
			}
			break;
		case DROITE:
			if(!horsLimiteX) {
				this.position.setPositionX(this.position.getPositionX()+1);
			}
			break;
		}
	}
	
	public void Detecter(Secteur _secteur) {
		for(int i = 0; i <= _secteur.getTableauRoche().length-1; i++) {
			Position posRoche = _secteur.getRochePosition(i);
			//pythagore
			double distancePoint = Math.sqrt(Math.abs(Math.pow(((posRoche.getPositionX() - this.position.getPositionX())), 2)) + Math.abs(Math.pow(((posRoche.getPositionY() - this.position.getPositionY())), 2)));
			if(rayonDetection >= distancePoint) {
				System.out.println("\nLe scanner a détecté de la roche lunaire.\n");
			}
		}
	}
	
	public void Recolter(Secteur _secteur) {
		for(int i = 0; i <= _secteur.getTableauRoche().length-1; i++) {
			Position posRoche = _secteur.getRochePosition(i);
			//pythagore
			double distancePoint = Math.sqrt(Math.abs(Math.pow(((posRoche.getPositionX() - this.position.getPositionX())), 2)) + Math.abs(Math.pow(((posRoche.getPositionY() - this.position.getPositionY())), 2)));
			if(rayonDetection >= distancePoint) {
				this.stockage += _secteur.getRochePoids(i);
				_secteur.setRochePosition(i);
				System.out.printf("\nLe robot a récolté : %d gramme(s) de roche lunaire", _secteur.getRochePoids(i));
			}
		}
	}
}
