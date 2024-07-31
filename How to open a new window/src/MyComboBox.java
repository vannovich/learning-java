import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyComboBox extends JFrame implements ActionListener{
    JComboBox comboBox;
    MyComboBox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dogs", "cats","birds"};

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
        //comboBox.setEditable(true);
        comboBox.addItem("horse");
        comboBox.insertItemAt("pigs", 0);
        comboBox.setSelectedIndex(0);
        comboBox.removeItem("cat");
        comboBox.removeItemAt(0);

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==comboBox){
            //System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }

    }
}
