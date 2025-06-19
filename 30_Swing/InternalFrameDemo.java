import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MYInternalFrame extends JInternalFrame
{
    JTextArea ta;
    JScrollPane sp;
    static int count = 0;
    
    MYInternalFrame()
    {
        count++;
        super("Document "+(count),true,true,true,true);

        ta = new JTextArea();
        sp = new JScrollPane(ta);

        setLayout(new BorderLayout());
        add(sp,BorderLayout.CENTER);

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem ml = new JMenuItem("Save");

        file.add(ml);
        mb.add(file);
        setJMenuBar(mb);

        setSize(300,300);
        setLocation(50,50);
        setVisible(true);
    }
}

class JFrameInternal extends JFrame implements ActionListener
{
    JDesktopPane jp;

    JFrameInternal()
    {
        super("Internal Frame Demo");
        
        jp = new JDesktopPane();
        setContentPane(jp);

        JMenuBar mb = new JMenuBar();
        JMenu d = new JMenu("Document");
        JMenuItem m1 = new JMenuItem("New");

        d.add(m1);
        mb.add(d);
        setJMenuBar(mb);

        m1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MYInternalFrame mi = new MYInternalFrame();
        jp.add(mi);
    }
}

public class InternalFrameDemo 
{
    public static void main(String[] args) 
    {
        JFrameInternal f = new JFrameInternal();
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
