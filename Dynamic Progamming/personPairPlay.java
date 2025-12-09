import java.util.*;
class personPairPlay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+(i-1)*dp[i-2];
        }
        System.out.print(dp[n]);
    }
}
//if odd return 1 and cal ways only for even persons
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2!=0){
            System.out.print(1);
        }else{
        long[] dp=new long[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+(i-1)*dp[i-2];
        }
        System.out.print(dp[n]);
    }
    }
}
