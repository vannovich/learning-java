import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class JTextFieldTest extends JFrame implements ActionListener {
    private JTextField textfield ;
    private JPasswordField password ;
    public JTextFieldTest(){
        super("JTextField Test");
        setLayout(new FlowLayout());


        textfield = new JTextField(20);
        add(textfield);

        password = new JPasswordField("Hidden Text");
        add(password);

        textfield.addActionListener(this);
        password.addActionListener(this);
        setVisible(true);
        pack();

        public void actionPerformed(Act)
    }
    public static void main(String[] args){
        JTextFieldTest text = new JTextFieldTest();
    }
}
