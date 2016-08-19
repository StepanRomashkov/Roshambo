import java.util.Scanner;

public class Validator {
	private static boolean valid = false;
	public static Scanner scan;
	
	public static String checkGameMode(String str) {
		if (scan == null)
			scan = new Scanner(System.in);
		valid = false;
		while (!valid) {
			if (str.equalsIgnoreCase("e") || str.equalsIgnoreCase("n") || str.equalsIgnoreCase("h"))
				return str;
			else {
				System.out.print("Wrong value! You should enter \"e\", \"n\" or \"h\": ");
				str = scan.nextLine();
			}
		}
		return str;
	}
	
	public static String checkRoshambo(String str) {
		if (scan == null)
			scan = new Scanner(System.in);
		valid = false;
		while (!valid) {
			if (str.equalsIgnoreCase("r") || str.equalsIgnoreCase("p") || str.equalsIgnoreCase("s"))
				return str;
			else {
				System.out.print("Wrong value! You should enter \"r\", \"p\" or \"s\": ");
				str = scan.nextLine();
			}
		}
		return str;		
	}
	
}
