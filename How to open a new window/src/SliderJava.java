import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
public class SliderJava extends JFrame implements ChangeListener{
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderJava() {
        this.setTitle("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,10);

        slider.setPreferredSize(new Dimension(400,200));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli",Font.PLAIN,15));
        label.setFont(new Font("MV Boli",Font.PLAIN,25));

        slider.setOrientation(SwingConstants.VERTICAL);

        label.setText("Deg = "+ slider.getValue());
        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(label);
        this.add(panel);
        this.setSize(420,430);
        this.setVisible(true);

    }

    public void stateChanged(ChangeEvent e) {
        label.setText("Deg = "+ slider.getValue());
    }
}
