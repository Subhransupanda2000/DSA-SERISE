import java.util.Scanner;

public class Anybaseaddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int b = sc.nextInt();
        int val = anyBaseToAddition(b, n1, n2);
        System.out.println(val);
    }

    static int anyBaseToAddition(int b, int n1, int n2) {
        int carry = 0;
        int returnvalue = 0;
        int p = 1;

        while (n1 > 0 || n2 > 0 || carry > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int d = d1 + d2 + carry;

            carry = d / b;
            d = d % b;
            returnvalue += d * p;
            p = p * 10;
        }
        return returnvalue;
    }
}
