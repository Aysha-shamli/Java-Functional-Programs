import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the array:");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns in the array:");
        int n = sc.nextInt();
        int[][] array = new int[m][n];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Array Elements: ");
                array[i][j] = scanner.nextInt();
            }
        }

        printArrayElement(array);
    }
    public static void printArrayElement(int[][] array) {
        System.out.println("2D array elements:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
