class max {

    public static void findMax(int a, int b, int c) {

        if (a > b && a > c)
            System.out.println("Largest":+a)
        else if (b > a && b > c)
            System.out.println("Largest":+b)
        else if (c > a && c > b)
            System.out.println("Largest":+c)


    }

    public static void findMax(double a, double b, double c) {

        if (a > b && a > c)
            System.out.println("Largest":+a)
        else if (b > a && b > c)
            System.out.println("Largest":+b)
        else if (c > a && c > b)
            System.out.println("Largest":+c)

    }

    public static void main(String[] args) {

        findMax(54, 89, 14);

    }

}