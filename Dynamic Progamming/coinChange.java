//coin change in 2D
class Solution {
    public int coinChange(int[] coins, int amount) {
        int c=coins.length;
        int[][] dp= new int[c+1][amount+1];
        if(amount==0){
            return 0;
        }
        for(int i=1;i<amount+1;i++){
            dp[0][i]=amount+1;
        }
        for(int i=1;i<=c;i++){
            for(int j=1;j<amount+1;j++){
                if(j<coins[i-1]){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=Math.min(1+dp[i][j-coins[i-1]],dp[i-1][j]);
                }
            }
        }
        if(dp[c][amount]==amount+1){
            return -1;
        }else{
            return dp[c][amount];
        }
    }
}
//in 1D DP
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        for(int i=0;i<amount+1;i++){
            dp[i]=Integer.MAX_VALUE;
        }
        dp[0]=0;
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<=amount;j++){
                if(dp[j-coins[i]]!=Integer.MAX_VALUE){
                    dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
                }
            }
        }
        if(dp[amount]==Integer.MAX_VALUE){
            return -1;
        }
        else{
            return dp[amount];
        }
    }
}
