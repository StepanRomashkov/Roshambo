
public enum Roshambo {
	ROCK,
	PAPER,
	SCISSORS;
	
	public String toString(Roshambo ro) {
		String result;
		switch (ro) {
		case ROCK:
			result = "Rock";			
			break;
		case PAPER:
			result = "Paper";
			break;
		case SCISSORS:
			result = "Scissors";
			break;
		default:
			result = "Error";
			break;
		}
		return result;
	}
	
}

