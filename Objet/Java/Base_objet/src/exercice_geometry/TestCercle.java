package exercice_geometry;

public class TestCercle {

	public static void main(String[] args) {
		
		//création d'un cercle
		Point centreCercle1 = new Point(0, 0);
		Cercle cercle1 = new Cercle(centreCercle1, 10);
		
		//création d'un point
		Point point1 = new Point(0, 10);
		cercle1.Appartenance(point1);
		cercle1.Afficher();
		
	}

}
