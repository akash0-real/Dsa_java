package Arrays;

public class Duplicate {
    static int removeDuplicate(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int k = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4,5,5,6};
        System.out.println(removeDuplicate(nums));
    }
}
