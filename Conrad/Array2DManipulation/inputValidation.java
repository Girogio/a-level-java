import java.util.Scanner;
import java.util.regex.Pattern;

class inputValidation
{
    Scanner s = new Scanner(System.in);

    String ask(String message, String errorMessage, String regex){
        String string = null;
        int emptyInt = 0;
        do{
            System.out.print("\n" + message);

            string = s.nextLine();

            if(!(Pattern.matches(regex,string))){
                System.out.println(errorMessage);
            }

        }while(!(Pattern.matches(regex,string)) || string.length() == 0);

        return string;
    }

    int ask(String message, String errorMessage, String regex, String datatype){
        String string = null; 
        int output = 0;
        do{
            System.out.println(message);
            try{

                string = s.nextLine();
            }
            catch(Exception e){}
            if(!(Pattern.matches(regex,string))){

                System.out.println(errorMessage);
            }

        }while(!(Pattern.matches(regex,string)) || string.length() == 0);

        if(datatype.equals("int")){
            output = Integer.parseInt(string);
        }
        return output;
    }

}
