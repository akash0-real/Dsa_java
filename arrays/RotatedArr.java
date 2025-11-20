package arrays;

public class RotatedArr {
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length -1;
        
        while(start <= end){
             int mid = start + (end - start)/2;

             if(mid < end && nums[mid] >  nums[mid+1]){
                 return mid;
             }
            if(mid > start && nums[mid] <  nums[mid- 1]){
                return mid-1;
            }
            if(nums[mid] <= nums[start]){
                end = mid -1;
            }else {
                start = mid +1;
            }
        }
        return -1;
    }
    static int binarys(int[] nums,int target){
         int pivot = findPivot(nums);
         if(pivot == -1){
             return run(nums,target,0,nums.length-1);
         }else {
             if(nums[pivot] == target){
                 return pivot;
             }
             if(target >= nums[0]){
                return run(nums,target,0,pivot-1);
             }
             return run(nums,target,pivot+1,nums.length-1);
         }
    }
    static int run(int[] one, int target,int start,int end){

        while(start<=end){
            int mid = start+(end-start)/2;

            if(target < one[mid]){
                end = mid -1;
            }
            else if(target > one[mid]){
                start = mid+1;
            }
            else if(target == one[mid]){
                return mid;
            }else{
                start = mid+1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,10,1,2,3,};
        int target = 3;
        System.out.println(binarys(nums,target));
    }
}

