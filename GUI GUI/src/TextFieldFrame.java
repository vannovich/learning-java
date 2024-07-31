import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


public class TextFieldFrame extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField;

    public TextFieldFrame() {
        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout());
        // construct textfield with 10 columns
        textField1 = new JTextField(10);
        add(textField1);
        // construct textfield with default text
        textField2 = new JTextField("Enter text here");
        add(textField2);
        // construct textfield with default text and 21 columns
        textField3 = new JTextField("Uneditable text field", 21);
        textField3.setEditable(false);
        add(textField3);
        // construct passwordfield with default text
        passwordField = new JPasswordField("Hidden text");
        add(passwordField);
        // register event handlers
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }// private inner class for event handling

    private class TextFieldHandler implements ActionListener {
        // process textfield events
        public void actionPerformed(ActionEvent event) {
            String string = ""; // declare string to display
            if (event.getSource() == textField1) {
                string = String.format("textField1: %s", event.getActionCommand());
            } else if (event.getSource() == textField2) {
                string = String.format("textField2: %s", event.getActionCommand());
            } else if (event.getSource() == textField3) {
                string = String.format("textField3: %s", event.getActionCommand());
            } else if (event.getSource() == passwordField) {
                string = String.format("passwordField: %s",
                        new String(passwordField.getPassword()));
            }
            JOptionPane.showMessageDialog(null, string);// display JTextField content
        } // end method actionPerformed
    } // end private inner class TextFieldHandler
}