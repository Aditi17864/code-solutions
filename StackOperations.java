import java.util.ArrayList;  // Import ArrayList to implement stack functionality
import java.util.Scanner;    // Import Scanner for user input

/**
 * StackOperations class implements a simple stack data structure
 * with push, pop, and display operations using ArrayList
 */
public class StackOperations {
    private static ArrayList<String> stack = new ArrayList<>();  // ArrayList to store stack elements
    private static final int MAX_SIZE = 10;  // Maximum capacity of the stack (constant value)
    private static Scanner sc = new Scanner(System.in);  // Single Scanner object for all input operations
    
    /**
     * push() method adds an element to the top of the stack
     * Checks for stack overflow before adding
     */
    public static void push() {
        // Check if stack has reached maximum capacity
        if (stack.size() >= MAX_SIZE) {
            System.out.println("Stack Overflow! Cannot push more elements.");
            return;  // Exit method if stack is full
        }
        // Prompt user to enter an element
        System.out.print("Enter element to push: ");
        // Read input from user and remove leading/trailing spaces with trim()
        String element = sc.nextLine().trim();
        
        // Validate that the element is not empty
        if (!element.isEmpty()) {
            // Add element to the end of ArrayList (represents top of stack)
            stack.add(element);
            System.out.println("✓ '" + element + "' pushed successfully!");
        } else {
            // Show error message if user enters empty input
            System.out.println("Invalid input! Element cannot be empty.");
        }
    }
    
    /**
     * pop() method removes and returns the top element from the stack
     * Checks for stack underflow before removing
     */
    public static void pop() {
        // Check if stack is empty to prevent underflow
        if (stack.isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
            return;  // Exit method if stack is empty
        }
        // Remove element from last index (top of stack) and display it
        System.out.println("✓ Popped: " + stack.remove(stack.size() - 1));
    }
    
    /**
     * display() method shows all elements in the stack from top to bottom
     */
    public static void display() {
        // Check if stack is empty
        if (stack.isEmpty()) {
            System.out.println("Stack is empty!");
            return;  // Exit method if nothing to display
        }
        // Display header message
        System.out.println("\nStack Contents (Top → Bottom):");
        // Loop from last index (top) to first index (bottom) for correct order
        for (int i = stack.size() - 1; i >= 0; i--) {
            // Print each element with its position number
            System.out.println("  [" + (i + 1) + "] " + stack.get(i));
        }
        System.out.println();
    }
    
    /**
     * main() method - Entry point of the program
     * Displays menu and handles user input in an infinite loop
     */
    public static void main(String[] args) {
        // Infinite loop to keep program running until user chooses to exit
        while (true) {
            // Display menu with box drawing characters for better UI
            System.out.println("\n╔════════════════════╗");
            System.out.println("║  STACK OPERATIONS  ║");
            System.out.println("╠════════════════════╣");
            System.out.println("║ 1. PUSH            ║");
            System.out.println("║ 2. POP             ║");
            System.out.println("║ 3. DISPLAY         ║");
            System.out.println("║ 4. EXIT            ║");
            System.out.println("╚════════════════════╝");
            System.out.print("Enter choice (1-4): ");
            
            // Read user input and remove extra spaces
            String choice = sc.nextLine().trim();
            
            // Use switch statement to handle different menu options
            switch (choice) {
                case "1" -> push();              // Call push method if choice is 1
                case "2" -> pop();               // Call pop method if choice is 2
                case "3" -> display();           // Call display method if choice is 3
                case "4" -> {                    // Exit option if choice is 4
                    System.out.println("Goodbye!");
                    sc.close();                  // Close Scanner to free up resources
                    return;                      // Exit the main method and terminate program
                }
                default -> System.out.println("Invalid choice! Please enter 1-4.");  // Handle invalid input
            }
            
            // Display current stack size after each operation
            System.out.println("Size: " + stack.size() + "/" + MAX_SIZE);
        }
    }
}