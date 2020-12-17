import java.util.Scanner;
import java.util.regex.Pattern;

public class run {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String input;
		do {
			input = s.nextLine();
			if (!(Pattern.matches("[1-9]+", input))) {
				System.out.println("Invalid input");
			}
		} while (!(Pattern.matches("[1-9]+", input)));

		System.out.println(iterativeSeries(Integer.parseInt(input)));
	}

	static double iterativeSeries(int n) {
		double total = 0;

		for (int i = 1; i <= n; i++) {

			total += ((double) 1 / (i));
		}

		return total;
	}

	/*
	 * static double recursiveSeries(int n) { double total = 0;
	 * 
	 * return total; }
	 */

}
