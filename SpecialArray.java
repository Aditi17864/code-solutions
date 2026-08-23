
import java.util.Scanner;

class SpecialArray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[3][3];
        int i, j;
        int evenSum = 0, oddSum = 0;
        // Accept elements into array
        System.out.println("Enter elements of 3x3 array:");
        for (i = 0; i < 3; i++) { //Array Input
            for (j = 0; j < 3; j++) { //Outer Loop for Rows
                A[i][j] = sc.nextInt();
                if (A[i][j] % 2 == 0) { // or odd Check
                    evenSum = evenSum + A[i][j]; 
                }else {
                    oddSum = oddSum + A[i][j];
                }
            }
        }
        // Display sums
        System.out.println("Sum of even elements = " + evenSum);
        System.out.println("Sum of odd elements = " + oddSum);
        // Check special array condition
        if (evenSum == oddSum) {
            System.out.println("Special Array"); 
        }else {
            System.out.println("Not a Special Array");
        }
    }
}
