package exercice_fruits_v1;

// L'interface n'est pas une classe  pas de constructeur, 
// On peut y mettre uniquement des méthodes abstraite.
// Le mot clé abstract devant les méthodes peut être ignoré.
// Pas de méthodes avec un corps seulement déclaration.

public interface PeelFruit {
	
	public boolean isPeeled();
	
	public String getSkinType();
	
}
