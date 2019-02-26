import javax.swing.*;
import java.awt.*;

public class Lists {
    JFrame frame = new JFrame("Lists");
    public Lists(){
        int height= Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int h = 400, w = 500;
        String country[]={"India","Aus","U.S.A","England","Newzealand"};
        JComboBox cb = new JComboBox(country);
        cb.setBounds(100, 100,90,20);
        frame.add(cb);
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
                new Lists();
            }
        });
    }
}
