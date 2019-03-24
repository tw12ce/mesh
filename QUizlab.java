import java.util.*;

public class QUizlab {

	public static void main(String[] args) {
		System.out.println("M E S H");
		Scanner s = new Scanner(System.in);
		while (true) {
			String input = s.nextLine();
			switch (input) {
			case "m":
			    System.out.println(math.mathQuestion());
				break;
			case "e":
				System.out.println(english.englishQuestion());
				break;
			case "s":
				System.out.println(science.scienceQuestion());
				break;
			case "h":
				System.out.println(history.historyQuestion());
				break;
			default:
				System.out.println("input invalid");
			}
		}
	}
}
