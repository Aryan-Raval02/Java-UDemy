import java.awt.*;
import java.awt.event.*;
import java.util.*;

class FrameKeyDemo extends Frame implements KeyListener
{

    Label l1,l2,l3,l4;
    FrameKeyDemo()
    {
        super("Key Event demo");

        l1 = new Label("");
        l2 = new Label("");
        l3 = new Label("");
        l4 = new Label("");

        setLayout(null);

        addKeyListener(this);

        l1.setBounds(30,50,100,20);
        l2.setBounds(30,80,100,20);
        l3.setBounds(30,110,100,20);
        l4.setBounds(30,140,100,20);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
    }
    @Override
    public void keyTyped(KeyEvent e) 
    {
        l1.setText("Key Typed");
        l2.setText("");
        l3.setText("");
        l4.setText("");
    }
    @Override
    public void keyPressed(KeyEvent e) 
    {
        l2.setText("Key Pressed");
        l1.setText("");
        l3.setText("");
        l4.setText("");
    }
    @Override
    public void keyReleased(KeyEvent e) 
    {
        l3.setText("Key Released");
        l4.setText(new Date(e.getWhen())+"");
        l1.setText("");
        l2.setText("");
    }
}

public class KeyEventDemo 
{
    public static void main(String[] args) 
    {
        FrameKeyDemo f = new FrameKeyDemo();
        f.setSize(300,300);
        f.setVisible(true);
    }    
}
