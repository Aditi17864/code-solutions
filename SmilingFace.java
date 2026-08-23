import java.awt.*;
import java.applet.*;

public class SmilingFace extends Applet {

    public void paint(Graphics g) {
        
        // Outer square border
        g.drawRect(50, 50, 200, 200);

        // Face boundary (circle)
        g.drawOval(70, 70, 160, 160);

        // Eyes
        g.fillOval(110, 120, 15, 20);  // left eye
        g.fillOval(165, 120, 15, 20);  // right eye

        // Smile (arc)
        g.drawArc(110, 150, 80, 40, 180, 180);
    }
}
