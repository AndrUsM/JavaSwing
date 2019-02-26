import javax.swing.*;
import java.awt.*;

public class JListPractice {
    public JListPractice(){
        JFrame frame = new JFrame("Lists");
        int height= Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int h = 300, w = 300;
        frame.setBounds(width/2 - w/2, height/2 - h/2, w, h);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        DefaultListModel <String> l1 = new DefaultListModel<>();
        l1.addElement("item1");
        l1.addElement("Item2");
        l1.addElement("Item3");
        l1.addElement("Item4");
        JList <String> list = new JList<>(l1);
        list.setBounds(100,100, 75,75);
        frame.add(list);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JListPractice();
            }
        });
    }
}
