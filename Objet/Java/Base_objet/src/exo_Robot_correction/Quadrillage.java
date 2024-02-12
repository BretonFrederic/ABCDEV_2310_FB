package exo_Robot_correction;

/**
 * cette classe permet de definir la zone de deplacement du robot
 */

public class Quadrillage {
	
	private int abcsisseMax, abcsisseMin, ordonneeMax, ordonneeMin;
	
	public Quadrillage(int _abcsisseMax, int _abcsisseMin, int _ordonneeMax, int _ordonneeMin)
	{
		this.abcsisseMax = _abcsisseMax;
		this.abcsisseMin = _abcsisseMin;
		this.ordonneeMax = _ordonneeMax;
		this.ordonneeMin = _ordonneeMin;
	}
	
	public int getAbcsisseMax()
	{
		return this.abcsisseMax;
	}
	
	public int getAbcsisseMin()
	{
		return this.abcsisseMin;
	}
	
	public int getOrdonneMax()
	{
		return this.ordonneeMax;
	}
	
	public int getOrdonneMin()
	{
		return this.ordonneeMin;
	}

}
