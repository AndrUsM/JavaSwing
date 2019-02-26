import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChoser extends JFrame implements ActionListener {
    JButton button;
    Container container;
    public ColorChoser(){
        container = getContentPane();
        container.setLayout(new FlowLayout());
        button = new JButton("Change color");
        button.addActionListener(this);
        container.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Color initcolor = Color.RED;
        Color color = JColorChooser.showDialog(this, "Select color", initcolor);
        container.setBackground(color);
    }

    public static void main(String[] args) {
        ColorChoser colorChoser = new ColorChoser();
        int height= Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int h = 400, w = 400;
        colorChoser.setBounds(width/2 - w/2, height/2 - h/2, w, h);
        colorChoser.setVisible(true);
        colorChoser.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
