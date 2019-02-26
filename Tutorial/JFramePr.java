import javax.swing.*;
import java.awt.*;

public class JFramePr extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame example");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("JFramme by example");
        JButton button = new JButton("Button");
        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setSize(200,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
