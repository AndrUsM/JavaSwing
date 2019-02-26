import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JToogleButtonTr extends JFrame implements ItemListener {
    public static void main(String[] args) {
        new JToogleButtonTr();
    }
    private JToggleButton toggleButton;
    private JToogleButtonTr(){
        setTitle("JToggleButton with ItemListener Example");
        setLayout(new FlowLayout());
        setJToggleButton();
        setAction();
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void setJToggleButton() {
        toggleButton = new JToggleButton("ON");
        toggleButton.setSize(200,100);
        add(toggleButton);
    }
    private void setAction(){
        toggleButton.addItemListener(this);
    }
    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        if(toggleButton.isSelected()){
            toggleButton.setText("OFF");
        }
        else{
            toggleButton.setText("ON");
        }
    }
}
