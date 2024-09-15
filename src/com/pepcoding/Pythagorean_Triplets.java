package com.pepcoding;

import javafx.geometry.HPos;

import java.util.Scanner;

public class Pythagorean_Triplets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int P,B,H;
        if(a>b && a>c){
            H=a;
            P=b;
            B=c;
        }
        else if(b>a && b>c){
            H=b;
            P=a;
            B=c;
        }
        else{
            H=c;
            P=a;
            B=b;
        }
        boolean Flag;
        if((P*P)+(B*B)==(H*H)){
            Flag=true;
            System.out.println(Flag);
        }
        else{
            Flag=false;
            System.out.println(Flag);
        }
    }
}
