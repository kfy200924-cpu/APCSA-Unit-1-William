package Unit7.Lab1;

import java.util.ArrayList;

public class Lab1 {
    public static void main(String[] args) {

    }

    public static void removeTwoLargest(ArrayList<Integer> list) {
        if(list.size() < 2) return;

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int idx1 = -1;
        int idx2 = -1;
        int[] arr = {10, 5, 10, 3};
        for (int i = 0; i < arr.length; i++) {
            int val = list.get(i);
            if (val > max1) {
                max2 = max1;
                idx2 = idx1;
                max1 = val;
                idx1 = i;
            } else if(val > max2) {
                max2 = val;
                idx2 = i;
            }
        }

        int first = Math.max(idx1, idx2);
        int second = Math.min(idx1, idx2);
        list.remove(first);//remove first from the right to prevent shifting.
        list.remove(second);
    }
}
