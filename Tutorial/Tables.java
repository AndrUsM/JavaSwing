import javax.swing.*;
import java.awt.*;

public class Tables {
    JFrame frame;
    public Tables(){
        int height= Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int h = 200, w = 200;
        frame = new JFrame("Tables");
        frame.setBounds(width/2 - w/2, height/2 - h/2, w, h);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        String data[][]={ {"101","Amit","670000"},
                {"102","Jai","780000"},
                {"101","Sachin","700000"},{"101","Amit","670000"},
                {"102","Jai","780000"},
                {"101","Sachin","700000"}};
        String column[]={"ID","NAME","SALARY"};
        JTable table = new JTable(data, column);
        table.setBounds(0,0,200,300);
        frame.add(table);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tables();
            }
        });
    }
}
