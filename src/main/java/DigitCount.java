import java.util.Scanner;

public class DigitCount {
    public static void main (String [] args)
    {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit=0;
        while (n!=0)
        {
            n=n/10;
            digit++;
        }
        System.out.println(digit);

    }
}
