import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class InfixEvaluation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Stack<Integer> opnds = new Stack<>();
        Stack<Character> optors = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                optors.push(ch);
            } else if (Character.isDigit(ch)) {
                opnds.push(ch - '0');
            } else if (ch == ')') {
                while (optors.peek() != '(') {
                    char optor = optors.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();
                    if (v2 == 0 && optor == '/') {
                        throw new ArithmeticException("Division by zero");
                    }
                    int opv = operation(v1, v2, optor);
                    opnds.push(opv);
                }
                optors.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!optors.isEmpty() && optors.peek() != '(' && Precedence(ch) <= Precedence(optors.peek())) {
                    char optor = optors.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();
                    if (v2 == 0 && optor == '/') {
                        throw new ArithmeticException("Division by zero");
                    }
                    int opv = operation(v1, v2, optor);
                    opnds.push(opv);
                }
                optors.push(ch);
            }
        }
        while (!optors.isEmpty()) {
            char optor = optors.pop();
            int v2 = opnds.pop();
            int v1 = opnds.pop();
            if (v2 == 0 && optor == '/') {
                throw new ArithmeticException("Division by zero");
            }
            int opv = operation(v1, v2, optor);
            opnds.push(opv);
        }
        System.out.println(opnds.peek());
    }

    public static int Precedence(char optor) {
        if (optor == '+' || optor == '-') {
            return 1;
        } else if (optor == '*' || optor == '/') {
            return 2;
        } else {
            return 0;
        }
    }

    public static int operation(int v1, int v2, char optor) {
        if (optor == '+') {
            return v1 + v2;
        } else if (optor == '-') {
            return v1 - v2;
        } else if (optor == '*') {
            return v1 * v2;
        } else if (optor == '/') {
            if (v2 == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return v1 / v2;
        } else {
            throw new IllegalArgumentException("Invalid operator: " + optor);
        }
    }
}
