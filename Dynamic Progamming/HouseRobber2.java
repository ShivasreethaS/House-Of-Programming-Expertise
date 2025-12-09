
import java.util.*;
class HouseRobber2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n==0) System.out.print(0);
        if(n==1) System.out.print(arr[0]);
        if(n==2) System.out.print(Math.max(arr[0],arr[1]));
        int c1= rob(arr,0,n-2);
        int c2= rob(arr,1,n-1);
        System.out.print(Math.max(c1,c2));
    }
    public static int rob(int[] arr,int start,int end){
        int p1=0,p2=0;
        for(int i=start;i<=end;i++){
            int temp=Math.max(p1,arr[i]+p2);
            p2=p1;
            p1=temp;
        }
        return p1;
    }
}
