import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrder extends JFrame implements ActionListener {
    JLabel label;
    JCheckBox ch1;
    JCheckBox ch2;
    JCheckBox ch3;
    JButton button;
    public FoodOrder(){
        label = new JLabel("Food ordering system");
        label.setBounds(50,50,300,20);
        ch1 = new JCheckBox("Pizza @ 100");
        ch1.setBounds(100,100,150,20);
        ch2 = new JCheckBox("Burger @ 30");
        ch2.setBounds(100,150,150,20);
        ch3=new JCheckBox("Tea @ 10");
        ch3.setBounds(100,200,150,20);

        button = new JButton("Order");
        button.setBounds(100,250,80,30);
        button.addActionListener(this);
        add(button);add(ch1);add(ch2);add(ch3);add(label);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        setBounds(width/2 -200, height/2 - 200, 400,400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent actionEvent) {
        double amount = 0;
        String msg = "";
        if (ch1.isSelected()) {
            amount+=100;
            msg = "Pizza: 100\n";
        }
        if (ch2.isSelected()) {
            amount +=30;
            msg = "Burger: 30\n";
        }
        if (ch3.isSelected()) {
            amount+=10;
            msg+="tea: 10\n";
        }
        msg += "---------------------\n";
        JOptionPane.showMessageDialog(this, msg + "Total: " + amount);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FoodOrder();
            }
        });
    }
}
