import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.*;

class JFrameSplitPane extends JFrame implements ListSelectionListener
{
    JSplitPane sp;
    JList l;
    JLabel lb;

    JFrameSplitPane()
    {
        super("Split Demo");
        String cols[] = {"RED","GREEN","BLUE","YELLOW","MAGENTA","ORANGE","BLACK"};

        l = new JList<>(cols);
        l.setSelectedIndex(0);
        l.addListSelectionListener(this);
        JScrollPane p1 = new JScrollPane(l);

        lb = new JLabel(" ");
        lb.setOpaque(true);
        lb.setBackground(Color.RED);
        JScrollPane p2 = new JScrollPane(lb);

        //sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
        JTabbedPane tp = new JTabbedPane();
        tp.addTab("Colors",p1);
        tp.addTab("Label", p2);
        add(tp);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) 
    {

        String s = (String)(l.getSelectedValue());

        switch(s)
        {
            case "RED":     lb.setBackground(Color.RED);break;
            case "GREEN":   lb.setBackground(Color.GREEN);break;
            case"BLUE":     lb.setBackground(Color.BLUE);break;
            case "YELLOW":  lb.setBackground(Color.YELLOW);break;
            case "MAGENTA": lb.setBackground(Color.MAGENTA);break;
            case "ORANGE":  lb.setBackground(Color.ORANGE);break;
            case "BLACK":   lb.setBackground(Color.BLACK);break;
        }
    }

}

public class SplitPaneDemo 
{   
    public static void main(String[] args) 
    {
        JFrameSplitPane f = new JFrameSplitPane();
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
