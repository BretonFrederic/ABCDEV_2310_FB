package exercice_le_robot;

public enum Direction {
	HAUT("vers le nord", 1), BAS("vers le sud", 1), GAUCHE("vers l'ouest", 1), DROITE("vers l'est", 1), STOP("A l'arrêt", 0);
	private String dir;
	private int deplacement;
	
	Direction(String _dir, int _deplacement) {
		this.dir = _dir;
		this.deplacement = _deplacement;
	}
	
	public String getDir() {
		return dir;
	}
	
	public int getDeplacement() {
		return deplacement;
	}
}
