import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

public class MainJLabels {
    public static void main(String[] args){

        // JLabel = a GUI display area for a string of text, an image, or both
        ImageIcon image = new ImageIcon("C:\\Users\\awontu vannovich\\Downloads\\wallpapers\\trophycup.png");
        Border border = BorderFactory.createLineBorder(Color.green, 4);
        JLabel label = new JLabel();//Creates a label
        label.setText("Bro do you even Code?!");// Sets text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // Set text LEFT, CENTER, RIGHT of image
        label.setVerticalTextPosition(JLabel.TOP);// Set text TOP, BOTTOM, or , CENTER
        label.setForeground(new Color(233,150,170)); // sets font color
        label.setFont(new Font("MV Boil",Font.ITALIC,20));// Font of Text
        label.setIconTextGap(10);// Gap of text to image
        label.setBackground(Color.BLACK); // display background color
        label.setOpaque(true);// display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.BOTTOM); // Set vertical position label within position
        label.setHorizontalAlignment(JLabel.CENTER);// Set horizontal position text within label
        //label.setBounds(0,5,400,400); // Set x,y position within frame as well as dimensions



        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(190, 191, 45));
        frame.add(label);
        frame.setIconImage(image.getImage());
        frame.pack();

    }
}
