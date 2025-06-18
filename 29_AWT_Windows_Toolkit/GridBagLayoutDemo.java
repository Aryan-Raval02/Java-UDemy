import java.awt.*;

class FrameGridBagLayout extends Frame
{
    Button b1,b2,b3,b4,b5,b6,b7;

    FrameGridBagLayout()
    {
        super("Flow layout Demo");

        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        setLayout(gb);

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");
        b7 = new Button("Seven");

        gbc.gridx=1;
        gbc.gridy=1;
        add(b1);

        gbc.gridx=2;
        gbc.gridy=2;
        add(b2);

        gbc.gridx=3;
        gbc.gridy=3;
        add(b3);

        gbc.gridx=4;
        gbc.gridy=4;
        add(b4);

        gbc.gridx=5;
        gbc.gridy=5;
        add(b5);

        gbc.gridx=6;
        gbc.gridy=6;
        add(b6);

        gbc.gridx=7;
        gbc.gridy=7;
        add(b7);
    }
}

public class GridBagLayoutDemo 
{
    public static void main(String[] args) 
    {
        FrameGridBagLayout f = new FrameGridBagLayout();
        f.setSize(250,250);
        f.setVisible(true);
    }    
}
