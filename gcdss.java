
import java.util.Scanner;

class GcdRecursive {

    static int gcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return gcd(b, a % b);
    }

}

public class gcdss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers jiska gcd chahiye: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("The gcd of the two numbers is:" +GcdRecursive.gcd(x, y));

    }
}
