import java.awt.*;
import javax.swing.*;

public class Jprogressbar extends JFrame {
    JProgressBar bar = new JProgressBar(0,50);

    Jprogressbar() {
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli",Font.BOLD,25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);

        this.add(bar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.setVisible(true);

        fill();
    }

    public void fill() {
        int i = 100;

        while (i > 0){
            bar.setValue(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i -= 1 ;
        }
        bar.setString("Done !");

    }
}
