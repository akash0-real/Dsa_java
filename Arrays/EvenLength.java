package Arrays;

public class EvenLength {
    static int EvenChecker(int[] nums){
        if(nums.length == 0){
            return -1;
        }
        int count = 0;
        for(int one:nums){
            int digitCount = 0;
            int temp = one;
            while(temp>0){
                digitCount ++;
                temp = temp/10;
            }
            if(digitCount % 2 == 0){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,234,5231,4241,1213,12,1};
        System.out.println(EvenChecker(nums));
    }
}
