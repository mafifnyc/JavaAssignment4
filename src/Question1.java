public class Question1 {
    public static int sum(int x, int y)
    {
        int z = x + y;

        return z;

    }

    public static int multiplication(int x, int y)
    {
        int z = x *y;

        return z;

    }

    public static int difference(int x, int y)
    {
        int z = x - y;

        return z;
    }

    public static double quotient(double x, double y)
    {
        double z = x / y;

        return z;
    }
    public static void main(String[] args) {

        int x = 2;
        int y = 3;


        System.out.println("Sum of " + x +" and " + y + " is " + sum(x,y));
        System.out.println("Multiplication of " + x +" and " + y + " is " + multiplication(x,y));
        System.out.println("Difference of " + x +" and " + y + " is " + difference(x,y));
        System.out.println("Quotient of " + x +" and " + y + " is " + quotient(x,y));


    }


}
