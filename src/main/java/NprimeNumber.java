import java.util.Scanner;

public class NprimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter two number");
        int i, j, count = 0;

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (i = 1; i <= 100; i++) {
            for (j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(i);
            } else {
                count = 0;
            }

        }


    }
}
