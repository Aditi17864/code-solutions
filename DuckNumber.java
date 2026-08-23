import java.util.Scanner;

class DuckNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, temp, digit;
        boolean zeroFound = false;

        System.out.print("Enter a 3 digit number: ");
        n = sc.nextInt();

        // Check for 3 digit number
        if(n < 100 || n > 999)
        {
            System.out.println("Invalid");
        }
        else
        {
            temp = n;
            while(temp > 0)
            {
                digit = temp % 10;//Modulus Operator we get last digit
                if(digit == 0)
                {
                    zeroFound = true;
                    break;
                }
                temp = temp / 10;
            }
            if(zeroFound)
                System.out.println("Duck number");
            else
                System.out.println("Not a Duck number");
        }
    }
}
