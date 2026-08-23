import java.util.Scanner;

class MatrixManipulator {
    private int[][] matrix;
    private int rows;
    private int cols;

    // Constructor
    public MatrixManipulator(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }

    // Method to read matrix from user
    public void readMatrix(Scanner sc) {
        System.out.println("Enter elements of matrix (" + rows + "x" + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    // Method to display matrix
    public void displayMatrix() {
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to flip matrix horizontally (mirror left ↔ right)
    public void flipHorizontal() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0, k = cols - 1; j < k; j++, k--) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }
        System.out.println("Matrix flipped horizontally!");
    }

    // Method to flip matrix vertically (mirror top ↔ bottom)
    public void flipVertical() {
        for (int i = 0, k = rows - 1; i < k; i++, k--) {
            for (int j = 0; j < cols; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[k][j];
                matrix[k][j] = temp;
            }
        }
        System.out.println("Matrix flipped vertically!");
    }
}

// Driver class
public class MatrixApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        MatrixManipulator matrix = new MatrixManipulator(rows, cols);

        matrix.readMatrix(sc);

        System.out.println("\nOriginal Matrix:");
        matrix.displayMatrix();

        matrix.flipHorizontal();
        matrix.displayMatrix();

        matrix.flipVertical();
        matrix.displayMatrix();

        sc.close();
    }
}
