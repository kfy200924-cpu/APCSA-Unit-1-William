package Unit7;

import java.util.ArrayList;

public class SortingMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            list.add((int)(Math.random() * 100));
        }
        System.out.println(list);
        insertionSort(list);
        System.out.println(list);
    }

    public static void insertionSort(ArrayList<Integer> list) {
        for(int i = 1; i < list.size(); i++) {
            int current = list.remove(i);
            int index = i - 1;
            while(index >= 0 && current < list.get(index)) {
                index--;
            }
            list.add(index + 1, current);
        }
    }

    public static void insertionSortArray(int arr[]) {
        for(int i = 1; i < arr.length; i++) {
            int element = arr[i];
            int index = i - 1;
            while(index >= 0 && element < arr[i]) {
                arr[i + 1] = arr[i];
                index--;
            }
            arr[index + 1] = element;
        }
    }
}
