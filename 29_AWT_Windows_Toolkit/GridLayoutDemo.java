import java.awt.*;

class FrameGridLayout extends Frame
{
    Button b1,b2,b3,b4,b5,b6,b7;

    FrameGridLayout()
    {
        super("Flow layout Demo");

        //setLayout(new GridLayout(4,2));
        setLayout(new GridLayout(2,4));

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");
        b7 = new Button("Seven");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
    }
}

public class GridLayoutDemo 
{
    public static void main(String[] args) 
    {
        FrameGridLayout f = new FrameGridLayout();
        f.setSize(250,250);
        f.setVisible(true);
    }    
}
