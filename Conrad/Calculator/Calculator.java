import java.util.Scanner;

class Calculator{
    static Scanner s = new Scanner(System.in);
    static int choice = 0;
    public static void main(String args[]){

        do{

            showMenu();
            choice = s.nextInt();
            switch(choice){
                case 1:{
                    System.out.println(calcRec());
                    break;
                }
                case 2:{
                    System.out.println(calcACirc());   
                    break;
                }
                case 3:{
                    Message();   
                }
            }
        }while(choice!=3);
    }

    static void showMenu(){

        System.out.println("1.Area of rectangle\n2.Area of Circle\n3.Quit");

    }

    static double calcRec(){
        double num1;
        double num2;

        do{
            System.out.println("Enter number 1");
            num1 = s.nextDouble();
        }while(num1 < 0);

        do{
            System.out.println("Enter number 2");
            num2 = s.nextDouble();
        }while(num2 < 0);

        return (num1*num2);
    }

    static double calcACirc(){
        double radius;
        do{
            System.out.println("Enter radius: ");
            radius = s.nextDouble();
        }while(radius < 0);

        return Math.PI * Math.pow(radius,2);

    }

    static void Message(){
        System.out.println("Thanks for using the program");

    }
}
