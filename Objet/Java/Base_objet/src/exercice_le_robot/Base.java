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
		this.nom = "Base lunaire";
		this.position = new Position(16, 4); // La position est en haut à gauche de la zone de dimension 20*20
		this.dimension = new Rectangle(8, 8); // La surface au sol est un carre de 8*8
		this.batterie = 100;
		this.coffreEchantillon = new Roche();
		this.pieceMecanique = 10;
	}
	
	//getters
	public Position getPosition() {
		return this.position;
	}
	
	public int getBatterie() {
		return this.batterie;
	}
	
	//méthodes
	public void RechargerRobot(Robot _robot) {
		int charge = 100 - _robot.getBatterie();
		if(this.batterie > 0 && this.position == _robot.getposition()) {
			if(this.batterie >= charge) {
				_robot.setBatterie(100);
				this.batterie -= charge;
			}else if(this.batterie < charge) {
				_robot.setBatterie(this.batterie + _robot.getBatterie());
				this.batterie = 0;
			}
		}
		
	}
	
	public void RepareRobot(Robot _robot) {
		int degats = 100 - _robot.getEtatVehicule();
		if(this.pieceMecanique > 0 && this.position == _robot.getposition()) {
			if(degats > 0) {
				_robot.setEtatVehicule(100);
				this.pieceMecanique -= 1;
			}
		}
	}
	
	public void AfficherDonnees() {
		System.out.printf("Nom de la base : %s\nPosition de la base : %d(abscisse), %d(ordonnée)\nBatterie : %d", this.nom, this.position.getPositionX(), this.position.getPositionY(), this.batterie);
		for(int i = 0; i <= this.coffreEchantillon.getMateriaux().length - 1; i++) {
			System.out.printf("%s : %d", this.coffreEchantillon.getMateriaux()[i], this.coffreEchantillon.getPourcentage()[i]);
		}
		System.out.printf("Pièce(s) mécanique : ", pieceMecanique);
	}
}
