import javax.swing.*;

public class JEditorPanePR {
    JFrame frame = null;

    public static void main(String[] args) {
        new JEditorPanePR().test();
    }
    private void test(){
        frame = new JFrame("JEditorPane Test");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        JEditorPane pane = new JEditorPane();
        pane.setContentType("text/plain");
        pane.setText("Sleeping is necessary for a healthy body."
                + " But sleeping in unnecessary times may spoil our health, wealth and studies."
                + " Doctors advise that the sleeping at improper timings may lead for obesity during the students days.");
        frame.setContentPane(pane);
        frame.setVisible(true);
    }
}
