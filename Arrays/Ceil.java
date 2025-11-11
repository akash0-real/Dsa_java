package Arrays;

public class Ceil {
    static int number(int[] one,int target){
        int start = 0;
        int last = one.length-1;

        while(start<=last){
            int mid = start + (last-start)/2;

            if(target < one[mid]){
                last = mid-1;
            }
            else if(target > one[mid]){
                start = mid+1;
            }
            else{
                return one[mid];
            }
        }
        if(start<one.length){
            return one[start];
        }else return -1;
    }
    static int FloorNumber(int[] one,int target){
        int start = 0;
        int last = one.length-1;

        while(start<=last){
            int mid = start + (last-start)/2;

            if(target < one[mid]){
                last = mid-1;
            }
            else if(target > one[mid]){
                start = mid+1;
            }
            else{
                return one[mid];
            }
        }
        if(start<one.length){
            return one[last];
        }else return -1;
    }

    public static void main(String[] args) {
        int[] one = {1,2,3,4,5,8,9};
        int target = 6;
        System.out.println(number(one,target));
        System.out.println(FloorNumber(one,target));
    }
}
