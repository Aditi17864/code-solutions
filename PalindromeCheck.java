import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a character sequence: ");
        String input = sc.nextLine();

        // Use StringBuffer to reverse the string
        StringBuffer sb = new StringBuffer(input);
        String reversed = sb.reverse().toString();

        // Check palindrome condition
        if (input.equals(reversed)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        sc.close();
    }
}
