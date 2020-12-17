package Using_Arrays;
public class Shift {
    public static void main(String args[]) {

        arr = fillRandom(arr, 1, 10);
        
        printArray(arr);
        printArray(lShift(arr));

    }

    static int[] arr = new int[5];

    static int[] lShift(int[] n) {
        
        for (int i = 0; i < n.length; i++) {
            if (i != 0) {
                n[n.length - 1] += n[n.length - 1 - i];
                n[n.length - 1 - i] -= n[n.length - 1];
                n[n.length - 1] += n[n.length - 1 - i];
                n[n.length - 1 - i] = -n[n.length - 1 - i];
            }
        }
        return n;
    }

    static void printArray(int[] a) {
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (i != a.length - 1)
                System.out.print(a[i] + ", ");
            else
                System.out.print(a[i]);

        }
    }

    static int[] fillRandom(int[] a, int min, int max) {

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * max + min);
        }

        return a;
    }
}
