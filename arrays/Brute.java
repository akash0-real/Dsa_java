package arrays;

import java.util.Arrays;

public class Brute {
    static int[] search(int[] nums, int target){
        int[] ans = {-1,-1};
        int first = one(nums,target,true);
        int last = one(nums,target,false);

        ans[0] = first;
        ans[1] = last;

        return ans;

    }
    static int one(int[] two,int target,boolean one){
        int ans = -1;
        int start = 0;
        int end = two.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(target < two[mid]){
                end = mid -1;
            }else if(target > two[mid]){
                start = mid +1;
            }else{
                ans = mid;
                if(one){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] one = {1,2,3,4,5,7,7,8};
        int target = 7;
        System.out.println(Arrays.toString(search(one, target)));
    }
}
