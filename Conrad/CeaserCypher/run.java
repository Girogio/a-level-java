import java.util.Scanner;
import java.util.regex.Pattern;
public class run
{

    public static void main(String args[]){
        Cypher cyph = new Cypher();
        Scanner s = new Scanner(System.in);
        String choice = null;
        do{
            System.out.print("1. Encrypt a phrase\n2. Decrpyt Phrase\n3. Quit\n");

            do{
                System.out.println("\nEnter choice: ");
                choice = s.nextLine();
            }while(!Pattern.matches("[1-3]", choice)); 

            switch(Integer.parseInt(choice)){
                case 1:
                String toEnc = null;
                do{
                    System.out.println("\fEnter string to encrypt: ");
                    toEnc = s.nextLine();
                }while(!Pattern.matches("[A-Za-z ]+", toEnc)); 
                System.out.println("Encrypted: " + cyph.encryptString(toEnc) + "\n\n");
                break;

                case 2:
                String toDec = null;
                do{
                    System.out.println("\fEnter string to decrypt: ");
                    toDec = s.nextLine();
                }while(!Pattern.matches("[A-Za-z ]+", toDec)); 
                System.out.println("Decrypted: " + cyph.decryptString(toDec)+ "\n\n");
                break;

                case 3:
                System.out.println("\fBye bye!");
                return;
                default:
                System.out.println("\fInvalid input");
                break;
            }
        }while(choice != "3");
    }
}
