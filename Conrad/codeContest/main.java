import java.util.Scanner;
import java.util.regex.Pattern;

class main{

    public void runMagicString(){
        String input;
        Scanner s = new Scanner(System.in);

	    //requesting user input
            System.out.print("In: ");
            input = s.nextLine();
        


        //converting possible capital letters

        //declaring and initializing an empty placeholder for the output
        String output = "";

        //repeat n times where n is the number of letters (starting from the end)
        for(int i = input.length(); i > 0; i--){

            /*

            1) selecting current letter in the cycle
            2) converting it to int according to the ASCII codes
            3) subtracting 96 such that the first letter a (ASCII: 97) coincides with the alphabet thus 'a' becoming 1
            4) adding an increment of 1 according to the iteration number
            5) converting that value to string and appending it to the output string

             */

            output += String.valueOf(input.substring(i-1, i).charAt(0) - 96 + (input.length() - i));





        }

        //finally output the whole string compiled previously
        System.out.print("\nOut: " + output);
    }

}
