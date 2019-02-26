import javax.swing.*;
import java.awt.*;

public class JSeparatorPract {
    public JSeparatorPract(){
        JFrame frame = new JFrame("Separator");
        int height= Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int h = 400, w = 400;
        frame.setBounds(width/2 - w/2, height/2 - h/2, w, h);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenu actions = new JMenu("Actions");
        JMenuItem item1, item2, item3,item4, item6;
        item1 = new JMenuItem("Item 1");
        item2  = new JMenuItem("Item 2");
        item3 = new JMenuItem("Item 3");
        item4 = new JMenuItem("Item 4");
        item6 = new JMenuItem("Item6");
        JMenu item5;
        item5 = new JMenu("item5");
        item5.add(item6);
        menu.add(item1);menu.addSeparator();menu.add(item2);actions.add(item5);
        menuBar.add(menu);menuBar.add(actions);
        frame.setJMenuBar(menuBar);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JSeparatorPract();
            }
        });
    }
}

