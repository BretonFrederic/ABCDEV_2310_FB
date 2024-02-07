package exercice_le_robot;

public class Robot {
	
	//attributs
	private String nom;
	private Position position;
	private int batterie;
	private int etatVehicule;
	private Roche reserveEchantillon;
	private Detecteur scanner;
	private Direction direction;
	
	//constructeur
	public Robot() {
		this.nom = "Lunokhod 1";
		this.position = new Position(16, 4); // La position est en haut à gauche de la zone de dimension 20*20
		this.batterie = 100;
		this.etatVehicule = 100;
		reserveEchantillon = new Roche();
		int[] temp  = this.reserveEchantillon.getPourcentage();
		for(int i = 0; i <= reserveEchantillon.getPourcentage().length - 1; i++) {
			temp[i] = 0;
		}
		this.reserveEchantillon.setPourcentage(temp);
		this.scanner = new Detecteur(this.position, 4);
	}
	
	//setters et getters
	public void setBatterie(int _batterie) {
		this.batterie = _batterie;
	}
	
	public int getBatterie() {
		return this.batterie;
	}
	
	public void setEtatVehicule(int _etatVehicule) {
		this.etatVehicule = _etatVehicule;
	}
	
	public int getEtatVehicule() {
		return this.etatVehicule;
	}
	
	public Position getposition() {
		return this.position;
	}
	
	public boolean Recolter(Zone _zone) {
		if(this.scanner.Detecter(_zone.getRoche().getPosition())) {
			int[] temp  = _zone.getRoche().getPourcentage();
			this.reserveEchantillon.setPourcentage(temp);
			_zone.setRoche();
			return true;
		}else {
			return false;
		}
	}
	
	public boolean ViderTout(Zone _zone) {
		if(this.scanner.Detecter(_zone.getBase().getPosition())) {
			_zone.getBase().getCoffreEchantillon().setPourcentage(this.reserveEchantillon.getPourcentage());
			this.reserveEchantillon = null;
			return true;
		}else {
			return false;
		}
	}
	
	public void Haut() {
		this.position.setPositionY(this.position.getPositionY()+1);
	}
	
	public void Bas() {
		this.position.setPositionY(this.position.getPositionY()-1);
	}
	
	public void Gauche() {
		this.position.setPositionX(this.position.getPositionX()-1);
	}
	
	public void Droite() {
		this.position.setPositionX(this.position.getPositionX()+1);
	}
	
	public void AfficherDonnee() {
		System.out.printf("Nom du robot : %s\nPosition du robot : %d(abscisse), %d(ordonnée)\nBatterie : %d\nEtat du véhicule : %d\n", this.nom, this.position.getPositionX(), this.position.getPositionY(), this.batterie, this.etatVehicule);
		for(int i = 0; i <= this.reserveEchantillon.getMateriaux().length - 1; i++) {
			System.out.printf("%s : %d\n", this.reserveEchantillon.getMateriaux()[i], this.reserveEchantillon.getPourcentage()[i]);
		}
		System.out.println();
	}
}
