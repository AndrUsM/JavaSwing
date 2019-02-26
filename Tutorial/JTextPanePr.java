import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class JTextPanePr {
    public static void main(String [] args) throws BadLocationException{
        JFrame frame = new JFrame("JTextPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = frame.getContentPane();
        JTextPane pane = new JTextPane();
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        StyleConstants.setBold(attributeSet,true);
        pane.setCharacterAttributes(attributeSet, true);
        pane.setText("Welcome");
        attributeSet = new SimpleAttributeSet();
        StyleConstants.setItalic(attributeSet, true);
        StyleConstants.setForeground(attributeSet, Color.red);
        StyleConstants.setBackground(attributeSet, Color.blue);
        Document document = pane.getStyledDocument();
        document.insertString(document.getLength(), "To Java ", attributeSet);
        attributeSet = new SimpleAttributeSet();
        document.insertString(document.getLength(), "World", attributeSet);
        JScrollPane splitPane = new JScrollPane(pane);
        cp.add(splitPane, BorderLayout.CENTER);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
