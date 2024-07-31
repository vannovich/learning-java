import java.awt.*;
import java.awt.Color.*;
import java.awt.event.*;
import javax.swing.*;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;

public  class KeyoPeration extends JFrame implements KeyListener {
    KeyoPeration(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);
        this.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}