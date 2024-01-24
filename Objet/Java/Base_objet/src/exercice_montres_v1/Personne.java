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
				System.out.println(this.nom+" met la montre "+_montre.getIdentifiant());
				this.montre = _montre;
				porteUneMontre = true;
				_montre.setEstPortee(true);
				_montre.setProprietaire(this.nom);
				this.identifiantMontre = _montre.getIdentifiant();
				return true;
			}else {
				return false;
			}
		}
		
		public boolean EnleverMontre() {
			if(this.porteUneMontre) {
				System.out.println(this.nom+" enlève la montre "+this.identifiantMontre);
				this.identifiantMontre = ' ';
				this.montre.setProprietaire("");
				this.montre.setEstPortee(false);
				this.montre = null;
				porteUneMontre = false;
				return true;
			}else {
				return false;
			}
		}
		
		public String DemanderHeure(Personne _personne) {
			System.out.println(this.nom+" demande l'heure à "+_personne.nom);
			if(_personne.porteUneMontre) {
				return _personne.montre.AfficherHeure();
			}else {
				return "Désolé, je n'ai pas de montre.";
			}
		}

}
