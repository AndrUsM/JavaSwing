import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class ProgressBarPractice {
    int i, num = 0;
    JFrame frame;
    JProgressBar progressBar;
    public ProgressBarPractice(){
        frame = new JFrame("Scroll");
        int height= Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int h = 150, w = 250;
        frame.setBounds(width/2 - w/2, height/2 - h/2, w, h);
        progressBar = new JProgressBar(0,2000);
        progressBar.setBounds(40,40,160,30);
        progressBar.setValue(50);
        progressBar.setStringPainted(true);
        frame.add(progressBar);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public void iterate(){
        while(i <= 2000){//0...100
            progressBar.setValue(i);
            i+=20;
            try{
                Thread.sleep(150);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        ProgressBarPractice progressBarPractice = new ProgressBarPractice();
        progressBarPractice.progressBar.setVisible(true);
        progressBarPractice.iterate();
    }
}
