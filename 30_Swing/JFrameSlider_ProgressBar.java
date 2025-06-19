import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;

class JFrameSliderProgressBar extends JFrame implements ChangeListener
{
    JSlider js;
    JPanel p1,p2;
    JProgressBar jp;

    int w = 50;

    JFrameSliderProgressBar()
    {
        super("Slider ProgressBar Demo");
        js = new JSlider(0,100,50);
        js.setMajorTickSpacing(10);
        js.setMinorTickSpacing(1);
        js.setPaintTicks(true);
        js.setPaintLabels(true);

        jp = new JProgressBar(0,100);
        jp.setString("50%");
        jp.setStringPainted(true);
        jp.setIndeterminate(false);

        p1 = new JPanel(){
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                int x = (getWidth() - 50)/ 2;
                int y = (getHeight() - 50) / 2;
                g.drawOval(y, x, w, w);
            }
        };

        p2 = new JPanel();
        p2.add(jp);

        js.addChangeListener(this);

        add(js,BorderLayout.NORTH);
        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);
    }

    @Override
    public void stateChanged(ChangeEvent e) 
    {
        w = js.getValue();
        p1.repaint();

        jp.setString(w+"%");
        jp.setValue(w);
    }
}

public class JFrameSlider_ProgressBar 
{
    public static void main(String[] args) 
    {
        JFrameSliderProgressBar f = new JFrameSliderProgressBar();
        f.setSize(800,800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
