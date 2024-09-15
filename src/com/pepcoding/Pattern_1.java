package com.pepcoding;
import java.util.*;
/*
input - n
eg : 5
print 5 rows star
*
*   *
*   *   *
*   *   *   *
*   *   *   *   *

 */

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println("\n");

        }

    }
}
