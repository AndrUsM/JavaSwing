import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class ActionTables {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Tables");
        int height= Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int h = 200, w = 300;
        frame.setBounds(width/2 - w/2, height/2 - h/2, w, h);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        String column[] = {"ID","NAME","SALARY"};
        String data[][]={ {"101","Amit","670000"},
                {"102","Jai","780000"},
                {"101","Sachin","700000"}};
        final JTable table = new JTable(data,column);
        table.setCellSelectionEnabled(true);
        ListSelectionModel select = table.getSelectionModel();
        select.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                String Data = null;
                int[] row = table.getSelectedRows();
                int [] col = table.getSelectedColumns();
                for(int i = 0; i< row.length;i++){
                    for(int j = 0;j < col.length;j++){
                        Data = (String)table.getValueAt(row[i], col[j]);
                    }
                }
                System.out.println("Table element: " + Data);
            }
        });
        table.setBounds(0, 0,300,200);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);
        frame.add(table);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
