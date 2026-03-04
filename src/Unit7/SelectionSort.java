package Unit7;

import java.util.ArrayList;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for(int j = min_idx + 1; j < arr.length; j++) {
                if(arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void selectionSort(ArrayList<Integer> list) {
        for(int i = 0; i < list.size() - 1; i++) {
            int min_idx = i;
            for(int j = min_idx + 1; j < list.size(); j++) {
                if(list.get(j) < list.get(min_idx)) {
                    min_idx = j;
                }
            }
            int temp = list.get(min_idx);
            list.set(min_idx, i);
            list.set(i, temp);
        }
    }
}
