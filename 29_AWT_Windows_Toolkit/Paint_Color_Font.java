import java.awt.*;
import java.awt.event.*;

import javax.swing.event.MouseInputAdapter;

class FramePCF extends Frame
{
    int x=0,y=25;
    FramePCF()
    {
        super("Painiting");

        addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent me)
            {
                x = me.getX();
                y = me.getY();
                repaint();
            }
        });
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.ORANGE);
        //g.fillOval(x, y, 50, 50);
        g.setFont(new Font("Luminari",Font.BOLD,30));
        g.drawString("Hello", x, y);
    }
}

public class Paint_Color_Font 
{
    public static void main(String[] args) 
    {
        FramePCF f = new FramePCF();
        f.setSize(300,300);
        f.setVisible(true);
    }
}
