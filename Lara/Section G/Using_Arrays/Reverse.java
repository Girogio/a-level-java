package Using_Arrays;
public class Reverse {

    public static void main(String[] args) {
        int[] randoms = new int[15];
        int[] reverseRandoms = new int[15];

        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = (int) (Math.random() * 100 + 1);
        }

        for (int i = (reverseRandoms.length - 1); i >= 0; i--) {
            reverseRandoms[15-i] = randoms[i];
        }

        for(int i : randoms){
            System.out.println(i);
        }
        for(int i : reverseRandoms){
            System.out.println(i);
        }
    }

}
