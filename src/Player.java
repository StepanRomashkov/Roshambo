
public abstract class Player {
	private String name;
	private int wins = 0;
	private int losses = 0;
	
//	public Player(String name){
//		super();
//		this.name = name;
//	}
	
	
//	public void setName(String n) {
//		name = n;
//	}
	
	public Roshambo playerThrow() {
		return Roshambo.ROCK;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
