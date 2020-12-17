
public class Average {

    public String calcAverage(int[] toCalc) {
        double i = 0;

        for (int a : toCalc) {
            i += a;
        }
        i /= toCalc.length;

      
        return("\n\nAverage: " + i);

    }
    public String calcAverage(int[] toCalc, boolean withZero) {
  
       
        if (withZero) {
            return calcAverage(toCalc) + " E";

        } 

        return null;
    }
}
