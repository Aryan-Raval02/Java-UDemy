import java.awt.*;
import java.awt.event.*;

class FrameMouseEvent extends Frame implements MouseListener, MouseMotionListener
{

    Label l,l2;

    FrameMouseEvent()
    {
        super("Mouse Event Demo");

        l = new Label("");
        l2 = new Label("");
        setLayout(null);

        l.setBounds(20,50,100,30);
        add(l);
        add(l2);

        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        l.setText("Mouse Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        l.setText("Mouse moved");
        l2.setText("("+e.getX()+" "+e.getY()+")");
    }
}

public class MouseEventDemo 
{
    public static void main(String[] args) 
    {   
        FrameMouseEvent f = new FrameMouseEvent();
        f.setSize(300,300);
        f.setVisible(true);
    }    
}
