package primenumber;

public class NPrimeNumber {

    public static void main(String[] args) {
        int tempo = 0;

        for (int no = 1; no <= 100; no++) {
            for (int i = 2; i <= no - 1; i++) {
                if (no % i == 0)
                    tempo = tempo + 1;
            }

            if (tempo == 0) {
                System.out.println(no + " is prime");
            } else {
                tempo = 0;
            }
        }
    }

}
