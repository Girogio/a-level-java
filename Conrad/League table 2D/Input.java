import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Input {

	Scanner s = new Scanner(System.in);

	public String nextString(String message, String errorMessage, String regex) {
		String string = null;
		do {
			System.out.print("\n" + message);

			string = s.nextLine();

			if (!(Pattern.matches(regex, string))) {
				System.out.println(errorMessage);
			}

		} while (!(Pattern.matches(regex, string)) || string.length() == 0);

		return string;
	}

	public int nextInt(String message, String errorMessage, int lower, int higher) {
		boolean isNum = false;
		String a = null;
		int num = 0;
		do {

			System.out.print("\n" + message);
			a = s.nextLine();
			try {
				num = Integer.parseInt(a);
				isNum = true;
			} catch (NumberFormatException m) {
				System.out.println("Invalid Input");
				isNum = false;
			}
			if (num < lower || num > higher) {
				System.out.println(errorMessage);
			}

		} while ((num < lower || num > higher) || !isNum);

		return num;
	}

	public int nextInt(String message, String errorMessage, int bound, String LorH) {
		int num = 0;
		String a = null;
		boolean isNum = true;
		do {
			if (LorH.toLowerCase() == "l") {
				do {
					System.out.print("\n" + message);

					a = s.nextLine();
					try {
						num = Integer.parseInt(a);
						isNum = true;
					} catch (NumberFormatException e) {
						isNum = false;

					}

					if (num < bound) {
						System.out.println(errorMessage);
					}
				} while (num < bound);
			}
			if (LorH.toLowerCase() == "h") {
				do {
					System.out.print("\n" + message);

					try {

						num = s.nextInt();
						s.nextLine();
						isNum = true;

					} catch (InputMismatchException m) {
						System.out.print("Input mismatch exception");
						isNum = false;

					}

					if (num > bound) {
						System.out.println(errorMessage);
					}
				} while (num > bound);
			}
		} while (!isNum);
		return num;
	}

}
