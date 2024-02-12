package exo_Robot_correction;

/**
 * Cette classe permet de definir un point qui servira pour la position du robot
 */

public class Point {
	
	private int abcsisse, ordonnee;
	
	public Point(int _abcsisse, int _ordonnee)
	{
		this.abcsisse = _abcsisse;
		this.ordonnee = _ordonnee;
	}
	
	public int getAbcsisse()
	{
		return this.abcsisse;
	}
	
	public int getOrdonnee()
	{
		return this.ordonnee;
	}
	
	public void setAbcsisse(int _abcsisse)
	{
		this.abcsisse = _abcsisse;
	}
	
	public void setOrdonnee( int _ordonnee)
	{
		this.ordonnee = _ordonnee;
	}

}
