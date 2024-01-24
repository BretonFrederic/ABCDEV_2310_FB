package exercice_montres_v1;

public class Personne {
		//variables d'instance
		String nom;
		Montre montre;
		boolean porteUneMontre;
		char identifiantMontre;
		
		//constructeurs
		public Personne(String _nom) {
			nom = _nom;
			montre = null;
			porteUneMontre = false;
			identifiantMontre = ' ';
		}
			
		//méthodes
		public boolean MettreMontre(Montre _montre) {
			if(!this.porteUneMontre) {
				this.montre = _montre;
				porteUneMontre = true;
				_montre.setProprietaire(this.nom);
				this.identifiantMontre = _montre.getIdentifiant();
				return true;
			}else {
				return false;
		}
		
		public boolean EnleverMontre() {
			if(this.porteUneMontre) {
				this.montre = _montre;
				porteUneMontre = true;
				_montre.setProprietaire(this.nom);
				this.identifiantMontre = _montre.getIdentifiant();
				return true;
			}else {
				return false;
		}
	}
}
