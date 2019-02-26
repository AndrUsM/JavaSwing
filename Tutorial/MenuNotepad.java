import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MenuNotepad  implements ActionListener {
    JFrame frame;
    JMenuBar menuBar;
    JMenu file, edit, help;
    JMenuItem cut, copy,selectAll,paste;
    JTextArea textArea;
    public MenuNotepad(){
        JFrame frame = new JFrame("Notepad");
        int height= Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int h = 400, w = 400;
        frame.setBounds(width/2 - w/2, height/2 - h/2, w, h);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cut=new JMenuItem("cut");
        copy=new JMenuItem("copy");
        paste=new JMenuItem("paste");
        selectAll=new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
        menuBar = new JMenuBar();
        file = new JMenu("file");
        edit=new JMenu("Edit");
        help=new JMenu("Help");
        textArea = new JTextArea();
        edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);
        menuBar.add(file);menuBar.add(edit);menuBar.add(help);
        textArea.setBounds(5,5, 390,330);
        frame.add(menuBar);frame.add(textArea);frame.setJMenuBar(menuBar);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == cut){
            textArea.cut();
        }
        if(event.getSource() == paste){
            textArea.paste();
        }
        if(event.getSource() == copy){
            textArea.paste();
        }
        if(event.getSource() == selectAll){
            textArea.selectAll();
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuNotepad();
            }
        });
    }
}
