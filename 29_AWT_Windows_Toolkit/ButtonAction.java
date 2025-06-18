import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class MyFrameButtonAction extends Frame implements ActionListener
{
    int count = 0;
    Label l;
    Button b;

    MyFrameButtonAction()
    {
        super("Button Action Demo");
        l = new Label("      "+count);
        b = new Button("Click");

        b.addActionListener(this);

        setLayout(new FlowLayout());
        add(l);
        add(b);
     
        // Window closing handler
        addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e) 
            {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        count++;
        l.setText("      "+count);
    }
}

public class ButtonAction
{
    public static void main(String[] args) throws Exception
    {
        MyFrameButtonAction m = new MyFrameButtonAction();
        m.setSize(300,300);

        m.setVisible(true);
    }    
}
