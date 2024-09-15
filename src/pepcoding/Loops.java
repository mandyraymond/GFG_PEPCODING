package pepcoding;
import java.util.*;
public class Loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int n=sc.nextInt();
        int n=Integer.parseInt(sc.nextLine());
        String name=sc.nextLine();
        System.out.println("Dear "+name+" here is your counting");
        for(int i=0;i<=n;i++){
            System.out.println(i);
        }

       /* for(;;){
            System.out.println("Hi");
        }
       /* int i=10;
        while(i>=1){
            System.out.println(i);
            i--;
        }
        System.out.println(i);   */

     /*   int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        System.out.println(i);   */
    }
}
