package com.pepcoding;
import java.util.*;
public class FibonacciNumberTillN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
       /* System.out.print(a+", ");
       // System.out.print(b+", ");
        for(int i=1;i<=n;i++){
            int c=a+b;
            System.out.print(c+", ");
            a=b;
            b=c;

        }   */
        for(int i=0;i<n;i++){
            System.out.print(a+", ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
