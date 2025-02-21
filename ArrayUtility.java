import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
        
     public static void displayArray(int[] arr) {
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static int[][] input2DArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] arr = new int[rows][cols];
    
        System.out.println("Enter " + (rows * cols) + " elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }
    

      
    
}
