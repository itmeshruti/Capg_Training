import java.util.Scanner;

class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    // Constructor
    public Stack(int size) {
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    // Push operation
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        arr[++top] = value;
        System.out.println(value + " pushed into stack.");
    }

    // Pop operation
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Stack is empty.");
            return;
        }
        System.out.println(arr[top--] + " popped from stack.");
    }

    // Peek operation
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Top element is: " + arr[top]);
    }

    // Display stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

public class TaskC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        Stack stack = new Stack(size);

        while (true) {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
