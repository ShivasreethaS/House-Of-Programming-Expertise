class Solution {
    public int Triangle(List<List<Integer>> triangle) {
        int t=triangle.size();
        int[] dp=new int[t];
        for(int i=0;i<t;i++){
            dp[i]=triangle.get(t-1).get(i);
        }
        for(int i=t-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                dp[j]=Math.min(dp[j],dp[j+1])+triangle.get(i).get(j);
            }
        }return dp[0];
    }
}
