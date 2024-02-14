package exercice_date_v1;

public class App {

	public static void main(String[] args) {
		
		Date date1 = new Date(30,4,2024);
		if(date1.ValiderDate()) {
			System.out.println("Date valide.");
		}else {
			System.out.println("Date invalide.");
		}
	}

}
