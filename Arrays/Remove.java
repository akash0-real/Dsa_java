package Arrays;

public class Remove {
    static int RemoveDuplicate(int[] nums,int target){
        if(nums.length == 0){
            return 0;
        }

        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != target){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,42,1,435,64,6,7,1,2,3,2,2,2,2};
        int target = 2;

        int one = RemoveDuplicate(nums,target);
        System.out.println(one);
        for(int i = 0; i < one; i++){  // Only print first k elements
            System.out.print(nums[i] + " ");
        }
    }
}
