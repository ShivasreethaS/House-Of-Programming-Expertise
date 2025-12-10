import java.util.*;
class noIn2Power{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sh=0;
        while(1<<sh <= n) sh++;
        for(int p=sh-1; p>=0; p--){
            if((n & (1<<p)) != 0)//(((n>>p)&1)==1)
                 {
                System.out.println(1<<p);
            }
        }
    }
}
