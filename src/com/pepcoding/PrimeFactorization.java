package com.pepcoding;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        for(int i=1;i<=temp;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                while(n%i==0){
                    System.out.println(i);
                        n=n/i;

                }
            }
        }
    }
}
