public class Employee {

    private int ID;
    private String name, surname, type;
    private double payRate, hrs, gross, tax, net, hrsTD, grossTD, taxTD, netTD;
    final private double taxRate = 0.15;

    public Employee(int ID, String name, String surname, int type) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.type = type == 1 ? "PT" : "FT";
        if (this.type.equals("PT"))
            this.payRate = 7.15;
        else if (this.type.equals("FT"))
            this.payRate = 8.20;
    }

    public int getID() {
        return this.ID;
    }

    public void inputDetails(double hoursWorked) {

        this.hrsTD += hoursWorked;

        this.gross = this.payRate * hoursWorked;
        this.grossTD += this.gross;

        this.tax = taxRate * gross;
        this.taxTD += tax;

        this.net = gross - tax;
        this.netTD += net;
    }

    public void getDetails(Employee e) {
        System.out.println();
        System.out.println();
        System.out.print("ID: " + e.ID + "\n");
        System.out.print("Name: " + e.name + " " + e.surname + "\n");
        System.out.print("Status: " + e.type + "\n");
        System.out.println();
        System.out.println();
    }

    public void getFinancialDetails(Employee e) {
        System.out.println();
        System.out.println();
        System.out.print("Details of: " + e.name + " " + e.surname + "\n");
        System.out.print("------------------------------------------\n");
        System.out.print("Hours worked: " + e.hrs + "\n");
        System.out.print("Hours worked to date: " + e.hrsTD + "\n");
        System.out.print("Gross earned: " + e.gross + "\n");
        System.out.print("Gross earned to date: " + e.grossTD + "\n");
        System.out.printf("Tax paid: %.2f\n", e.tax);
        System.out.printf("Tax paid to date: %.2f\n", e.taxTD);
        System.out.printf("Net earned: %.2f \n", e.net);
        System.out.printf("Net earned to date: %.2f\n", e.netTD);
        System.out.println();
        System.out.println();
    }

    public void printPayslip(Employee e) {
        getDetails(e);
        e.getFinancialDetails(e);
    }
}