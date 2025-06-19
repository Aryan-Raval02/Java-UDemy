import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

class JFrameTree extends JFrame implements TreeSelectionListener
{
    JTree tree;
    JLabel l;

    JFrameTree()
    {
        super("Tree Component");

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("K:\\Java-Udemy");
        File f = new File("K:\\Java-Udemy");
        for(File x : f.listFiles())
        {
            if(x.isDirectory())
            {
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(x.getName());
                for(File y : x.listFiles())
                {   
                    temp.add(new DefaultMutableTreeNode(y.getName()));
                }
                root.add(temp);
            }
            else
            {
                root.add(new DefaultMutableTreeNode(x.getName()));
            }
        }

        tree = new JTree(root);
        JScrollPane s = new JScrollPane(tree);

        l = new JLabel("No Files Selected");

        add(s,BorderLayout.CENTER);
        add(l,BorderLayout.SOUTH);

        tree.addTreeSelectionListener(this);
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) 
    {
        l.setText(e.getPath().toString());
    }
}

public class JTreeDemo 
{
    public static void main(String[] args) 
    {
        JFrameTree f = new JFrameTree();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
