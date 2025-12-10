//in 2D DP
import java.util.*;
public class fuelPrice {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int c=5;//sc.nextInt();//cost total nos
    int amt=10;//sc.nextInt();//total money i have
    int[] cost={1,1,4,5,9};//new int[c];
    int[] fuel={1,2,2,5,15};//new int[c];
    // for(int i=0;i<c;i++){
    //     cost[i]=sc.nextInt();
    //     fuel[i]=sc.nextInt();
    // }
    int[][] dp=new int[c+1][amt+1];
    for(int i=1;i<=c;i++){
        for(int j=1;j<=amt;j++){
            if(j>=cost[i-1]){
                dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-cost[i-1]]+fuel[i-1]);
            }
            else{
                dp[i][j]=dp[i-1][j];}
        }
    }
    System.out.println(dp[c][amt]);
    }
}
//in 1D DP
import java.util.*;
public class fuelPrice1 {
    public static void main(String[] args) {
    int[] cost={1,1,4,5,9};
    int[] fuel={1,2,2,5,15};
    int amt=10;
    int n=cost.length;
    int[] dp=new int[amt+1];
    for(int i=0;i<amt;i++){
        for(int j=amt;j>=cost[i];j--){
            dp[j]=Math.max(dp[j],dp[j-cost[i]]+fuel[i]);
        }
    }
    System.out.print(dp[amt]);
    }
}

