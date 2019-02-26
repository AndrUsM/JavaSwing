import javax.swing.*;
import java.awt.*;
import java.util.Queue;

public class ButtonLabelPractice{
    public static void createAndShowGui(){
        JFrame frame = new JFrame("Example Grid");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setBounds(Toolkit.getDefaultToolkit().getScreenSize().height/2 - 250, Toolkit.getDefaultToolkit().getScreenSize().width/2 - 250, 500,500);
        //frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGui();
            }
        });
    }
}