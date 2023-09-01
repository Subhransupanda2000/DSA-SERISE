import java.util.Scanner;
import java.util.Stack;

public class DuplicateBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> str = new Stack<>();
        String exp = sc.nextLine();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == ')') {
                if (!str.isEmpty() && str.peek() == '(') {
                    System.out.println("true");
                    return;
                } else {
                    while (!str.isEmpty() && str.peek() != '(') {
                        str.pop();
                    }
                    if (!str.isEmpty()) {
                        str.pop();
                    }
                }
            } else {
                str.push(ch);
            }
        }
        System.out.println("false");
    }
}
