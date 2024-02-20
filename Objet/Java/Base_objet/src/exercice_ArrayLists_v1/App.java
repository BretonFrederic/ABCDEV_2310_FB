package exercice_ArrayLists_v1;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		// list.add(index); pour ajouter
		// list.remove(index); pour retirer
		// list.clear(); effacer la liste
		// list.size(); taille du tableau
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Fred");
		list.add("Bon 14 juillet");
		
		if(list.contains("Fred")) {
			System.out.println("l'élément existe bien");
		}
		
		list.add("texte");

		
		System.out.println(list);
		System.out.println(list.get(0));

	}

}
