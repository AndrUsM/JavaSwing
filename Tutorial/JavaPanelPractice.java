import javax.swing.*;
import java.awt.*;

public class JavaPanelPractice {
    public JavaPanelPractice(){
        JFrame frame = new JFrame("Scroll");
        int height= Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int h = 400, w = 400;
        frame.setBounds(width/2 - w/2, height/2 - h/2, w, h);
        frame.setLayout(null);
        JPanel panel = new JPanel();
        panel.setBounds(40,80,200,200);
        panel.setBackground(Color.GRAY);
        JButton button1 = new JButton("Button 1");
        button1.setBounds(50,100,80,30);
        button1.setBackground(Color.yellow);
        JButton button2 = new JButton("Button 2");
        button2.setBounds(100,100,80,30);
        button2.setBackground(Color.GRAY);
        panel.add(button1);panel.add(button2);
        frame.add(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JavaPanelPractice();
            }
        });
    }
}
