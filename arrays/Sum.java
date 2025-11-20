package arrays;

import java.util.HashMap;

public class Sum {
    public static int[] SumOfTwo(int[] one,int target){
        if(one.length == 0){
            return new int[]{-1,-1};
        }
        for(int i=0;i<one.length-1;i++){
            for(int j=i+1;j<one.length;j++){
                if(one[i] + one[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] HashSum(int[] one,int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<one.length;i++){
            int def = target-one[i];

            if(map.containsKey(def)){
                return new int[]{map.get(def), i};
            }
            map.put(one[i],i);

        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] one = {1,2,3,5,6,7,3,12,32,123,533,42};
        int target = 13;
        int[] two = SumOfTwo(one,target);
        System.out.println(two[0] + " " + two[1]);
        int[] three = HashSum(one,target);
        System.out.println(three[0] + " " + three[1]);

    }
}
