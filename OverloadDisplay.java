class OverloadDisplay
{
    // Method 1: display pattern using nested loop
    void display()
    {
        int i, j;
        for(i = 1; i <= 5; i++)//Outer Loop
        {
            for(j = 1; j <= i; j++)//Inner Loop
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Method 2: display square root of each digit
    void display(int n)
    {
        int digit;
        while(n > 0)
        {
            digit = n % 10;
            System.out.println(Math.sqrt(digit));
            n = n / 10;
        }
    }

    public static void main(String args[])
    {
        OverloadDisplay obj = new OverloadDisplay();

        // Calling display()
        obj.display();

        System.out.println();

        // Calling display(int n)
        obj.display(4329);
    }
}
