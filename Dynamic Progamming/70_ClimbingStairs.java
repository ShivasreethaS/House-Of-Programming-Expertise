class Solution {
    public int climbStairs(int n) {
        int[] dp= new int[n];
        if(n==0 || n==1)
         return 1;
        dp[0]=1;//one step
        dp[1]=2;//two steps
        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }
}
