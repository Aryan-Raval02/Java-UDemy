import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JFrameFirst extends JFrame implements ActionListener
{
    JLabel l;
    JButton b;
    int count = 0;

    JFrameFirst()
    {
        super("First Swing demo");

        setLayout(new FlowLayout());
        l = new JLabel("Clicked "+count+" Times");
        b = new JButton("Click");

        add(l);
        add(b);

        b.addActionListener(this);

        getRootPane().setDefaultButton(b);
        //b.setIcon(new ImageIcon("Image Path"));
        l.setToolTipText("Counter");
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        count++;
        l.setText("Clicked "+count+" Times");
    }
}

public class FirstSwing 
{
    public static void main(String[] args) 
    {
        JFrameFirst f = new JFrameFirst();
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
