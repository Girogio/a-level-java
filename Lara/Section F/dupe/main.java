package dupe;
import java.util.Scanner;

class main{
    public static void main(String args[]){
        secondary sec = new secondary();
        Scanner s = new Scanner(System.in);
        int duplicateNumber = 0;
        System.out.print("Enter a string: ");
        String string = s.nextLine();
        System.out.print(sec.duplicateNumber(string));
    }

}