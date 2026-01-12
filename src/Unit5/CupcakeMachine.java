package Unit5;

public class CupcakeMachine {
    private int availableCupcakes;
    private double cupcakeCost;
    private int orderNumber;
    public static void main(String[] args) {
        String info;
        CupcakeMachine c1 = new CupcakeMachine(10, 1.75);
        info = c1.takeOrder(2);
        System.out.println(info);
        info = c1.takeOrder(3);
        System.out.println(info);
        info = c1.takeOrder(10);
        System.out.println(info);
        info = c1.takeOrder(1);
        System.out.println(info);
        CupcakeMachine c2 = new CupcakeMachine(10, 1.5);
        info = c2.takeOrder(10);
        System.out.println(info);
    }

    public CupcakeMachine(int cakes, double cost) {
        availableCupcakes = cakes;
        cupcakeCost = cost;
        orderNumber = 1;
    }

    public String takeOrder(int quantity) {
        String message;
        if(quantity > availableCupcakes) {
            return "Order cannot be filled";
        } else {
            availableCupcakes -= quantity;
            message = "Order number " + orderNumber + ", cost $" + (quantity * cupcakeCost);
            orderNumber++;
        }
        return message;
    }

}
