import java.awt.*;
import java.awt.event.*;

class FrameTextArea extends Frame implements ActionListener
{
    TextArea ta;
    TextField tf;
    Label l;
    Button b;

    FrameTextArea()
    {
        super("TextArea Demo");

        l = new Label("No Text Enetered");
        ta = new TextArea(10,30);
        tf = new TextField(20);
        b = new Button("Click");

        setLayout(new FlowLayout());
        add(ta);
        add(l);
        add(tf);
        add(b);

        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //l.setText(ta.getSelectedText());
        //ta.append(tf.getText());
        ta.insert(tf.getText(), ta.getCaretPosition());

    }
}

public class TextAreaDemo 
{
    public static void main(String[] args) 
    {
        FrameTextArea f  = new FrameTextArea();
        f.setSize(300,300);
        f.setVisible(true);
    }    
}
