import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class Slip27B extends Frame implements ActionListener{
    List l;
    Label l1;
    TextField t1;
    Button b;
    Slip27B()
    {
        l=new List();
        l1=new Label("Enter the directory name");
        t1=new TextField(20);
        b=new Button("Click to adisplay files in the directory");
        add(l1);
        add(t1);
        add(b);
        add(l);
        
        b.addActionListener(this);
        Font f=new Font("Arial", Font.BOLD, 20);
        setFont(f);
        setVisible(true);
        setSize(400,600);
        setLayout(new FlowLayout());
    }
    public void actionPerformed(ActionEvent e)
    {
        try {
            l.removeAll();//write l.clear()
            File ff=new File(t1.getText());
            if(ff.exists())
            {
                if(ff.isDirectory())
                {
                    String fnames[]=ff.list();
                    for(int i=0;i<fnames.length;i++)
                    {
                        l.add(fnames[i]);
                    }
                }
            }
        } catch (Exception ee) {}
    }
    public static void main(String[] args) {
        new Slip27B();
    }
}