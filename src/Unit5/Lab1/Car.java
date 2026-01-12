package Unit5.Lab1;

public class Car {
    public static final String BLACK = "Black";
    public static final String WHITE = "White";
    public static final String PINK = "Pink";
    public static final String RED = "Red";
    public static final String BLUE = "Blue";

    private String color;
    private String model;
    private int year;
    private String vin;
    private static int totalCars = 0;

    public Car(String color, String model, int year, String vin) {
        if(color.equals(BLACK) || color.equals(WHITE) || color.equals(PINK) || color.equals(RED) || color.equals(BLUE)) {
            this.color = color;
        } else {
            this.color = BLACK;
        }

        if(year >= 1900) {
            this.year = year;
        } else {
            System.out.println("Enter a valid year");
            this.year = 1900;
        }
        this.model = model;
        this.vin = vin;
        totalCars++;
    }

    public Car(String color, String model, int year) {
        this(color, model, year, "VIN" + (totalCars + 1));
    }

    public String setColor(String newColor) {
        if (newColor.equals(BLACK) || newColor.equals(WHITE) || newColor.equals(PINK) || newColor.equals(RED) || newColor.equals(BLUE)) {
            this.color = newColor;
        } else {
            this.color = color;
        }
        return color;
    }}