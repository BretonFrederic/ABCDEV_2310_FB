package exercice_le_robot_v1;

public class Robot {
	
	//Attributs
	private String nom;
	private Position position;
	private int stockage;
	private int batterie;
	private final double rayonDetection;
	
	//Constructeurs
	public Robot(String _nom) {
		this.nom = _nom;
		this.position = new Position(11, 11);
		this.stockage = 0;
		this.batterie = 100;
		this.rayonDetection = 2;
	}
	
	//getters
	public int getStockage() {
		return this.stockage;
	}
	
	public int getBatterie() {
		return this.batterie;
	}
	
	public Position getPosition() {
		return this.position;
	}
	
	//Méthodes
	public void Avancer(Direction _direction) {
		if(batterie > 0) {
			switch(_direction) {
			case HAUT:
				if(this.position.getPositionY() < 21) {
					this.batterie -= 2;
					this.position.setPositionY(this.position.getPositionY()+1);
				}
				break;
			case BAS:
				if(this.position.getPositionY() > 0) {
					this.batterie -= 2;
					this.position.setPositionY(this.position.getPositionY()-1);
				}
				break;
			case GAUCHE:
				if(this.position.getPositionX() > 0) {
					this.batterie -= 2;
				this.position.setPositionX(this.position.getPositionX()-1);
				}
				break;
			case DROITE:
				if(this.position.getPositionX() < 21) {
					this.batterie -= 2;
					this.position.setPositionX(this.position.getPositionX()+1);
				}
				break;
			}
		}
		
	}
	
	public void Detecter(Secteur _secteur) {
		int compteur = 0;
		this.batterie -= 2;
		for(int i = 0; i <= _secteur.getTableauRoche().length-1; i++) {
			Position posRoche = _secteur.getRochePosition(i);
			//pythagore
			double distancePoint = Math.sqrt(Math.abs(Math.pow(((posRoche.getPositionX() - this.position.getPositionX())), 2)) + Math.abs(Math.pow(((posRoche.getPositionY() - this.position.getPositionY())), 2)));
			if(rayonDetection >= distancePoint) {
				compteur++;
			}
		}
		if(compteur > 0) {
			System.out.println("\n[Le scanner a détecté de la roche lunaire.]\n");
		}else {
			System.out.println("\n[Le scanner n'a rien détecté.]\n");
		}
	}
	
	public void Recolter(Secteur _secteur) {
		this.batterie -= 2;
		for(int i = 0; i <= _secteur.getTableauRoche().length-1; i++) {
			Position posRoche = _secteur.getRochePosition(i);
			//pythagore
			double distancePoint = Math.sqrt(Math.abs(Math.pow(((posRoche.getPositionX() - this.position.getPositionX())), 2)) + Math.abs(Math.pow(((posRoche.getPositionY() - this.position.getPositionY())), 2)));
			if(rayonDetection >= distancePoint) {
				//On vérifie qu'il reste assez de la place, capacité stockage Max 2000
				if(_secteur.getRochePoids(i) <= (2000-this.stockage)) {
					this.stockage += _secteur.getRochePoids(i);
					_secteur.setRochePosition(i);
					System.out.printf("\n[Le robot a récolté : %d gramme(s) de roche lunaire.]\n\n", _secteur.getRochePoids(i));
				}
			}
		}
	}
	
	public void AfficherInfo() {
		System.out.printf("\nNom : %s\nPosition : x = %d, y = %d\nStockage : %d gramme(s)\nBatterie : %d%%\n", this.nom, this.position.getPositionX(), this.position.getPositionY(), this.stockage, this.batterie);
	}
}
