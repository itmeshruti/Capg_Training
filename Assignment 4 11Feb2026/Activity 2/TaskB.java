import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {

    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } 
            else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression: ");
        String input = sc.nextLine();

        if (isBalanced(input)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }

        sc.close();
    }
}
