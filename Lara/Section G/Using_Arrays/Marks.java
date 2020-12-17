package Using_Arrays;
import java.util.Scanner;

class Marks {
    Scanner s = new Scanner(System.in);

    public void inputMarks(double a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("\nEnter element no. " + (i + 1) + ": ");
            a[i] = s.nextDouble();
        }
    }

    public void showMarks(double a[]) {
        System.out.println();
        for (double i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

            public double highestMark(double a[]) {
                double min = Double.MIN_VALUE;
                for (double i : a) {
                    if (i > min)
                        min = i;
                }
                return min;

            }
}