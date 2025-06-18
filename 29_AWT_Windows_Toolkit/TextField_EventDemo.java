import java.awt.*;
import java.awt.event.*;

class TextFieldFrame extends Frame implements TextListener, ActionListener
{
    Label l1,l2;
    TextField tf;

    TextFieldFrame()
    {
        super("Text Field Demo");

        l1 = new Label("No Text is ENtered Yet");
        l2 = new Label("Enter key is not yet hit");
        tf = new TextField(20);
        //tf.setEchoChar('*');

        tf.addTextListener(this);
        tf.addActionListener(this);

        setLayout(new FlowLayout());

        add(l1);
        add(tf);
        add(l2);

    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        l2.setText(tf.getText());
    }

    @Override
    public void textValueChanged(TextEvent e) 
    {
        l1.setText(tf.getText());    
    }
}

public class TextField_EventDemo 
{
    public static void main(String[] args) 
    {
        TextFieldFrame f = new TextFieldFrame();
        f.setSize(300,300);
        f.setVisible(true);
    }    
}
