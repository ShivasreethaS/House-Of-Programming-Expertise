//ip; rod len=4 nd cost of each meter cost[]={1,5,8,9} 
//op; max selling cost=10 {2metr rods is sold twice for 5 rupees}
import java.util.*;
class maxRodCost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] cost=new int[n];
        for(int i=0;i<n;i++){
            cost[i]=sc.nextInt();
        }
        int[] dp=new int[n+1];
        //no need to fill
        // for(int i=1;i<n;i++){
        //     dp[i]=Integer.MIN_VALUE;
        // }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n+1;j++){
                dp[j]=Math.max(dp[j],cost[i]+dp[j-i-1]);
            }
        }
        System.out.print(dp[n]);
    }
}
