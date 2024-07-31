import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JLabelTest extends JFrame {
    JLabelTest(){
        Border border = BorderFactory.createLineBorder(Color.green,3);

        ImageIcon image = new ImageIcon("C:\\Users\\awontu vannovich\\Downloads\\wallpapers\\trophycup.png");

        JLabel label = new JLabel("vans is a coder");
        label.setVerticalTextPosition(JLabel.TOP);
        label.setSize(200,200);
        label.setIcon(image);
        label.setFont(new Font("MV BOLI", Font.PLAIN, 20));
        label.setIconTextGap(100);
        label.setBackground(Color.CYAN);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,50,50);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.GRAY);
//        this.setLayout(null);
        this.add(label);
        this.setVisible(true);
        this.pack();
    }
    public static void main(String[] args){
       new JLabelTest();
    }
}
