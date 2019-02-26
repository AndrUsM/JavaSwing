import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Massage extends WindowAdapter {
    JFrame frame;
    public Massage(){
        frame = new JFrame("Massage");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        int height= Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int h = 400, w = 500;
        JLabel label = new JLabel("Try to close window>");
        label.setBounds(10,10, 200,40);

        frame.setLayout(null);
        frame.setBounds(width/2 - w/2, height/2 - h/2, w, h);
        frame.addWindowListener(this);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true);
    }
    public void windowClosing(WindowEvent event){
        int a = JOptionPane.showConfirmDialog(frame, "Are you sure?");
        if(a == JOptionPane.YES_OPTION){
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Massage();
            }
        });
    }
}
