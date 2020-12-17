package Using_Arrays;
import java.util.Scanner;

class Numbers {
    static Scanner s = new Scanner(System.in);

    public static void main(String args[]) {
        int[] nums = new int[10];
        inputNums(nums);
        System.out.println(calcAvg(nums));
        System.out.println(highestNum(nums));
        System.out.println(findOdd(nums));
    }

    static public void inputNums(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("\nEnter element no. " + (i + 1) + ": ");
            a[i] = s.nextInt();
        }
    }

    static public double highestNum(int a[]) {
        double max = Integer.MIN_VALUE;
        for (int i : a) {
            if (i > max)
                max = i;
        }
        return max;
    }

    static public int calcAvg(int a[]) {
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return (total /= a.length);
    }

    static int findOdd(int a[]) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

}