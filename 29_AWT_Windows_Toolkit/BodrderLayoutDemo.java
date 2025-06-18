import java.awt.*;

class FrameBorderLayout extends Frame
{
    Button b1,b2,b3,b4,b5,b6,b7;

    FrameBorderLayout()
    {
        super("Flow layout Demo");

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");
        b7 = new Button("Seven");

        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.EAST);
        //add(b3,BorderLayout.WEST);
        add(b4,BorderLayout.SOUTH);
        add(b5,BorderLayout.CENTER);

        Panel p = new Panel();
        p.setLayout(new GridLayout(3,1));
        p.add(new Button("Monday"));
        p.add(new Button("Tuesday"));
        p.add(new Button("Wednesday"));
        //add(b6);
        //add(b7);

        add(p,BorderLayout.WEST);
    }
}

public class BodrderLayoutDemo
{
    public static void main(String[] args) 
    {
        FrameBorderLayout f = new FrameBorderLayout();
        f.setSize(250,250);
        f.setVisible(true);
    }    
}

