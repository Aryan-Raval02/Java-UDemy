import java.awt.*;

class FrameFlowLayout extends Frame
{
    Button b1,b2,b3,b4,b5,b6,b7;

    FrameFlowLayout()
    {
        super("Flow layout Demo");

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");
        b7 = new Button("Seven");

        FlowLayout fl = new FlowLayout();
        fl.setHgap(25);
        fl.setVgap(25);
        fl.setAlignment(FlowLayout.RIGHT);

        setLayout(fl);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
    }
}

public class FlowLayoutDemo 
{
    public static void main(String[] args) 
    {
        FrameFlowLayout f = new FrameFlowLayout();
        f.setSize(250,250);
        f.setVisible(true);
    }    
}
