package Unit6;

public class ArrayAlgorithms {
    public static void main(String[] args) {

    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double findMin(double[] arr) {
        double min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for(int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public static double average(double[] arr) {
        double aveSum = 0;
        for(int i = 0; i < arr.length; i++) {
            aveSum += arr[i];
        }
        return aveSum / arr.length;
    }

    public static String findDuplicate(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i].equals(arr[j])) {
                    return arr[i];
                }
            }
        }
        return null;
    }

    public static boolean areAllEven(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasNegative(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                return true;
            }
        }
        return false;
    }

    public static int countStartsWithA(String[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].startsWith("A")) {
                count++;
            }
        }
        return count;
    }

    public static boolean hasDuplicate(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftLeft(int[] arr) {
        if(arr.length <= 1) {
            return;
        }
        for(int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    public static void shiftRight(int[] arr) {
        if(arr.length <= 1) {
            return;
        }
        for(int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = 0;
    }

    public static void rotateRight(int[] arr) {
        if(arr.length <= 1) {
            return;
        }
        int last = arr[arr.length - 1];
        for(int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }


}
