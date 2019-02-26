import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordFiledAction {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Register Form");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        int width =(Toolkit.getDefaultToolkit().getScreenSize().width);
        int sizeX = 300;
        int sizeY = 300;
        frame.setBounds(width/2 - 150, height/2 - 150, sizeX, sizeY);
        frame.setResizable(false);

        final JLabel label = new JLabel();
        label.setBounds(20,150, 200,50);
        final JPasswordField value = new JPasswordField();
        value.setBounds(100,75,100,30);

        JLabel l1 = new JLabel("User name: ");
        JLabel l2 = new JLabel("Password: ");
        l1.setBounds(20,20, 80,30);
        l2.setBounds(20,75, 80,30);

        JButton login = new JButton("Login");
        login.setBounds(100,120, 100,30);

        final JTextField text = new JTextField();
        text.setBounds(100,20, 100,30);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String data = "Username " + text.getText();
                data += ", Password: "
                        + new String(value.getPassword());
                label.setText(data);
            }
        });

        frame.add(l1);frame.add(l2);frame.add(label);frame.add(text);frame.add(value);frame.add(text);frame.add(login);
        frame.setLayout(null);
        frame.pack();
        frame.setVisible(true);
    }
}
