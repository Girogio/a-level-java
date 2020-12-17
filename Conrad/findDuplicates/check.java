import java.util.ArrayList;

public class check {

	public int[] result(String[] query, ArrayList<String> subject) {
		int[] result = new int[query.length];

		for (int j = 0; j < query.length; j++) {

			for (int i = 0; i < subject.size(); i++) {
				if (subject.get(i).equalsIgnoreCase(query[j])) {
					result[j]++;
				}
			}

		}
		return result;
	}

}
