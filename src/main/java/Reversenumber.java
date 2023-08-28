import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int Digit = n % 10;
            n = n / 10;
            System.out.println(Digit);
        }
    }
}
