public class post_pre {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        // Post-increment
        int postIncrement = a++;
        System.out.println("Post-increment:");
        System.out.println("Value after post-increment: " + postIncrement); // Outputs 5
        System.out.println("Value of a after post-increment operation: " + a); // Outputs 6

        // Pre-increment
        int preIncrement = ++b;
        System.out.println("Pre-increment:");
        System.out.println("Value after pre-increment: " + preIncrement); // Outputs 6
        System.out.println("Value of b after pre-increment operation: " + b); // Outputs 6
    }
}
