import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        while (n > 1) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }
            i++;
        }
    }
}
