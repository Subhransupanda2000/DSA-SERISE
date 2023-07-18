import java.util.Scanner;

public class Anybasesubstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int b = sc.nextInt();
        int val = anyBaseSubstraction(n1, n2, b);
        System.out.println(val);
    }

    public static int anyBaseSubstraction(int n1, int n2, int b) {
        int carry = 0;
        int pow = 1;
        int returnvalue = 0;

        while (n2 > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int d = 0;

            d2 = d2 + carry;
            if (d2 < d1) {
                carry = -1;
                d = d2 + b - d1; // Use actual base value instead of 8
            } else {
                carry = 0;
                d = d2 - d1;
            }

            returnvalue += d * pow;
            pow = pow * 10;
        }

        return returnvalue;
    }
}
