import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.*;

public class ImageDrag extends JPanel{
    JLabel label;
    ImageIcon Icon = new ImageIcon("C:\\Users\\awontu vannovich\\Downloads\\wallpapers\\trophycup.png");
    final int WIDTH = Icon.getIconWidth();
    final int HEIGHT = Icon.getIconHeight();
    Point imageCorner;
    Point prevPt;
    ImageDrag(){
        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();

        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);

}

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        Icon.paintIcon(this, g,(int)imageCorner.getX(),(int)imageCorner.getY());
    }
    private class ClickListener extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            prevPt = e.getPoint();
        }
    }
    private class DragListener extends MouseMotionAdapter {
        @Override
        public void mouseDragged(MouseEvent e){
            Point currentPt =  e.getPoint();

            imageCorner.translate(
                    (int)(currentPt.getX() - prevPt.getX()),
                    (int)(currentPt.getY() - prevPt.getY())
            );
            prevPt = currentPt;
            repaint();
        }
    }
}
