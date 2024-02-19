package exercice_fruits_v1;

public class Apple extends Fruit implements PeelFruit {
	
	public Apple() {
		super("pomme");
	}
	
	@Override
	public void taste() {
		System.out.println("La pomme a un goût plutôt sucré");
	}
	
	@Override
	public int getSize() {
		//
		return 1;
	}
	
	@Override
	public boolean hasSeed() {
		//
		return true;
	}
}
