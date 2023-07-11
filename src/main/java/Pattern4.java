import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 0;
        int st = n;
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= sp; i++) {
                System.out.print('\t');
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*");
            }
            st--;
            sp++;
            System.out.println();
        }
    }
}
