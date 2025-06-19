import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;

class JFrameMenuTool extends JFrame implements ActionListener
{
    JToolBar tb;
    JButton b1,b2,b3,b4,b5,b6,b7;
    JTextArea ta;

    JFrameMenuTool()
    {
        super("ToolBar Demo");

        tb = new JToolBar();

        b1 = new JButton(new ImageIcon("C:\\Users\\Aryan\\OneDrive\\Pictures\\Saved Pictures\\vivo.png")); 
        b2 = new JButton(new ImageIcon("C:\\Users\\Aryan\\OneDrive\\Pictures\\Saved Pictures\\vivo.png"));         
        b3 = new JButton(new ImageIcon("C:\\Users\\Aryan\\OneDrive\\Pictures\\Saved Pictures\\vivo.png"));  
        b4 = new JButton(new ImageIcon("C:\\Users\\Aryan\\OneDrive\\Pictures\\Saved Pictures\\vivo.png"));  
        b5 = new JButton(new ImageIcon("C:\\Users\\Aryan\\OneDrive\\Pictures\\Saved Pictures\\vivo.png"));  
        b6 = new JButton(new ImageIcon("C:\\Users\\Aryan\\OneDrive\\Pictures\\Saved Pictures\\lock.png"));  
        b7 = new JButton(new ImageIcon("C:\\Users\\Aryan\\OneDrive\\Pictures\\Saved Pictures\\vivo.png"));  

        tb.setBounds(0, 30,350,50);

        tb.add(b1);
        tb.add(b2);
        tb.add(b3);
        tb.add(new JToolBar.Separator());
        tb.add(b4);
        tb.add(b5);
        tb.add(b6);
        tb.add(b7);

        ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta);

        add(tb,BorderLayout.NORTH);
        add(sp,BorderLayout.CENTER);

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem m1 = new JMenuItem("Save");
        JMenuItem m2 = new JMenuItem("Open");

        m2.setMnemonic(KeyEvent.VK_O);

        file.add(m1);
        file.addSeparator();
        file.add(m2);
        mb.add(file);

        setJMenuBar(mb);

        b2.setActionCommand("Open");
        b2.addActionListener(this);

        //m2.setActionCommand("Open");
        m2.addActionListener(this);

        b1.addActionListener(this);
        m1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getActionCommand().equalsIgnoreCase("Open"))
        {
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(this);
            File f = fc.getSelectedFile();

            try
            {
            FileInputStream fi = new FileInputStream(f);
            byte b[] = new byte[fi.available()];

            fi.read(b);

            String str = new String(b);
            ta.setText(str);

            fi.close();
            }
            catch(Exception ex){}
        }
        else
        {
            Color col = JColorChooser.showDialog(this,"Font Color",Color.RED);
            ta.setForeground(col);
        }
    }
}

public class JMenubar_Toolbar 
{
    public static void main(String[] args) 
    {
        JFrameMenuTool f = new JFrameMenuTool();
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
