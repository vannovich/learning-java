import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class myFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;

    myFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas",Font.PLAIN,35));
        textField.setForeground(new Color(746874));
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);
        textField.setText("username");



        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("Hello " + textField.getText());
            textField.setEditable(false);
            button.setEnabled(false);
        }
    }
}
