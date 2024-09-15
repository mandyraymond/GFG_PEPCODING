package com.practice;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=1;i<=t;i++){
            int n=sc.nextInt();
            int count=0;
            for(int j=2;j*j<=n;j++){
                if(n%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(n+" is a Prime Number ");
            }
            else{
                System.out.println(n+" is a NOT Prime Number ");
            }
        }
    }
}
