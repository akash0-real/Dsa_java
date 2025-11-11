package Arrays;

public class Binary {
    static int run(int[] one, int target){
        if(one.length == 0){
            return  -1;
        }

        int start = 0;
        int end = one.length-1;

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
        return start;
    }

    public static void main(String[] args) {
        int[] one = {1,2,3,4,5,6,7,8};
        int target = 5;
        System.out.println(run(one,target));
    }
}
