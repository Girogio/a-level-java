import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.regex.Pattern;
class main{

    public static void main(String args[]){
        String choice = "-1";
        brain brain = new brain();
        String num;
        Scanner s = new Scanner(System.in);
        do{
            System.out.print("1. Diamond of numbers\n2. Diamond of letters\n3. Exit");
            choice = s.nextLine();  
            switch(choice){

                case "1":{
                    do{
                        System.out.println("\fPlease enter end number");
                        num = s.nextLine();
                    }while(!Pattern.matches("[1-9]\\d*", num));

                    brain.printNumber(Integer.parseInt(num));
                    break;
                }

                case "2":{
                    do{
                        System.out.println("\fPlease enter end letter");
                        num = s.nextLine();
                        num = num.toLowerCase();
                    }while(!Pattern.matches("[a-z]{1}", num));

                    brain.printLetter(num.charAt(0) );
                    break;
                }

                case "3":
                System.out.println("Bye Bye!");
                return;

                default:
                System.out.println("Invalid choice");
                break;

            }
        }while (!Pattern.matches("[1-3]{1}",choice) || choice != "3");
    }
}