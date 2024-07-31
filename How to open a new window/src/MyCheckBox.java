import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCheckBox extends JFrame implements ActionListener {
    JButton button;
    JCheckBox checkBox;
    MyCheckBox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Button");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Console", Font.PLAIN, 30));

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()== button){
            System.out.println(checkBox.isSelected());
        }

    }
    public static void main(String[] args){
    }

}