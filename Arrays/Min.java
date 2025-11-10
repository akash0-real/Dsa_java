package Arrays;

public class Min {
    static int minimum(int[] one){
        if(one.length == 0){
            return -1;
        }
        int a = one[0];
        for(int num: one){
            if(num<a){
                a = num;
            }
        }
        return a;
    }
    static int maximum(int[] one){
        if(one.length ==0){
            return -1;
        }
        int a = one[0];
        for(int num: one){
            if(num>a){
                a = num;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] one = {1,2,3,4,5,6,-1,23,42,12};
        System.out.println(minimum(one));
        System.out.println(maximum(one));
    }

}
