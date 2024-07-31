import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class MouseOver extends JFrame implements MouseListener{
JLabel label;
    MouseOver(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);


        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button  has been clicked (Pressed and released) on a component
        //System.out.println("You clicked the mouse");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component
       // System.out.println("You released the mouse ");
        label.setBackground(Color.cyan);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when a mouse enters a component
        System.out.println("You entered the component");
        label.setBackground(Color.yellow);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You Exited");
        label.setBackground(Color.red);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a button has been pressed on a component
       // System.out.println("You pressed");
        label.setBackground(Color.blue);
    }
}
