
public class RandomPlayer extends Player {

	public RandomPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		Roshambo ro = Roshambo.SCISSORS;
		int cast = (int)(Math.random() * 3);
		switch (cast) {
			case 0:
				ro = Roshambo.PAPER;
				break;
			case 1:
				ro = Roshambo.ROCK;
				break;
			case 2:
				ro = Roshambo.SCISSORS;
				break;
			default:
				System.out.println("Error!");
				break;
		}
		return ro;
	}

}
