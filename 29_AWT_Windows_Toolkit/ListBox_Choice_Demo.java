import java.awt.*;
import java.awt.event.*;

class FrameListBoxChoice extends Frame implements ItemListener, ActionListener
{
    List l;
    Choice c;
    TextArea ta;

    FrameListBoxChoice()
    {
        super("ListBox Demo");

        l = new List(4,true);
        c = new Choice();
        ta = new TextArea(20,30);

        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("Jan");
        c.add("Feb");
        c.add("Mar");
        c.add("Apr");
        c.add("Jun");
        c.add("Jul");

        l.addItemListener(this);
        c.addItemListener(this);

        setLayout(new FlowLayout());

        add(l);
        add(c);
        add(ta);
    }

    @Override
    public void itemStateChanged(ItemEvent e) 
    {
        if(e.getSource() == l)
        {
            ta.setText(l.getSelectedItem());
        }
        else
        {
            ta.setText(c.getSelectedItem());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String list[] = l.getSelectedItems();
        String txt = "";
        for(String x : list)
        {
            txt = x+"\n";
        }
        ta.setText(txt);
    }
}

public class ListBox_Choice_Demo 
{
    public static void main(String[] args) 
    {
        FrameListBoxChoice f = new FrameListBoxChoice();
        f.setSize(300,300);
        f.setVisible(true);
    }    
}
