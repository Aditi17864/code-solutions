import java.util.Scanner;

class Empl {
    // Data Members
    int Emp_No;
    String Name;
    double Basic, DA, TA, HRA, PF, Gross;

    // Method to accept Employee details
    void get() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Number: ");
        Emp_No = sc.nextInt();

        sc.nextLine(); // to clear buffer

        System.out.print("Enter Employee Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        Basic = sc.nextDouble();
    }

    // Method to calculate salary components and Gross salary
    void calcu() {

        if (Basic >= 20000) {
            DA = Basic * 0.35;
            TA = Basic * 0.12;
            HRA = Basic * 0.10;
            PF = Basic * 0.08;
        }
        else if (Basic >= 10000 && Basic < 20000) {
            DA = Basic * 0.45;
            TA = Basic * 0.10;
            HRA = Basic * 0.12;
            PF = Basic * 0.075;
        }
        else { // Basic < 10000
            DA = Basic * 0.40;
            TA = Basic * 0.08;
            HRA = Basic * 0.14;
            PF = Basic * 0.07;
        }

        Gross = (Basic + DA + TA + HRA) - PF;
    }

    // Method to display output
    void display() {
        System.out.println("\nEMPLOYEE No.\tNAME\t\tGROSS SALARY\tPF");
        System.out.println(Emp_No + "\t\t" + Name + "\t\t" + Gross + "\t" + PF);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Empl e = new Empl(); // Creating object
        e.get();             // Input
        e.calcu();           // Calculate salary
        e.display();         // Print Output
    }
}
