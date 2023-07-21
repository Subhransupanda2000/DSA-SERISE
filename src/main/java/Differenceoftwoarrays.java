import java.util.Scanner;

public class Differenceoftwoarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        for (int j = 0; j < arr2.length; j++) { // Changed from arr1 to arr2
            arr2[j] = sc.nextInt(); // Changed from arr1 to arr2
        }
        int diff[] = new int[n2];
        int c = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;
        while (k >= 0) {
            int d = 0;
            int a1v = i >= 0 ? arr1[i] : 0;
            if (arr2[j] + c >= a1v) {
                d = arr2[j] + c - a1v;
                c = 0;
            } else {
                d = arr2[j] + 10 + c - a1v;
                c = -1;
            }
            diff[k] = d;
            i--;
            j--;
            k--;
        }
        int idx = 0;
        while (idx < diff.length) {
            if (diff[idx] != 0) {
                break;
            }
            idx++;
        }
        while (idx < diff.length) {
            System.out.println(diff[idx]);
            idx++;
        }
    }
}
