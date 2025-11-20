package arrays;
import java.util.Arrays;

public class splitTheArray {
    static boolean isPossibleToSplit(int[] nums) {
        Arrays.sort(nums);
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
                if (count > 2) return false;
            } else {
                count = 1;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4};
        System.out.println(isPossibleToSplit(nums));
    }
}
