package com.pepcoding;

import java.util.Scanner;

public class BenjaminBulb_Optimised {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=(int)Math.sqrt(n);
        for(int i=1;i<=temp;i++){
            System.out.println(i*i);
        }
    }
}
