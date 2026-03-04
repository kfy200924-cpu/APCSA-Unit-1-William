package Unit7;

public class Pseudocode {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 7, 8, 9};
        System.out.println(findSmallestMissing(nums));
    }

    public static int findSmallestMissing(int[] nums) {
        int left = nums[0];
        int right = nums[nums.length - 1];
        if(left != 0) {
            return 0;
        }
        while(left <= right) {
            int mid = (left + right) / 2;
            if(mid == nums[mid]) {
                left = mid + 1;
            } else if(mid < nums[mid]) {
                right = mid - 1;
            }
        }
        return left;
    }
}
