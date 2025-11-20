package arrays;

public class maxWealth {
    static  int maximumWealth(int[][] accounts){
        if(accounts.length == 0){
            return -1;
        }
        int ans = 0;
        for(int[] account: accounts){
            int sum = 0;
            for(int money: account){
                sum += money;
            }
            ans = Math.max(ans,sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] account = {
                {1,3,42,1,2},{12,31,2,31,3}
        };
        System.out.println(maximumWealth(account));
    }
}
