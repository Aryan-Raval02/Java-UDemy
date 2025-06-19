import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

class JFrameBorder extends JFrame
{
    JLabel l;
    JTextField tf;
    JButton b;

    JPanel p;

    JFrameBorder()
    {
        l = new JLabel("Name ");
        tf = new JTextField(20);
        b = new JButton("OK");
        p = new JPanel();

        p.add(l);
        p.add(tf);
        p.add(b);

        //Border br = BorderFactory.createLoweredBevelBorder();
        //Border br = BorderFactory.createRaisedBevelBorder();
        //Border br = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
        //Border br = BorderFactory.createEtchedBorder();
        //Border br = BorderFactory.createLineBorder(Color.RED,2);
        //Border br = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED),"Log In");
        Border br = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE),"Log In",TitledBorder.CENTER,TitledBorder.DEFAULT_POSITION);
        p.setBorder(br);

        setLayout(new FlowLayout());
        add(p);
    }
}

public class SwingBorders 
{
    public static void main(String[] args) 
    {
        JFrameBorder f = new JFrameBorder();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
