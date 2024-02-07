package exercice_le_robot;

public enum Direction {
	HAUT("vers le nord"), BAS("vers le sud"), GAUCHE("vers l'ouest"), DROITE("vers l'est");
	private String dir;
	
	Direction(String _dir) {
		this.dir = _dir;
	}
	
	public String getDir() {
		return dir;
	}
}
