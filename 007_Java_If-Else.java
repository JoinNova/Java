import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();            
        String result = "";
        if (n%2>0 || ((n%2<1)&&(n<21))){
            result="Weird";
        }else{
            result="Not Weird";
        }
        System.out.println(result);
    }
}
