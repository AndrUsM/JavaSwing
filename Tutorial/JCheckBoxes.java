import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCheckBoxes{
    public JCheckBoxes(){
        JFrame frame = new JFrame("Check boxes");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        frame.setBounds(width/2 - 250, height/2 - 250, 500,300);
        JCheckBox ch1 = new JCheckBox("C++");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);
        JCheckBox ch2 = new JCheckBox("Java");
        ch1.setBounds(150,100, 100,50);
        ch2.setBounds(150,150, 100,50);
        frame.add(ch1);frame.add(ch2);
        ch1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                label.setText("First: " + (itemEvent.getStateChange() == 1 ?"checked": "uncheked"));
            }
        });
        ch2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                label.setText("Second: " + (itemEvent.getStateChange() == 1 ?"checked": "uncheked"));
            }
        });
        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new JCheckBoxes();
    }
}
