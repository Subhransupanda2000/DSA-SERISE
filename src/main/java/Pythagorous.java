import java.util.Scanner;

public class Pythagorous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        } else if (c > max) {
            max = c;

        }
        if (max == a) {
            boolean flag = a * a == (b * b) + (c * c);
            System.out.println(flag);
        }
        if (max == b) {
            boolean flag = b * b == (a * a) + (c * c);
            System.out.println(flag);
        }
        if (max == c) {
            boolean flag = c * c == (b * b) + (a * a);
            System.out.println(flag);
        }


    }
}
