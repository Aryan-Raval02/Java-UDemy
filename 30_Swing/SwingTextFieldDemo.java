import javax.swing.*;
import javax.swing.text.NumberFormatter;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.text.SimpleDateFormat;
import java.util.Locale;

class JFrameTextField extends JFrame
{
    JFrameTextField()
    {
        JTextField tf1 = new JTextField(15);

        //DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");
        JFormattedTextField tf2 = new JFormattedTextField(df);
        tf2.setColumns(20);
        tf2.setValue(0);

        //NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.UK);
        NumberFormat nf = NumberFormat.getInstance();
        NumberFormatter nft = new NumberFormatter(nf);
        nft.setAllowsInvalid(false);
        nft.setMaximum(10000000);
        JFormattedTextField tf3 = new JFormattedTextField(nft);
        tf3.setColumns(15);
        tf3.setValue(0);

        setLayout(new FlowLayout());

        add(tf1);
        add(tf2);
        add(tf3);

    }
}

public class SwingTextFieldDemo 
{
    public static void main(String[] args) 
    {
        JFrameTextField f = new JFrameTextField();
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
