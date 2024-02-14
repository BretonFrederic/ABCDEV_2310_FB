package exercice_date_v1;

public class App {

	public static void main(String[] args) {
		
		Date date1 = new Date(3,5,2024);
		date1.Afficher(date1);
		Date date2 = new Date(3,5,2024);
		date1.Afficher(date2);
		
		if(date1.Comparer(date2)) {
			System.out.println("La date1 est inférieur à la date2");
		}else {
			System.out.println("La date1 n'est pas inférieur à la date2");
		}
	}

}
