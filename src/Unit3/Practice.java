package Unit3;

public class Practice {
    public static void main(String[] args) {
        playGame();
    }

    public static int rollDice(int low, int high) {
        return (int)((high - low + 1) * Math.random()) + low;
    }

    public static void playGame() {
        int dice1 = rollDice(3, 8);
        int dice2 = rollDice(10, 20);

        System.out.println("Score: " + (dice1 + dice2));

        if(dice1 + dice2 > 25) {
            System.out.println("Win!!!");
        } else {
            System.out.println("Try again.");
        }
    }
}
