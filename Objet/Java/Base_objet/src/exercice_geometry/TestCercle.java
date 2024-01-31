package exercice_geometry;

public class TestCercle {

	public static void main(String[] args) {
		
		//création d'un cercle
		Point centreCercle1 = new Point(1, 1);
		Cercle cercle1 = new Cercle(centreCercle1, 2);
		
		//création d'un point
		Point point1 = new Point(8, 0);
		cercle1.Appartenance(point1);
		cercle1.Afficher();
		
	}

}
