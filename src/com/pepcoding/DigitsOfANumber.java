package com.pepcoding;
import java.util.Scanner;
public class DigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int temp=n;
        int c=0;
        while(temp!=0){
            temp=temp/10;
            c++;
        }
        System.out.println("c="+c);
        //123456
        while(c!=0){
            int result=(int)(n/Math.pow(10,(c-1)));
            System.out.println(result);
            n=(int)(n%Math.pow(10,(c-1)));
            c--;
        }
    }
}
