package Unit6;

public class ArrayTest {
    //Attribute of a class shows what information objects of this type will hold.
    //Attributes are global variables.
    private int[] arr;

    public ArrayTest(int[] arr) {
        this.arr = arr;
    }

    public double average() {
        double total = 0;
        for(int i = 0; i < arr.length; i++) {
            total += arr[i]; //total = total + arr[i]
        }
        return total / arr.length;
    }

    public int countAboveAverage() {
        double ave = average();
        int counter = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > ave) {
                counter++;
            }
        }
        return counter;
    }

    public int largest() {
        int largest = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public int indexOfSmallest() {
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 10, 9, 25, 46, 7, 100};
        ArrayTest at = new ArrayTest(arr);
        System.out.println(at.average());
        System.out.println(at.countAboveAverage());
        System.out.println(at.largest());
        System.out.println(at.indexOfSmallest());
    }
}
