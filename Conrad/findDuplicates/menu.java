import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

class menu {

	public static ArrayList<String> input = new ArrayList<String>();
	private static Scanner s = new Scanner(System.in);

	public static void main(String args[]) {

		while (true) {
			check check = new check();
			Average avg = new Average();

			String[] query = { "cat", "dog", "mouse" };

			System.out.println("Welcome. Enter \"*\" to stop and \"/\" to exit the whole program: ");

			String in = "";

			do {

				System.out.println("Enter string: ");

				do {

					in = s.nextLine();

					// case /
					if (in.equals("/")) {
						System.out.println("\fBye bye!");
						return;
					}
					// case not alphabet or *
					else if (!(Pattern.matches("[A-Za-z]+", in) || Pattern.matches("[*]", in))) {
						System.out.println("Invalid input! Only alphabet and * are accepted");
					}
				} while (!(Pattern.matches("[A-Za-z]+", in) || Pattern.matches("[*]", in)));

				input.add(in);

			} while (!in.equals("*"));

			// print result
			System.out.print("{ ");

			for (int i : check.result(query, input)) {
				System.out.print(i + " ");
			}
			System.out.print("}");

			avg.calcAverage(check.result(query, input));

		}
	}
}
