package Using_Arrays;
import java.util.Scanner;

public class Payroll {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        int size = 5;

        String[] names = new String[size];
        double[] payRate = new double[size];
        double[] hoursWorked = new double[size];

        char choice = 0;
        do {
            System.out.println("a. Input names\nb. Input hours worked\nc. Input pay rate\nd. Print payroll\ne. Quit");
            String st;
            do {
                st = s.nextLine();
            } while (st.length() != 1);

            choice = st.toLowerCase().charAt(0);

            switch (choice) {
                case 'a': {
                    for (int i = 0; i < size; i++) {
                        System.out.print("\nEnter name for employee no. " + (i + 1));
                        names[i] = s.nextLine();
                        s.nextLine();
                    }
                    break;
                }
                case 'b':
                    for (int i = 0; i < size; i++) {
                        System.out.print("\nEnter hours worked for employee no. " + (i + 1));
                        hoursWorked[i] = s.nextDouble();
                    }
                    break;

                case 'c':
                    for (int i = 0; i < size; i++) {
                        System.out.print("\nEnter pay rate for employee no. " + (i + 1));
                        payRate[i] = s.nextDouble();
                    }
                    break;

                case 'd':
                    if (names[size - 1] != null && payRate[size - 1] != 0 && hoursWorked[size - 1] != 0) {
                        for (int i = 0; i < size; i++) {
                            System.out.print("\n\n---------------------------");
                            System.out.print("\nName: " + names[i]);
                            System.out.print("\nPay rate: " + payRate[i]);
                            System.out.print("\nHours worked: " + hoursWorked[i]);
                            System.out.print("\nGross wage: " + hoursWorked[i] * payRate[i]);
                            System.out.print("\nGross wage: " + hoursWorked[i] * payRate[i]);
                            System.out.print("\nNet wage: " + hoursWorked[i] * payRate[i] * 0.85);
                        }
                        System.out.print("---------------------------");

                    }

                    break;
                default:
                    System.out.println("Invalid input!");
                    break;

            }
            st = "";
        } while (choice != 'e');
        s.close();

    }
}
