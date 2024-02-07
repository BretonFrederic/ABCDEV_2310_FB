package exercice_le_robot_v1;

public class Position {
		
	//attributs
	private int positionX;
	private int positionY;
	
	//constructeur
	public Position(int _positionX, int _positionY) {
		positionX = _positionX;
		positionY = _positionY;
	}
	
	//getters
	public int getPositionX() {
		return positionX;
	}
	
	public int getPositionY() {
		return positionY;
	}
	
	public void setPositionX(int _positionX) {
		this.positionX = _positionX;
	}
	
	public void setPositionY(int _positionY) {
		this.positionY = _positionY;
	}
}
