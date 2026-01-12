package Unit5;

public class LapTracker {
    private int updateFrequency;
    private int calls;
    private int laps;
    public static void main(String[] args) {
        int count;
        LapTracker amy = new LapTracker(3);
        count = amy.addLaps(8);
        System.out.println(count);
        count = amy.addLaps(12);
        System.out.println(count);
        count = amy.addLaps(10);
        System.out.println(count);
        count = amy.addLaps(11);
        System.out.println(count);
        count = amy.addLaps(5);
        System.out.println(count);
        count = amy.addLaps(13);
        System.out.println(count);
    }

    public LapTracker(int frequency) {
        updateFrequency = frequency;
        calls = 0;
        laps = 0;
    }

    public int addLaps(int extraLaps) {
        if(calls == updateFrequency) {
            laps = 0;
            calls = 0;
            laps += extraLaps;
        } else {
            laps += extraLaps;
            calls++;
        }
        return laps;
    }
}
