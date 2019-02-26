import javax.swing.*;
import java.awt.*;

public class SpinerPr {
    public SpinerPr(){
        JFrame frame = new JFrame("Scroll");
        int height= Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int h = 400, w = 400;
        SpinnerModel spinnerModel = new SpinnerNumberModel(5, 0, 10, 1);
        JSpinner spinner = new JSpinner(spinnerModel);
        spinner.setBounds(100,100,50,30);
        frame.add(spinner);
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
                new SpinerPr();
            }
        });
    }
}
