package Using_Arrays;

public class usingMarks {
    public static void main(String args[]) {
        Marks m = new Marks();
        double[] marks = new double[15];
        m.inputMarks(marks);
        m.showMarks(marks);
        System.out.println(m.highestMark(marks));
    }
}