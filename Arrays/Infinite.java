package Arrays;

public class Infinite {
    static int Binary(int[] nums,int target,int start,int end){

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < nums[mid]){
                end = mid -1;
            } else if (target > nums[mid]){
                start = mid + 1;
            }else {
                return mid;
            }

        }
        return -1;
    }
    static int ans(int[] nums,int target){
        int start = 0;
        int end = 1;
        while(target > nums[end]){
            int temp = end+1;
            end = end + (end - start) * 2;
            start = temp;
        }
        return Binary(nums,target,start,end);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,5,6,7,8,9,12,13,14,19,21,22,25,27,51,71,89,101,189};
        int target = 101;

        System.out.println(ans(nums,target));
    }
}
