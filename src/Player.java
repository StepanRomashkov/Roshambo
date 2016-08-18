
public abstract class Player {
	private String name;
	private Roshambo currentRoshambo = Roshambo.PAPER;
	private int wins = 0;
	private int losses = 0;
	
	public Player() {
		name = "Player1";
	}
	
	public Player(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Roshambo getRoshambo() {
		return currentRoshambo;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setGameResult (boolean res) {
		if (res)
			wins++;
		else
			losses++;
	}
	
	public void setRoshambo (Roshambo ro) {
		this.currentRoshambo = ro;
	}
	
	public String getPlayerStat() {
		return "wins: " + wins + "\nlosses: " + losses;
	}

	public abstract Roshambo generateRoshambo();
		
}
