import javax.swing.*;

public class ImageDragOne extends JFrame{

    ImageDrag imageDrag = new ImageDrag();
    ImageDragOne(){
        this.add(imageDrag);
        this.setTitle("Drag & Drop demo");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
