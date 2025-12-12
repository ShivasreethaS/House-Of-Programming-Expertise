import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class lineEveOdd {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int odd=1;
        int even=2;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(i%2!=0){
                    System.out.print(odd+" ");
                    odd+=2;
            }
                else{
                    System.out.print(even+" ");
                    even+=2;
                }
        }System.out.println();
    }
    }
}
