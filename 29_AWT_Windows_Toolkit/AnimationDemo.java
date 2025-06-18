import java.awt.*;
import java.awt.event.*;

class FrameAnimation extends Frame implements Runnable
{
    int x,y,tx,ty;

    FrameAnimation()
    {
        super("Animation Demo");
        x=100;
        y=100;
        tx=ty=1;

        Thread t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g)
    {
        g.fillOval(x, y, 50, 50);
    }

    @Override
    public void run() 
    {
        while(true)
        {
            x+=tx;
            y+=ty;

            if(x < 0 || x > 250)
            {
                tx = tx*-1;
            }
            if(y < 30 || y > 350)
            {
                ty = ty*-1;
            }
            repaint();

            try{Thread.sleep(5);}catch(InterruptedException e){}
        }

    }


}

public class AnimationDemo 
{
    public static void main(String[] args) 
    {
        FrameAnimation f = new FrameAnimation();
        f.setSize(300,400);
        f.setVisible(true);
    }    
}
