package Unit6;

public class Mode {
    public static void main(String[] args) {
        int[] grade = {42, 67, 67, 67, 90, 95, 100, 95, 98};

        int[] freq = new int[101];
        int index = 0;
        for(int i = 0; i < grade.length; i++) {
            int digit = grade[i];
            freq[digit]++;
        }
        for(int j = 0; j < freq.length; j++) {
            if(freq[j] > freq[index]) {
                index = j;
            }
        }

        System.out.println(index);
    }
}
