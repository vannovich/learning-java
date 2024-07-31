import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuJava extends JFrame implements ActionListener {
    JMenuItem loadItem;
    JMenuItem exitItem;
    JMenuItem saveItem;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;

    MenuJava(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu= new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("load");
        saveItem = new JMenuItem("save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

       // loadItem.addActionListener(keyDown().VK_L);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == loadItem){
            System.out.println(" YOU LOADED A FILE");
        }
        if(e.getSource() == saveItem){
            System.out.println(" YOU SAVED A FILE");
        }
        if(e.getSource() == exitItem){
            System.exit(0);
        }

    }

}
