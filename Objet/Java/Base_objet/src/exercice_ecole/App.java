package exercice_ecole;

public class App {

	public static void main(String[] args) {
		
		Professeur prof1 = new Professeur("Brown", "Emmett", 1985, "Mathématique");
		Etudiant etudiant1 = new Etudiant("McFly", "Marty", 2015, "Bac S");
		
		System.out.println(etudiant1.DireBonjour());
		System.out.println(etudiant1.AffichageAge());
		System.out.println(etudiant1.GoToClasse());
		
		System.out.println(prof1.DireBonjour());
		System.out.println(prof1.AffichageAge());
		System.out.println(prof1.ACours());
	}

}
