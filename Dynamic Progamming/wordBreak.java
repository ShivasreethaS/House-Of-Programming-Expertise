
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n1=sc.nextInt();
        int n=s.length();
        String[] wordDict=new String[n];
        for(int i=0;i<n1;i++){
            wordDict[i]=sc.next();
        }
        boolean[] dp=new boolean[n+1];
        Set<String> words=new HashSet<>(Arrays.asList(wordDict));
        dp[0]=true;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(dp[j] && words.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        System.out.print(dp[n]);
    }
}
