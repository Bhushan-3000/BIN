import java.awt.*;
import java.awt.event.*;
// import java.applet.*;   
public class Slip11A extends Frame implements ActionListener 
{
    TextField t;
    Button badd, bsub, bmul, bdiv, bres, bdot;
    Button b[];
    Panel pt,p1, p2,p3;
    int n1 = 0, n2 = 0;
    int flag = 0;

    Slip11A() 
    {
        t=new TextField(20);
        badd=new Button("+");
        bsub=new Button("-");
        bdiv=new Button("/");
        bmul=new Button("*");
        bres=new Button("=");
        bdot=new Button(".");

        pt=new Panel();
        p1=new Panel();
        p2=new Panel();
        p3=new Panel();
        b=new Button[10];
        for(int i=0;i<10;i++)
        {
            b[i]=new Button(i+"");
            b[i].addActionListener(this);
            p2.add(b[i]);
        }
        pt.add(t);
        p3.add(badd);
        p3.add(bsub);
        p3.add(bmul);
        p3.add(bdiv);
        p3.add(bdot);
        p3.add(bres);
        p1.add(p2);
        p1.add(p3);
        
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bdot.addActionListener(this);
        bres.addActionListener(this);
        
        Font fnt =new Font("Arial", Font.BOLD, 30);
        setFont(fnt);

        setSize(500, 500);
        pt.setLayout(new GridLayout(1,1));
        p1.setLayout(new GridLayout(1,2));
        p2.setLayout(new GridLayout(4,3));
        p3.setLayout(new GridLayout(6,1));

        setVisible(true);
        setLayout(new BorderLayout());

        add(pt,BorderLayout.NORTH);
        add(p1,BorderLayout.CENTER);
        // add(p2,BorderLayout.CENTER);
        // add(p3,BorderLayout.EAST);
    }
    public void actionPerformed(ActionEvent e)
    {
        Button x=(Button)e.getSource();
        if (!(x==badd||x==bsub||x==bmul||x==bdiv||x==bres)) 
        {
            t.setText(t.getText()+x.getLabel());    
        }
        else if(x==badd)
        {
            n1=Integer.parseInt((t.getText()));
            t.setText("");
            flag=1;
        }
        else if(x==bsub)
        {
            n1=Integer.parseInt((t.getText()));
            t.setText("");
            flag=2;
        }
        else if(x==bmul)
        {
            n1=Integer.parseInt((t.getText()));
            t.setText("");
            flag=3;
        }
        else if(x==bdiv)
        {
            n1=Integer.parseInt((t.getText()));
            t.setText("");
            flag=4;
        }
        else if(x==bres)
        {
            if (flag==1) 
            {
                n2=Integer.parseInt(t.getText());
                t.setText(""+(n1+n2));
            }
            else if(flag==2)
            {
                n2=Integer.parseInt(t.getText());
                t.setText(""+(n1-n2));
            }
            else if(flag==3)
            {
                n2=Integer.parseInt(t.getText());
                t.setText(""+(n1*n2));
            }
            else if(flag==4)
            {
                n2=Integer.parseInt(t.getText());
                t.setText(""+(n1/n2));
            }
        }
    }

    public static void main(String arg[]) 
    {
        new Slip11A();
    }
}
