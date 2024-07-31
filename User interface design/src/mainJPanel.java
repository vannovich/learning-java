import javax.swing.JFrame;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class mainJPanel {
    public static void main(String[] args){
        // JPanel = a GUI component that functions as a container to hold other components
        ImageIcon icon = new ImageIcon();


        JLabel blueLabel = new JLabel();//Label for blue panel
        blueLabel.setText("I'M BLUE");
        //blueLabel.setSize(11,12);

        JLabel redLabel = new JLabel();//Label for red panel
        redLabel.setText("I'M RED");

        JLabel greenLabel = new JLabel();//Label for green panel
        greenLabel.setText("I'M GREEN");
        greenLabel.setVerticalAlignment(JLabel.TOP);
        greenLabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel yellowLabel = new JLabel();//Label for blue panel
        yellowLabel.setText("I'M YELLOW");

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,250,250);
        greenPanel.setLayout(new BorderLayout());

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setBounds(250,250,250,250);



        JFrame frame = new JFrame();// Creating new frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);

        // Working with redPanel
        frame.add(redPanel);
        redPanel.add(redLabel);

        //Working with bluePanel
        frame.add(bluePanel);
        bluePanel.add(blueLabel);

        //Working with greenPanel
        frame.add(greenPanel);
        greenPanel.add(greenLabel);

        //Working with yellowPanel
        frame.add(yellowPanel);
        yellowPanel.add(yellowLabel);
        //frame.pack();

    }
}

