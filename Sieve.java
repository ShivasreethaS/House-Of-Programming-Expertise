// "static void main" must be defined in a public class.
// Time complexity = O(n*log(log(n)))
import java.util.*;
public class Sieve{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[] b = new boolean[n+1];
        for(int i=2;i<=Math.sqrt(n);i++){ // sqrt=i*i<=n
            if(!b[i]){
                for(int j=i*i;j<=n;j=j+i){ // j<-- i*i to n means 2 already d  ivides 6 so for 3 go after 6
                    //if(j%i==0){
                        b[j]=true;
                    //}
                }
            }
        }
        for(int i=1;i<=n;i++){
            if(!b[i]){
                System.out.print(i+" ");
            }
        }
    }
}
