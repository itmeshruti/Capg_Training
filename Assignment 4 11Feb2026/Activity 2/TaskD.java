import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayUsingStack {

    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // Push all elements into stack
        for (int num : arr) {
            stack.push(num);
        }

        // Pop elements back into array
        int i = 0;
        while (!stack.isEmpty()) {
            arr[i++] = stack.pop();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);

        System.out.println("Reversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
