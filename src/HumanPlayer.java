
public class HumanPlayer extends Player {

	public HumanPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {		
		return getRoshambo();
	}
	
	public String generateRoshambo(String r) {
		switch (r) {
			case "r":
				setRoshambo(Roshambo.ROCK);
				break;
			case "p":
				setRoshambo(Roshambo.PAPER);
				break;
			case "s":
				setRoshambo(Roshambo.SCISSORS);
				break;				
		}
		return getRoshambo().toString();
	}

}
