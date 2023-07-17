import java.util.Scanner;

public class Anybasetoanybase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int val = getValue(n, b1, b2);
        System.out.println(val);
    }

    public static int getValue(int n, int b1, int b2) {
        int dec = anyBaseToDecimal(n, b1);
        int bas = decimalToAnyBase(dec, b2);
        return bas;
    }

    public static int decimalToAnyBase(int dec, int b2) {
        int pow = 1;
        int returnvalu = 0;
        while (dec > 0) {
            int digit = dec % b2;
            dec = dec / b2;
            returnvalu += digit * pow;
            pow = pow * 10;
        }
        return returnvalu;
    }

    static int anyBaseToDecimal(int n, int b1) {
        int pow = 1;
        int returnvalue = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            returnvalue += digit * pow;
            pow = pow * b1;
        }
        return returnvalue;
    }
}
