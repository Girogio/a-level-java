import java.lang.Math;

public class RandomNos {

public static void main(String args[]){
    int array[][] = new int[4][5];

    for(int c = 0; c < array.length; c++){
        for(int r = 0; r < array[c].length; r++){
            array[c][r] = ((int) Math.random() * 5) + 1; 
        }
    }

    for(int r = 0; r < array.length; r++){
        for(int c = 0; c < array[c].length; c++){
            System.out.print(array[c][r]);
        }
        System.out.println();
    }

    }
}
