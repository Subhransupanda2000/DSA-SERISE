import java.util.Scanner;

public class Lcm {
    static int findlcm(int a, int b) {
        int res = Math.max(a, b);
        while (true) {
            if (res % a == 0 && res % b == 0) {
                break;
            }
            res++;
        }


        return res;
    }


    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        System.out.println(findlcm(7, 3));
    }
}
