import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopUp {
    JFrame frame;
    PopUp(){
        frame = new JFrame("Massage");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        int height= Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int h = 300, w = 300;
        frame.setLayout(null);
        frame.setBounds(width/2 - w/2, height/2 - h/2, w, h);
        final JPopupMenu popupMenu = new JPopupMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        popupMenu.add(cut);popupMenu.add(copy);popupMenu.add(paste);
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                popupMenu.show(frame, e.getX(),e.getY());
            }
        });
        frame.add(popupMenu);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PopUp();
            }
        });
    }
}
