import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.lang.Override;

//implements ActionListener if you want to use it instead
public class myButFrame extends JFrame implements ActionListener{
    JButton button;
    JLabel label;
    //Non-parameterized Constructor for the class
    myButFrame(){
        button = new JButton();
        button.setBounds(200,100,200,50);
        button.addActionListener(this);
        button.setText("I'M A BUTTON");
        button.setFocusable(false);
        button.setBackground(Color.cyan);
        button.setForeground(Color.lightGray);
        button.setBorder(BorderFactory.createBevelBorder(11));
        //button.setEnabled(false);

        label = new JLabel();
        label.setText("YOu clicked that button");
        label.setBounds(150, 250, 159, 150);
        label.setBackground(new Color(123,120,255,2));
        label.setVisible(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    // Event that occurs when button is clicked
   @Override
    public void actionPerformed(ActionEvent e){
        //TODO Auto-generated method
        if(e.getSource()==button){
//            System.out.println("I was clicked :)");
//            button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
