//Giorgio Grigol BC2B Group B



import java.util.Scanner;

public class Grades
{

    static Scanner s = new Scanner(System.in);

    public static void main(String args[]){
        System.out.println("Student grade: " + calcGrade(inputMark()));
    }

   static int inputMark(){
        int mark = -54;
        do{
            System.out.println("Enter mark 0-100: ");
            try{
                mark=s.nextInt();
            }catch(Exception e){  
                System.out.println("Invalid input: ");
            }
        }while(mark < 0 && mark > 100); 
        return mark;
    }

   static char calcGrade(int mark){
        if(mark > 0 && mark <= 49)
            return 'F';
        else if(mark > 50 && mark <= 64)
            return 'D';
        else if(mark > 65 && mark <= 74 )
            return 'C';
        else if(mark >75 && mark <= 84)
            return 'B';
        else if(mark > 85 && mark <= 100)
            return 'A';
        else return 0;
    }
}
