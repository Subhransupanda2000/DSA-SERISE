package numbercounts;

import java.util.Scanner;

public class NumberCounts {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int digit=0;
        while(n!=0)
        {
            n=n/10;
            digit++;
        }
        System.out.println(digit);
    }
}
