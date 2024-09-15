package com.pepcoding;

import java.util.Scanner;

public class LCM_HCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        //HCF
        for(int i=num1;i>=1;i--){
            if((num1 % i == 0) && (num2 % i == 0)){
                System.out.println(i);
                break;
            }
        }
    }
}
