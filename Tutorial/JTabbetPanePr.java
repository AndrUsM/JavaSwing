import javax.swing.*;
import java.awt.*;

public class JTabbetPanePr {
    JFrame frame;
    public JTabbetPanePr(){
        JFrame frame = new JFrame("Scroll");
        int height= Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int h = 400, w = 400;
        JTextArea textArea = new JTextArea(200,200);
        JPanel p1 = new JPanel();
        p1.add(textArea);
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(50,50,200,200);
        tabbedPane.add("main", p1);
        tabbedPane.add("visit", p2);
        tabbedPane.add("help", p3);
        frame.add(tabbedPane);frame.add(textArea);
        frame.setBounds(width/2 - w/2, height/2 - h/2, w, h);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JTabbetPanePr();
            }
        });
    }
}
