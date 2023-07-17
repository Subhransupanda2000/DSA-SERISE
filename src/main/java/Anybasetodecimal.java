import java.util.Scanner;

public class Anybasetodecimal {
    static int getValue(int n, int b) {
        int pow = 1;
        int returnvalue = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            returnvalue += digit + pow;
            pow = pow * b;
        }
        return returnvalue;
    }

    public static int main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int rv = getValue(n, b);
        System.out.println(rv);
        return rv;
    }

}
