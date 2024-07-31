import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setSize(200,200);
        frame.setTitle("Vans Work");

        ImageIcon image = new ImageIcon("C:\\Users\\awontu vannovich\\Downloads\\wallpapers\\trophycup.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.CYAN);
        }
    }
