public class Navin {

    void printPattern(int n) {
        for (int i = n; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        

        int n = 5; // or take input
        Navin obj = new Navin();
        obj.printPattern(n);
    }
}