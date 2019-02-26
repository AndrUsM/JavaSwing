import javax.swing.*;
import java.awt.*;

public class PasswordField {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Password");
        int height= Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        frame.setBounds(height/2 - 150, width/ 2 - 150,300,300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPasswordField passwordField = new JPasswordField();
        JLabel label = new JLabel("Password");
        label.setBounds(20,100, 80,30);
        passwordField.setBounds(100,100,150,30);
        frame.add(label);frame.add(passwordField);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
