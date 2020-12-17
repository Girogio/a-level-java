package Handler;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Input {

	Scanner s = new Scanner(System.in);

	public String ask(String message, String errorMessage, String regex) {
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


}
