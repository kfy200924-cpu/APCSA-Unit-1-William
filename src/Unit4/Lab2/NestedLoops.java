package Unit4.Lab2;

public class NestedLoops {
    public static void main(String[] args) {
        //A single loop runs n times:
        int count = 0;
        for(int i = 0; i < 3; i++) {
            count++; //iteration runs 3 times.
        }

        //A nested loop runs outer * inner times:
        int count1 = 0;
        for(int i = 0; i < 2; i++) { //runs 2 times
            for(int j = 0; j < 3; j++) { //runs 3 times
                count++; //Total: 2 * 3 = 6 times.
            }
        }
        System.out.println(countMatchingPairs("banana"));

        for(int i = 1; i < 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println(countTriple("xxxxbbacccyyy"));
    }

    public static int countMatchingPairs(String word) {
        int pairs = 0;
        for(int i = 0; i < word.length() - 1; i++) {
            String current = word.substring(i, i + 1);
            for(int j = i + 1; j < word.length(); j++) {
                String next = word.substring(j, j + 1);
                if(current.equals(next)) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    //"xxxxbbacccyyy" -> 4 triples
    public static int countTriple(String str) {
        int triples = 0;
        for(int i = 0; i < str.length() - 2; i++) {
            String current = str.substring(i, i + 1);
            int count = 0;
            for(int j = i + 1; j < i + 3; j++) {
                String next = str.substring(j, j + 1);
                if(current.equals(next)) {
                    count++;
                }
            }
            if(count == 2) {
                triples++;
            }
        }
        return triples;
    }
}
