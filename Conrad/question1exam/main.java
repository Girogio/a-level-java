import java.util.Scanner;
import java.util.InputMismatchException;
class main{
    public static void main(String args[]){

        Scanner s = new Scanner (System.in);
        int tmp;
        int tmp2 = -1;
        int array[] = new int[10];

        for(int i = 0; i < array.length; i++){
            do{
                System.out.println("Enter a number: ");
                try
                {
                    tmp2 = s.nextInt();

                }catch(InputMismatchException e){
                    tmp2 = -2;
                }
                s.nextLine();

                if(tmp2 < 0 || tmp2 > 9){
                    System.out.println("Invalid input\n");
                }

            }while(tmp2 < 0 || tmp2 > 9);
            array[i] = tmp2;
        }

        System.out.print("\fArray before: ");
        for(int i : array){
            System.out.print(i + ", ");   
        }
        System.out.println();

        for(int i = 0; i<array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[j] ==0){
                    tmp = array[j];
                    try{
                        array[j] = array[j+1];
                        array[j+1] = tmp;
                    }catch(ArrayIndexOutOfBoundsException e){}
                }

            }
        }

        System.out.print("Array after: ");
        for(int i: array){
            System.out.print(i + ", ");   
        }

    }
}