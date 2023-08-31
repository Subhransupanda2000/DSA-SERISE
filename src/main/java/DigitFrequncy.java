import java.util.Scanner;

public class DigitFrequncy {

    static int digitFrequency(int n, int d) {
        int returnvalue = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;

            if (digit == d) {
                returnvalue++;
            }

        }
        return returnvalue;
    }

    public static void main(String[] args) {
        System.out.println("enter a number ");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        int Frequency = digitFrequency(n, d);
        System.out.println(Frequency);
    }
}
