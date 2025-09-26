// "static void main" must be defined in a public class.
public class fibonacci {    
    static int dpfib(int n,int dp[]){
        if(n<=1)
            return dp[n];
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=dpfib(n-1,dp)+dpfib(n-2,dp);
        return dp[n];
    }
    // static int fib(int n){
    //     if(n<=1)
    //         return n;
    //     return fib(n-1)+fib(n-2);
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        System.out.print(dpfib(n,dp)+ " ");
    }
}
