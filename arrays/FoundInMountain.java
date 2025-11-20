package arrays;

public class FoundInMountain {
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid +1;
            }

        }
        return start;
    }
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
    static int OrderAbs(int[] nums,int target,int start,int end){
        boolean one = nums[start]<nums[end];

        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(one){
                if(target < nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else {
                if(target > nums[mid]){
                    end = mid -1;
                }else {
                    start = mid+1;
                }
            }
        }
        return -1;

    }
    static int search(int[] arr,int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = Binary(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return OrderAbs(arr,target,peak+1,arr.length-1);

    }

    public static void main(String[] args) {
        int[] one = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(one,target));
    }


}
