import java.awt.*;
import java.awt.event.*;

class FrameWindowsEvent extends Frame implements WindowListener
{
    Label l;

    FrameWindowsEvent()
    {
        super("Window Event Demo");
        l = new Label("                 ");

        setLayout(new FlowLayout());
        add(l);

        addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        l.setText("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        l.setText("Window Closing");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        l.setText("Window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        l.setText("Window Iconfied");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        l.setText("Window Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        l.setText("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        l.setText("Window Deactivated");
    }
}

public class WindowsEventDemo 
{
    public static void main(String[] args)
    {
        FrameWindowsEvent f = new FrameWindowsEvent();
        f.setSize(300,300);
        f.setVisible(true);
    }    
}
