package com.pepcoding;

import java.util.Scanner;

public class LcmHcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        // LCM
        for(int i=2;;i++){
            if((i%num1==0) && (i%num2==0)){
                System.out.println(i+" LCM");
                break;

            }
        }
        // HCF

        while(num1>0) {   //
           int  r = num2 % num1;
            num2 = num1;
            num1 = r;
        }
        System.out.println(num2+" HCF");
        //GCD



    }
}
