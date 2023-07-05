import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int min = 0;
        {
            if (a < b) {
                min = a;
            } else {
                min = b;
            }
            for (int i = min; b >= i; i--) {
                if (a % i == 0 && b % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}

