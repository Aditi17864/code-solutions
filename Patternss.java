import java.util.Scanner;

class Pattern {
    /*void printPattern(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }*/
   void printPattern2(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();

    }
   }
   void printPattern3(int n){
    for(int i=0;i<n;i--){
        for(int j=0;j<=i;j++){
            System.out.println("* ");
        }
        System.out.println();
    }
   }

   void printPattern4(int n){
    for(int i=0;i<n;i++){

        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        for(int j=0;j< 2 * n - (2 * i + 1);j++){
            System.out.print("*");
        }
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        System.out.println();
    }
   }

}

public class Patternss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        Pattern p = new Pattern();
        p.printPattern4(n);

        sc.close();
    }
}