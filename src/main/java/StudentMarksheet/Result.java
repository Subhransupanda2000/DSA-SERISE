package StudentMarksheet;

import java.util.*;

public class Result {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks > 90) {
            System.out.println("Exellent");
        } else if (marks < 90 && marks > 80) {
            System.out.println("good");
        } else if (marks < 80 && marks > 70) {
            System.out.println("fair");
        } else if (marks < 70 && marks > 60) {
            System.out.println("meets expection");
        } else if (marks < 60) {
            System.out.println("BelowPar");
        }

    }
}
