package Unit4;

public class LoopsPractice {
    public static void main(String[] args) {
        //Sum of integers from 1 to 100.
        int sum = sum(1, 100);
        System.out.println(sum);
        int sum1 = sum(1811, 1856);
        System.out.println(sum1);
        int sum2 = sum(942, 24573);
        System.out.println(sum2);

        int divisible = divisible(1, 1000);
        System.out.println(divisible);

        getDigits();

        int sumOfDigits = sumOfDigits(1234);
        System.out.println(sumOfDigits);

        fourHeads();
    }


    public static void fourHeads() {
        int count = 0;
        while(count < 4) {
            int probability = (int) (Math.random() * 2);
            if(probability == 1) {
                System.out.print("H ");;
                count++;
            } else {
                System.out.print("T ");
                count = 0;
            }
        }
        System.out.println();
        System.out.println("Four heads in a row!");
    }

    //Write a function that calculates a sum of all digits in a given number.
    public static int sumOfDigits(int x) {
        int sum = 0;
        while(x != 0) {
            int lastDigit = x % 10;
            x = x / 10;
            sum += lastDigit;
        }
        return sum;
    }

    public static void getDigits() {
        int x = 1234;
        while(x != 0) {
            int lastDigit = x % 10;
            x = x / 10;
            System.out.println("Last digit is " + lastDigit + ", X is " + x);
        }
    }

    public static int sum(int first, int last) {
        if(first > last)
            return -1;

        int sum = 0;
        int number = first;
        while(number <= last) {
            sum = sum + number;
            number++;
        }
        return sum;
    }

    //Determine how many numbers are divisible by 3, but not divisible by 5 between 1 and 1000.
    public static int divisible(int first, int last) {
        if(first > last)
            return -1;

        int count = 0;
        while(first <= last) {
            if(first % 3 == 0 && first % 5 != 0) {
                count++;
            }
            first++; //first -> last
        }
        return count;
    }
}
