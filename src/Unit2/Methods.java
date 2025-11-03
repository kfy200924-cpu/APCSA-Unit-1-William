package Unit2;

public class Methods {
    //Method Overloading
    //allows us to reuse the same method name for different methods essentially doing the same thing

    //It is a feature of programming languages. To create overloaded methods, you should alter their signatures
    public static void main(String[] args) {
        int x = add(2,3);
        double y = add(2,3.0);
        int z = add(2,3,4);

        int a = Math.abs(-42); //returns int 42
        double b = Math.abs(-50.0); //returns double 50.0
        //These are two different abs() functions

        //int c = Math.pow(3,5); Doesn't work

        double c = Math.pow(3,5);

        //int d = Math.sqrt(4); Doesn't work

        double d = Math.sqrt(4);

        System.out.println(8 * Math.random() + 7); //Generates a random double between 7.0 and 15.0
        System.out.println(random(15,10));
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double random(double high, double low) {
        return (high - low) * Math.random() + low;

    }
}