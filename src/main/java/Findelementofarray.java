import java.util.Scanner;

public class Findelementofarray {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int digit = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == digit) {
                index = i;

                break;
            }
        }
        if (index != -1) {
            System.out.println("Element " + digit + " found at index: " + index);
        } else {
            System.out.println("Element " + digit + " not found in the array.");
        }

    }


}
