package exercice_fruits_v1;

public class PineApple extends Fruit implements PeelFruit {
	
	private boolean peeled = false;
	
	public PineApple() {
		super("ananas");
	}
	
	@Override
	public void taste() {
		System.out.println("L'ananas a un goût un peu acide");
	}
	
	@Override
	public int getSize() {
		//
		return 2;
	}
	
	@Override
	public boolean hasSeed() {
		//
		return false;
	}
	
	@Override
	public boolean isPeeled() {
		return peeled;
	}
	
	@Override
	public String getSkinType() {
		return "piquante";
	}
}
