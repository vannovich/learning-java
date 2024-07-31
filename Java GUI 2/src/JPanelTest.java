import javax.swing.*;
import java.awt.*;

public class JPanelTest extends JFrame {
    JPanelTest(){
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,0,300,300);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(300,0,300,300);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setBounds(600,0,300,300);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setLayout(null);
        this.setVisible(true);
        this.add(greenPanel);
        this.add(redPanel);
        this.add(yellowPanel);
    }
    public static void main(String[] args){
        new JPanelTest();
    }
}
