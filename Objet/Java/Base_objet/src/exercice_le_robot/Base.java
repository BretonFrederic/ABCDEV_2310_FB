package exercice_le_robot;

public class Base {
	
	//attributs
	private String nom;
	private Position position;
	private Rectangle dimension;
	private int batterie;
	private Roche coffreEchantillon;
	private int pieceMecanique;
	
	//constructeur
	public Base() {
		nom = "Base lunaire";
		position = new Position(16, 4); // La position est en haut à gauche de la zone de dimension 20*20
		dimension = new Rectangle(8, 8); // La surface au sol est un carre de 8*8
		batterie = 100;
		coffreEchantillon = new Roche();
		pieceMecanique = 10;
	}
	
	//getters
	public Position getPosition() {
		return position;
	}
	
	//méthodes
	public boolean RechargerRobot(Robot _robot) {
		int charge = 100 - _robot.getBatterie();
		if(this.batterie > 0) {
			if(this.batterie >= charge) {
				_robot.setBatterie(100);
				this.batterie -= charge;
			}else if(this.batterie < charge) {
				_robot.setBatterie(this.batterie + _robot.getBatterie());
				this.batterie = 0;
			}
			return true;
		}else {
			return false;
		}
		
	}
}
