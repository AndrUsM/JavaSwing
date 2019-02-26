import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopUp2 {
    public PopUp2(){
        JFrame frame = new JFrame("Massage");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        int height= Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int h = 400, w = 500;
        frame.setLayout(null);
        frame.setBounds(width/2 - w/2, height/2 - h/2, w, h);
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400, 100);
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem paste = new JMenuItem("Paste");
        JMenuItem copy = new JMenuItem("Copy");
        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add(copy);popupMenu.add(cut);popupMenu.add(paste);
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                popupMenu.show(frame, e.getX(),e.getY());
            }
        });
        cut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                label.setText("cut MenuItem clicked.");
            }
        });
        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                label.setText("copy MenuItem clicked.");
            }
        });
        paste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                label.setText("paste MenuItem clicked.");
            }
        });
        frame.add(label);frame.add(popupMenu);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PopUp2();
            }
        });
    }
}
