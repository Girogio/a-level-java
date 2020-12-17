
public class Average {

	public void calcAverage(int[] toCalc) {
		double i = 0;
		boolean zero = false;
		for (int a : toCalc) {
			if (a == 0) {
				zero = true;
			} else

				i += a;
		}
		i /= toCalc.length;
		if (zero) {
			System.out.println("\n\nAverage: " + i + " and E");

		} else
			System.out.println("\n\nAverage: " + i);
	}
}
