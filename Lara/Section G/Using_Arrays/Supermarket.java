package Using_Arrays;
import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args) {
        int[] barcodes = new int[5];
        String[] itemNames = new String[5];
        double[] grossPrice = new double[5];
        double[] netPrice = new double[5];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter barcode: ");
            barcodes[i] = s.nextInt();

            System.out.print("Enter item name: ");
            s.nextLine();

            itemNames[i] = s.nextLine();

            System.out.print("Enter gross price: ");
            grossPrice[i] = s.nextDouble();

            netPrice[i] = grossPrice[i] * 1.18;
        }

        System.out.print("Barcode\tItem name\tGross price\tNet price\n");

        for (int i = 0; i < 5; i++) {
            System.out.printf(barcodes[i] + "\t" + itemNames[i] + "\t" + grossPrice[i] + "\t %.2f", netPrice[i]);
            System.out.println();
        }
        s.close();
    }
}
