package Using_Arrays;

public class Swap {

    public static void main(String args[]) {

        int[] n = new int[5];

        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * 10 + 1);
            if (i == n.length - 1)
                System.out.print(n[i]);
            else
                System.out.print(n[i] + ", ");

        }
        System.out.println();

        n[n.length - 1] += n[n.length - 2];
        n[n.length - 2] -= n[n.length - 1];
        n[n.length - 1] += n[n.length - 2];
        n[n.length - 2] = -n[n.length - 2];

        for (int i = 0; i < n.length; i++) {
            if (i == n.length - 1)
                System.out.print(n[i]);
            else
                System.out.print(n[i] + ", ");

        }

    }

}