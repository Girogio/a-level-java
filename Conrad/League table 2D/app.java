public class app {

	public static void main(String lols[]) {
		Input in = new Input();
		int teamNum = 3;
		app app = new app();
		int fieldsNum = 5;
		String teamNames[] = new String[teamNum];
		int[][] chart = new int[teamNum][fieldsNum];

		for (int i = 0; i < teamNum; i++) {
			for (int j = 0; j < fieldsNum; j++) {
				switch (j) {
				case 0:
					teamNames[i] = in.nextString("Enter team name: ", "Team name can only consist of letters!",
							"[a-zA-Z. ]+");
					chart[i][j] = in.nextInt("Enter " + teamNames[i] + "'s games played: ", "Invalid input", 0, "l");
					break;
				case 1:
					chart[i][j] = in.nextInt("Enter " + teamNames[i] + "'s games won: ", "Invalid input", 0,
							chart[i][0]);
					break;
				case 2:
					chart[i][j] = in.nextInt("Enter " + teamNames[i] + "s games lost: ", "Invalid input", 0,
							(chart[i][0] - chart[i][1]));
					break;
				case 3:
					System.out.print("\nAuto calculation of drawn games: ");

					chart[i][3] = (chart[i][0] - ((chart[i][1] + chart[i][2])));
					System.out.print(chart[i][3] + "\n");
					break;
				case 4:
					chart[i][j] = ((chart[i][1] * 3) + chart[i][3]);
					break;
				}
			}
		}
		app.sortChart(chart, teamNames);
		System.out.println();
		app.printChart(chart, teamNames);

	}

	public void sortChart(int[][] array, String[] teamNames) {
		for (int i = 0; i < teamNames.length - 1; i++) {
			for (int j = 0; j < teamNames.length - 1 - i; j++) {
				if (array[j][4] < array[j + 1][4]) {
					swap2DArray(j, j + 1, array);
					swapArray(j, j + 1, teamNames);
				}
			}

		}
	}

	public void printChart(int[][] chart, String[] teamnames) {
		System.out.print("Teams\t\tWins\tLosses\tDraws\tPoints\t");
		for (int i = 0; i < chart.length; i++) {
			System.out.print("\n" + teamnames[i] + "\t\t");
			for (int j = 0; j < chart[i].length; j++) {
				System.out.print(chart[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void swap2DArray(int from, int to, int[][] array) {
		int[] a;
		a = array[from];
		array[from] = array[to];
		array[to] = a;
	}

	public void swapArray(int from, int to, String[] array) {
		String a;
		a = array[from];
		array[from] = array[to];
		array[to] = a;
	}

}
