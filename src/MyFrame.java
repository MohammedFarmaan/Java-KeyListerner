import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements KeyListener{

    JLabel label;
    ImageIcon image ;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);

        image = new ImageIcon(getClass().getResource("rocketSmall.png"));

        label = new JLabel(image);
        label.setBounds(0, 0, 320, 320);

        //label.setBackground(Color.red);
        //label.setOpaque(true);

        this.getContentPane().setBackground(Color.black);
        this.setTitle("Java KeyListener");
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // KeyType = Invoked when a key is typed. Uses KeyChar, char output
        switch (e.getKeyChar()) {
            case 'w':
                label.setLocation(label.getX(), label.getY()-10);
                break;
            case 'a':
                label.setLocation(label.getX()-10, label.getY());
                break;
            case 's':
                label.setLocation(label.getX(), label.getY()+10);
                break;
            case 'd':
                label.setLocation(label.getX()+10, label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // KeyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX()-10, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY()-10);
                break;
            case 39:
                label.setLocation(label.getX()+10, label.getY());
                break;
            case 40:
                label.setLocation(label.getX(), label.getY()+10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // KeyReleased = called whenever a key is released
//        System.out.println("You released key char: " + e.getKeyChar());
//        System.out.println("You Released key code: " + e.getKeyCode());
    }
}
