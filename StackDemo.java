import java.util.Scanner;
class StackDemoClass {
    int MAX = 5;
    int[] stack = new int[MAX];
    int top = -1;

    void push(int val) {
        if (top == MAX - 1) {
            System.out.println("Stack Overflow");
        } else 
        {
            stack[++top] = val;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Deleted: " + stack[top--]);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack Empty");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackDemoClass s = new StackDemoClass();

        int choice;

        do {
            System.out.println("\n1. Push\n2. Pop\n3. Display\n4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    s.push(sc.nextInt());
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}