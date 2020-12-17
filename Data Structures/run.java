import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        String choice = "-1";
        Scanner s = new Scanner(System.in);

        do {
            System.out.print("1. Linear Queue\n2. Circular Queue\n");
            choice = s.nextLine();

            switch (choice) {

                case "1": {
                    LinearQueue l = new LinearQueue();
                    l.showOperations();
                    break;
                }
                case "2": {
                    CircularQueue c = new CircularQueue();
                    c.showOperations();
                    break;
                }
            }

        } while (!choice.toLowerCase().equals("exit"));

        s.close();
    }

}
