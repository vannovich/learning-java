import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class Jfilechooser extends JFrame implements ActionListener {
JButton button;
    Jfilechooser(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File");

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory( new File("C:\\Users\\awontu vannovich"));

            fileChooser.showOpenDialog(null);//Select file to open


        }
    }
}
