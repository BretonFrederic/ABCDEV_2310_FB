package exercice_le_robot_v1;

public class Secteur {
	//attributs
		private String nom;
		private Rectangle taille;
		private int[][] rocheLunaire;
		
	//constructeur
	public Secteur() {
		nom = "Mer de tranquillité";
		taille = new Rectangle(20, 20);
		rocheLunaire = new int[][] {{3, 1, 500},
									{2, 5, 300},
									{17, 10, 700},
									{12, 14, 300},
									{7, 15, 200}};
	}
	
	//getters et setters
	public Position getRochePosition(int _numeroRoche) {
		Position pos = new Position(this.rocheLunaire[_numeroRoche][0], this.rocheLunaire[_numeroRoche][1]);
		return pos;
	}
	
	public int getRochePoids(int _numeroRoche) {
		return this.rocheLunaire[_numeroRoche][2];	
	}
	
	public int[][] getTableauRoche() {
		return this.rocheLunaire;	
	}
	
	public void setRochePosition(int _numeroRoche) {
		this.rocheLunaire[_numeroRoche][0] = -10;
		this.rocheLunaire[_numeroRoche][1] = -10;
	}
	
	public void setRochePoids(int _numeroRoche) {
		this.rocheLunaire[_numeroRoche][2] = 0;	
	}
}
