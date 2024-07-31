import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JcoLor extends JFrame implements ActionListener{
    JLabel label;
    JButton button;

    JcoLor(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("This a text");
        button.addActionListener(this);


        label = new JLabel();
        label.setText("This si some Text");
        label.setBackground(Color.white);
        label.setFont(new Font("MV Boli",Font.PLAIN,100));
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null,"Pick a Color", Color.black);

            //label.setForeground(color);
            label.setBackground(color);
        }
    }
}