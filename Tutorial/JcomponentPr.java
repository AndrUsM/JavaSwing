import javax.swing.*;
import java.awt.*;

class Jcomponent extends JComponent {
    public void paint(Graphics graphics){
        graphics.setColor(Color.GREEN);
        graphics.fillRect(30, 30, 100, 100);
    }
}
public class JcomponentPr{
    public static void main(String[] args) {
        Jcomponent jcomponent = new Jcomponent();
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("JComponent example");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(jcomponent);
        frame.setVisible(true);
    }
}