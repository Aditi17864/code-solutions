import java.util.Scanner;

class Bank
{
    double principal;
    double n;
    double r;
    double amount;

    void createAccount()   // () missing in your code
    { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter time in years: ");
        n = sc.nextDouble();

        setRate();   // rate varies
        calculateAmount();
    }

    // Rate varies based on principal
    void setRate()
    {
        if(principal <= 10000)
            r = 5;
        else if(principal <= 50000)
            r = 7;
        else
            r = 10;

        System.out.println("Rate of Interest: " + r + "%");
    }

    void calculateAmount()
    {
        amount = principal + (principal * r * n) / 100;

        System.out.println("Final Amount: " + amount);
    }

    public static void main(String args[])
    {
        Bank b = new Bank();
        b.createAccount();
        b.setRate();
        b.calculateAmount();
    }
}
