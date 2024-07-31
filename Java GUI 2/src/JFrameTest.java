import javax.swing.*;
import java.awt.*;

public class JFrameTest extends JFrame{
    private JLabel label1;
    private JLabel label2;

    JFrameTest(){
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label1 = new JLabel();
        label2 = new JLabel();

        label1.setText("Text label");

        add(label1);
        setVisible(true);
    }
    public static void main(String[] args){
        JFrameTest test = new JFrameTest();
    }
}
