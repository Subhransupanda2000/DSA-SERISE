import java.util.Scanner;

public class Decimaltoanybase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);

    }

    public static int getValueInBase(int n, int b) {
        int pow = 1;
        int returnvalu = 0;
        while (n > 0) {
            int digit = n % b;
            n = n / b;
            returnvalu += digit * pow;
            pow = pow * 10;

        }
        return returnvalu;
    }
}
