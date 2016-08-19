
public class RockPlayer extends Player {
	
	public RockPlayer(String name) {
		super(name);
	}
	
	@Override
	public void generateRoshambo() {
		setRoshambo(Roshambo.ROCK);
	}
	
}
