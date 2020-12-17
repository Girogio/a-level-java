package Using_Arrays;
import java.util.Scanner;


class Ages {

    public static void main(String args[]) {
        int size = 20;
        String[] names = new String[size];
        int[] ages = new int[size];
        Scanner s = new Scanner(System.in);
        int average = 0;
        // names
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name: ");
            names[i] = s.nextLine();
        }
        // ages
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age {" + (i + 1) + "}");
            ages[i] = s.nextInt();
            average += ages[i];
        }

        average /= names.length;

        for (int i = 0; i < size; i++) {
            System.out.print("Name: " + names[i] + "\nAge: " + ages[i] + "Above or below average: ");
            if (ages[i] < average)
                System.out.print("Below\n");
            else
                System.out.print("Above\n");
        }
        s.close();
    }

}