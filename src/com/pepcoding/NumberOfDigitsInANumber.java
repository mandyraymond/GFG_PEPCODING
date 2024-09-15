package com.pepcoding;
import java.util.*;
public class NumberOfDigitsInANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // 567523
        int c=0;
        while(n!=0){
            n=n/10;
            c++;
        }
        System.out.println(c);
    }
}
