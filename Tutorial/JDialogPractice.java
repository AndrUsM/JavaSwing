import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogPractice {
    private static JDialog jDialog;
    public JDialogPractice(){
        JFrame frame = new JFrame("Scroll");
        int height= Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int h = 400, w = 400;
        jDialog = new JDialog(frame, "Dialog example", true);
        JButton button = new JButton("OK");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JDialogPractice.jDialog.setVisible(true);
            }
        });
        jDialog.add(new JLabel("Click button to continue"));
        jDialog.add(button);
        button.setBounds(width/2 - w/2, height/2 - h/2, w/3, h/3);
        jDialog.setBounds(width/2 - w/2, height/2 - h/2, w/2, h/2);
        frame.setBounds(width/2 - w/2, height/2 - h/2, w, h);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        jDialog.setVisible(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JDialogPractice();
            }
        });
    }
}
