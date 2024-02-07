package exercice_le_robot;

public enum Direction {
	HAUT("haut"), BAS("bas"), GAUCHE("gauche"), DROITE("droite");
	private String dir;
	
	Direction(String _dir) {
		this.dir = _dir;
	}
	
	public String getDir() {
		return dir;
	}
}
