import java.util.*;
class test{
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        boolean isValid = false;
        String a;
        do{

            a =  s.nextLine();
            a= a.toLowerCase();
            char[] charArray = a.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                char ch = charArray[i];
                if (!(ch >= 'a' && ch <= 'z')) {
                    return;
                }
            }
        }while(!isValid);
    }
}