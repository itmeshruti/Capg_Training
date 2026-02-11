import java.util.Scanner;
import java.util.Stack;

public class TaskD {

    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            // If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // If closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parentheses expression: ");
        String input = sc.nextLine();

        if (isBalanced(input)) {
            System.out.println("The expression is Balanced.");
        } else {
            System.out.println("The expression is Not Balanced.");
        }

        sc.close();
    }
}
