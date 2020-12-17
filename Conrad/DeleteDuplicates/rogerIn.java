import java.util.Scanner;
import java.util.regex.Pattern;

class rogerIn
{
    private Scanner s = new Scanner(System.in);
    private String string = null;
    private float fl = 0;
    private int emptyInt = 0;
    String ask(String message, String errorMessage, String regex){
        string = null;
        emptyInt = 0;
        do{
            System.out.print("\n" + message);

            string = s.nextLine();

            if(!(Pattern.matches(regex,string))){
                System.out.println(errorMessage);
            }

        }while(!(Pattern.matches(regex,string)) || string.length() == 0);

        return string;
    }
    private int output;
    float input(String message, String errorMessage){
        do{
            System.out.println(message);
            try{

                float = s.nextFloat();
            }
            catch(Exception e){}

        }while(float < 0 || float > 100);
        return float;
    }

}
