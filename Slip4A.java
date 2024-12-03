import java.awt.*;
// import java.applet.*;
import java.awt.event.*;
public class Slip4A extends Frame implements ActionListener
{
    Label l1,l2,l3;
    Button b1,b2,b3,b4;
    TextField t1,t2,t3;
    // public void init()
    Slip4A()
    {
        l1=new Label("Enter a number");
        l2=new Label("Enter the second number");
        l3=new Label("Result: ");
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        b1=new Button("Add");
        b2=new Button("Multiply");
        b3=new Button("Divide");
        b4=new Button("Subtract");

        add(l1);add(t1);
        add(l2);add(t2);
        add(l3);add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setSize(550,300);
        setVisible(true);
        setLayout(new FlowLayout());
    }
    public void actionPerformed(ActionEvent e)
    {
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int r;
        if (e.getSource()==b1) 
        {
            r=a+b;
            t3.setText(r+"");
        }
        else if (e.getSource()==b2) 
        {
            r=a*b;
            t3.setText(r+"");
        }
        else if (e.getSource()==b3) 
        {
            r=a/b;
            t3.setText(r+"");
        }
        else if (e.getSource()==b4) 
        {
            r=a-b;
            t3.setText(r+"");
        }
    }
    public static void main(String[] args) {
        Slip4A ob=new Slip4A();
    }
}

/*
 * <html>
 * <applet code=Slip4A height=500, width=500></applet>
 * </html>
 */
