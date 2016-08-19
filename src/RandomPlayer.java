import java.util.Random;
public class RandomPlayer extends Player {
	
	public RandomPlayer(String name) {
		super(name);
	}
	
	@Override
	public void generateRoshambo() {
		Random rand = new Random();
		int cast;
		if (getGameMode())
			cast = rand.nextInt(3);
		else
			cast = (int)(Math.random() * 3);
		switch (cast) {
			case 0:
				setRoshambo(Roshambo.PAPER);
				break;
			case 1:
				setRoshambo(Roshambo.ROCK);
				break;
			case 2:
				setRoshambo(Roshambo.SCISSORS);
				break;
		}
	}

}
