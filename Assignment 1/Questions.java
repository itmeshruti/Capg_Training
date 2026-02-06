package collections;
import java.util.Scanner;

class MatrixOperations {

    Scanner input = new Scanner(System.in);

    void transpose() {
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the matrix values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrix after transpose:");
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    void rotate2x2() {
        int[][] arr = new int[2][2];

        System.out.println("Enter elements for 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrix after rotation:");
        for (int j = 0; j < 2; j++) {
            for (int i = 1; i >= 0; i--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    void multiplyMatrix() {
        int[][] first = new int[3][2];
        int[][] second = new int[2][4];
        int[][] result = new int[3][4];

        System.out.println("Enter elements of first matrix (3x2):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                first[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix (2x4):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                second[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 2; k++) {
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }

        System.out.println("Multiplication result matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    void flipMatrix() {
        int[][] data = new int[4][3];

        System.out.println("Enter elements of 4x3 matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                data[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrix after flipping:");
        for (int i = 3; i >= 0; i--) {
            for (int j = 0; j < 3; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MatrixOperations obj = new MatrixOperations();

        while (true) {
            System.out.println("\n1. Find Transpose");
            System.out.println("2. Rotate 2x2 Matrix");
            System.out.println("3. Multiply Matrices");
            System.out.println("4. Flip Matrix Vertically");
            System.out.println("5. Exit Program");
            System.out.print("Select option: ");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    obj.transpose();
                    break;
                case 2:
                    obj.rotate2x2();
                    break;
                case 3:
                    obj.multiplyMatrix();
                    break;
                case 4:
                    obj.flipMatrix();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Please enter a valid option");
            }
        }
    }
}