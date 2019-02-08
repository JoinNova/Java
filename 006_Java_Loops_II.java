import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int j = 0;
            int arg = 0;
            int sum = 0;
            
            while(j < n){
                if(j == 0){
                    arg = 1;
                    sum = a + (arg*b) + sum;
                    }else{
                    arg = arg * 2;
                    sum = (arg * b) + sum;
                }
                System.out.print (sum + " ");
                j += 1;
            }
        System.out.println();
        }
        in.close();
    }
}
