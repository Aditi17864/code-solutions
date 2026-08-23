import java.util.Scanner;

// Base class: Academic marks
class Student {
    protected int academicMarks;

    public void getAcademicMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Academic Marks: ");
        academicMarks = sc.nextInt();
    }

    public void showAcademicMarks() {
        System.out.println("Academic Marks = " + academicMarks);
    }
}

// Interface: Sports grace marks
interface Sports {
    int GRACE_MARKS = 10;  // fixed for every student

    void showGraceMarks();
}

// Derived class: Total Marks = Academics + Grace
class Result extends Student implements Sports {
    private int total;

    @Override
    public void showGraceMarks() {
        System.out.println("Grace Marks (Sports) = " + GRACE_MARKS);
    }

    public void calculateTotal() {
        total = academicMarks + GRACE_MARKS;
        System.out.println("Total Marks = " + total);
    }
}

// Driver class
public class UniversityApp {
    public static void main(String[] args) {
        // Using base class reference
        Student stu = new Result();
        stu.getAcademicMarks();
        stu.showAcademicMarks();

        // Using interface reference
        Sports sp = (Sports) stu;
        sp.showGraceMarks();

        // Using derived class reference
        Result res = (Result) stu;
        res.calculateTotal();
    }
}
