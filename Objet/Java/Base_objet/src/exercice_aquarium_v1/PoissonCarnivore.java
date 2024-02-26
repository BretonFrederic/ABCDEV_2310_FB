package exercice_aquarium_v1;

public class PoissonCarnivore extends Poisson {

	//attributs
		private PoissonC race;
		
		//constructeur
		public PoissonCarnivore(String _nom, String _sexe, PoissonC _race) {
			super(_nom, _sexe);
			this.race = _race;
		}
		
		//getters et setters
		public String getRace() {
			return race.toString();
		}
		
		//méthodes
		@Override
		public boolean Manger() {
			System.out.println("Carnivore mange");
			return false;
		}
}
