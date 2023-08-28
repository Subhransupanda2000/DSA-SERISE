import java.util.Scanner;

public class Fibonacci2 {
    public static void main (String [] args)
    {
        int a=0,b=1,c,terms;
        Scanner sc=new Scanner(System.in);
        terms=sc.nextInt();
        for (int i=0;i<=terms;i++)
        {
            System.out.println(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
