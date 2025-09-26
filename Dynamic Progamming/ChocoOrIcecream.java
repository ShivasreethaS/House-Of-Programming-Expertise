import java.util.*;
public class ChocoOrIcecream{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp=new int[n];
        if(n==1){
            System.out.print("2");
        }
        if(n==2){
            System.out.print("3");
        }
        dp[0]=2;
        dp[1]=3;
        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.print(dp[n-1]);
    }
}
