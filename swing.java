import javax.swing.*;   // Swing package

class WelcomeFrame {
    public static void main(String[] args) {
        // Create a new frame (window)
        JFrame frame = new JFrame("Welcome Window");

        // Create a label with text
        JLabel label = new JLabel("Welcome to RAIT", SwingConstants.CENTER);

        // Set font size and style
        label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 24));

        // Add label to the frame
        frame.add(label);

        // Set frame size (width x height)
        frame.setSize(400, 200);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
