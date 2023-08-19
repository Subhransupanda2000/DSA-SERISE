package primenumber;

import java.util.Scanner;

public class IsAPrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int high = s.nextInt();
        int low = s.nextInt();
        int tempo = 0;

        for (int no = low; no <= high; no++) {
            for (int i = 2; i <= no - 1; i++) {
                if (no % i == 0)
                    tempo = tempo + 1;
            }

            if (tempo == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}
