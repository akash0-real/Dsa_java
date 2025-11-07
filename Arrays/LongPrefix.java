package Arrays;

public class LongPrefix {
    static String longString (String[] one){
        if(one.length ==0){
            return "";
        }

        String first = one[0];
        for(int i=0;i<first.length();i++){
            char two = first.charAt(i);

            for(int j=1;j<one.length;j++){
                if(i>=one[j].length() || two != one[j].charAt(i)){
                    return first.substring(0,i);
                }
            }
        }
        return "";


    }

    public static void main(String[] args) {
        String[] one = {"akash","akyush","akmber","akpache"};
        String two = longString(one);
        System.out.println(two);
    }
}
