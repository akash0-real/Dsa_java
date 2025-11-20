package arrays;

public class Linear {

    public static void main(String[] args) {

        int[] nums = {1,34,5,3,12,213};
        int target = 5;
        int ans = one(nums,target);
        System.out.println(ans );
        String name = "akash";
        char dis = 'a';

        int one = search(name,dis);
        System.out.println(one);
    }
    static int one(int[] arr, int target){
        if(arr.length ==0){
            System.out.println("No elements");
        }
        for(int i=0;i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    static int search(String str,char target){
        if(str.isEmpty()){
            return -1;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }
}
