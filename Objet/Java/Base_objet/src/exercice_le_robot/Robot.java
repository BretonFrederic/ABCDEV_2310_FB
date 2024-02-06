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
		nom = "Lunokhod 1";
		position = new Position(16, 4); // La position est en haut à gauche de la zone de dimension 20*20
		batterie = 100;
		etatVehicule = 100;
		//reserveEchantillon = new Roche();
		int[] temp  = this.reserveEchantillon.getPourcentage();
		for(int i = 0; i <= reserveEchantillon.getPourcentage().length - 1; i++) {
			temp[i] = 0;
		}
		reserveEchantillon.setPourcentage(temp);
		scanner = new Detecteur(this.position, 4);
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
	
	public void ScannerSol() {
		Position positionRoche = new Position(2, 2);
		this.scanner.Detecter(positionRoche);
	}
	
	public boolean Recolter() {
		
	}
}
