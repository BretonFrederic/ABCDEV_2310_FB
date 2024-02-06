package exercice_le_robot;

public class Robot {
	
	//attributs
	private String nom;
	private Position position;
	private int batterie;
	private int etatVehicule;
	private Roche reserveEchantillon;
	private Detecteur scanner;
	
	//constructeur
	public Robot() {
		this.nom = "Lunokhod 1";
		this.position = new Position(16, 4); // La position est en haut à gauche de la zone de dimension 20*20
		this.batterie = 100;
		this.etatVehicule = 100;
		//reserveEchantillon = new Roche();
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
			for(int i = 0; i <= reserveEchantillon.getPourcentage().length - 1; i++) {
				temp[i] = 0;
			}
			this.reserveEchantillon = new Roche();
			_zone.setRoche();
		}
	}
}
