package com.pepcoding;

import java.util.Scanner;

public class PrimeFactorizationOptimisedCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;

        for(int i=2;i*i<=temp;i++){
            //System.out.println("i-"+i + " n-"+n);
            while(n%i==0){
                n=n/i;
                System.out.println(i);
            }
            //System.out.println(n+ "=n  " +i +" = i");
        }
        //System.out.println(n+ "last");
        if(n!=1){
            System.out.println(n);
        }

    }
}
