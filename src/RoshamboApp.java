import java.util.Scanner;

public class RoshamboApp {
	public static Scanner scan = new Scanner(System.in);
	private static String userChoice;
	private static HumanPlayer human;
	private static Player compAI;
	
	public static void main(String[] args) {
		System.out.print("Welcome to Rock Paper Scissors!\nWhat's your name? ");
		
		human = new HumanPlayer(scan.nextLine());
		System.out.println("Choose game mode: easy(e) normal(n) hard(h): ");
		userChoice = Validator.checkGameMode(scan.nextLine());
		if (userChoice.equalsIgnoreCase("e")) {
			compAI = new RockPlayer("Rocky");
		} else if (userChoice.equalsIgnoreCase("n")) {
			compAI = new RandomPlayer("Norman");
			compAI.setNormalMode();
		} else {
			compAI = new RandomPlayer("Trickster");
			compAI.setHardMode();
		}
		System.out.println("Good choice, " + human.getName() + "! You will play against " + compAI.getName());

		do {
			System.out.println("Current score:\n\t" + human.getName() + ":\t\t\t" + compAI.getName() + ":\n"
					+ human.getPlayerStat() + "\t\t" + compAI.getPlayerStat());
			System.out.println(human.getName() + ", make your move:\nr) Rock\np) Paper\ns) Scissors\n");
			userChoice = Validator.checkRoshambo(scan.nextLine());
			human.generateRoshambo(userChoice);
			compAI.generateRoshambo();
			System.out.println("\nYour choice is " + human.getRoshambo().toString() + "\n" + compAI.getName()
					+ "'s choice is " + compAI.getRoshambo().toString());
			if (human.getRoshambo().equals(compAI.getRoshambo()))
				System.out.println("DRAW! Nobody won. Play again?(y/n)");
			else if (Roshambo.victory(human.getRoshambo(), compAI.getRoshambo())) {
				System.out.println("You win! Play again?(y/n)");
				human.setGameResult(true);
				compAI.setGameResult(false);
			} else {
				System.out.println("You lost! Play again?(y/n)");
				human.setGameResult(false);
				compAI.setGameResult(true);
			} 
		} while ("y".equalsIgnoreCase(scan.nextLine()));
		System.out.println("Good game! Final score:\n\t" + human.getName() + ":\t\t\t" + compAI.getName() + ":\n"
				+ human.getPlayerStat() + "\t\t" + compAI.getPlayerStat());		
		scan.close();
	}

}
