package ihm;


public class Main {

	public static void main(String[] args) {
		Ihm ihm = new Ihm();
		Hex game = new Hex(4, 2, ihm);
		game.play();
	}

}
