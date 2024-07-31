import javax.swing.*;
import java.awt.*;

public class Jlayeredpanel {
    public static void main(String[] args){
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50,50,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.BLUE);
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.GREEN);
        label3.setBounds(150,150,200,200);

        JLayeredPane layeredPanel = new JLayeredPane();
        layeredPanel.setBounds(0,0,500,500);
        layeredPanel.add(label1, Integer.valueOf(0));
        layeredPanel.add(label2, Integer.valueOf(2));
        layeredPanel.add(label3,Integer.valueOf(1));

        JFrame frame = new JFrame();
        frame.add(layeredPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
