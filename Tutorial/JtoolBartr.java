import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
public class JtoolBartr {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JToolbarExample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JToolBar toolBar = new JToolBar();
        toolBar.setRollover(true);
        JButton button = new JButton("File");
        toolBar.add(button);
        toolBar.addSeparator();
        toolBar.add(new JButton("Edit"));
        toolBar.add(new JComboBox(new String[]{ "Opt-1", "Opt-2", "Opt-3", "Opt-4" }));
        Container container = frame.getContentPane();
        container.add(toolBar, BorderLayout.NORTH);
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        container.add(scrollPane, BorderLayout.EAST);
        frame.setSize(420,250);
        frame.setVisible(true);
    }
}
