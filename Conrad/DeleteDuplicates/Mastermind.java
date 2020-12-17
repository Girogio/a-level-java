import java.util.*;
import javax.swing.*;
class Mastermind{
    public static void main (String args[]){

        boolean avalible;

      
        int tries = 10;
        
        
        
        
        
     
        String ColourGuessed;
        String codeArray[] = { "B","G","W","Y","R","P"};
        String codeArray1[] = {"b","g","w","y","r","p"};
        String codeGuessed[] = new String[4];
        String codeGenerated []= new String[4];

        
        JOptionPane.showMessageDialog(null,"Hi welcome to MasterMind game.");
        JOptionPane.showMessageDialog(null,"You will have 10 chances to guess the generated code \n Lets get started. ");

        for(int i = 0; i < codeGenerated.length; i++){
            Random rand = new Random();
            int code = rand.nextInt(codeArray.length);

            codeGenerated[i]=codeArray[code];

        }
        //need to be remove
        String codeDone = "the code is :" ;
        for(int i= 0 ; i<codeGenerated.length; i++){
            codeDone +=codeGenerated[i] + ", " ;

        }

        JOptionPane.showMessageDialog(null, codeDone);

        
        
        for(int i=0 ; i < tries ; i++){
            JOptionPane.showMessageDialog
            (null,">>>>>>>>>>>>>>>Guess the 4 colours<<<<<<<<<<<<<<<\n       [B]lue  [G]reen  [Y]ellow  [W]hite  [R]ed  [P]urple\n              Please enter the first letter of the colour");

            for(int j=0; j < codeGenerated.length; j++){
                //to reset
                avalible=false;
                

                while(avalible==false){
                    ColourGuessed = JOptionPane.showInputDialog(null,">>>>>>>>>>>>>>>Guess the 4 colours<<<<<<<<<<<<<<<\n                      [B]lue  [G]reen  [Y]ellow  [W]hite  [R]ed  [P]urple\n       Colour "+j);
                    for(int a=0 ; a < codeArray.length ; a++){

                        if(ColourGuessed.equals(codeArray[i]) || ColourGuessed.equals(codeArray1[i]) ){
                            JOptionPane.showMessageDialog(null,"Hi  game.");

                            avalible=true;
                            break;

                        }else if(i==5){
                            JOptionPane.showMessageDialog(null,"wrong");
                            avalible=false;
                            break;

                        }else {

                            avalible=false;

                        }
                    }
                    codeGuessed[i]=ColourGuessed; 

                }
             
            
            }
            String Yourcolour = "Your Chosen Colours are ";
            for(int b=0 ; i<codeGenerated.length ; b++){

                b++;
                Yourcolour += "\nColour "+b+"=";
                Yourcolour += codeGuessed[i];
            }

            JOptionPane.showMessageDialog
            (null,Yourcolour);

            System.exit(0);
        }

            
      
    }
}