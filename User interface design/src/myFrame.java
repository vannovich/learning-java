import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.*;

public class myFrame extends JFrame{
    myFrame(){
        this.setTitle("JFrame Exercise");// Sets Title to our JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit out of application
        this.setResizable(false);//Prevents resize box
        ////this.setSize(420, 420); // Sets size
        this.setVisible(true); // makes this visible
        ImageIcon image = new ImageIcon("C:\\Users\\awontu vannovich\\Downloads\\wallpapers\\trophycup.png");
        this.setIconImage(image.getImage()); // Changes icon of frame
        //this.getContentPane().setBackground(Color.red); // To give a real color Name
        this.getContentPane().setBackground(new Color(23,123,98)); // To customise color
    }
}
