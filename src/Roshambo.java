
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
	
	public static boolean victory(Roshambo you, Roshambo opp) {
		if ((you.equals(ROCK) && opp.equals(SCISSORS)) 
				|| (you.equals(PAPER) && opp.equals(ROCK))
				|| (you.equals(SCISSORS) && opp.equals(PAPER)))
			return true;
		else return false;
	}
	
}

