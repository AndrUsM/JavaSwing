import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaColorChoserText extends JFrame implements ActionListener {

    JFrame frame;JButton button;JTextArea textArea;
    public JavaColorChoserText(){
        frame = new JFrame("Color choser example");
        int height= Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int h = 400, w = 400;
        button = new JButton("Pad Color");
        textArea = new JTextArea();
        textArea.setBounds(10,10,300,200);
        textArea.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        button.setBounds(200,250,100,30);
        button.addActionListener(this);
        frame.setBounds(width/2 - w/2, height/2 - h/2, w, h);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(button);frame.add(textArea);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Color color = JColorChooser.showDialog(this, "Choose", Color.CYAN);
        textArea.setBackground(color);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JavaColorChoserText();
            }
        });
    }
}
