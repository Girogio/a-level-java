
/**
 * Write a description of class input here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{

    public static void main(String args[]){

        rogerIn input = new rogerIn();
        clean clean = new clean();

        System.out.println(clean.clean(input.ask("Enter a sentence! Only letters and spaces allowed. (Case Sensitive) \n","Invalid Input!\n", "[a-zA-Z ]+")));
    }
}