package fibonaccinumber;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        int a=0,b=1,c,i;
        System.out.println("Enter term");
        Scanner r =new Scanner(System.in);
        int term= r.nextInt();
        for (i=1;i<=term;i++)
        {
            System.out.println(a+" ");
           c=a+b;
           a=b;
           b=c;
        }

    }
}
