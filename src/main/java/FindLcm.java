import java.util.Scanner;

public class FindLcm {
    static int findlcm(int n1, int n2) {
        int res = Math.max(n1, n2);
        while (true) {

            if (res % n1 == 0 && res % n2 == 0) {
                break;
            }
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Enter two number");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(findlcm(n1, n2));

    }
}
