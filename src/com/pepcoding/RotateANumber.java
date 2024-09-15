package com.pepcoding;
import java.util.*;
public class RotateANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int temp=n;
        int c=0;
        while(temp>0){
            temp=temp/10;
            c++;
        }

        k = k % c;
         if(k<0){
             k=k+c;
         }


        int r1=n%(int)Math.pow(10,k);
        int r2=n/(int)Math.pow(10,k);
        int rotatedNumber=(r1*(int)Math.pow(10,c-k))+r2;
        System.out.println(rotatedNumber);
    }
}
