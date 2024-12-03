import java.awt.*;
import java.awt.event.*;
public class Slip12A extends Frame implements ActionListener
{
    Label l1;
    TextField tf;
    List lst;
    Button b;
    Slip12A()
    {
        l1= new Label("Enter a number: ");
        tf=new TextField();
        lst=new List(10);
        b= new Button("Show Table of the given number");

        add(l1);add(tf);
        add(lst);add(b);

        b.addActionListener(this);

        setSize(400,800);
        setLayout(new FlowLayout());
        setVisible(true);
        Font fnt=new Font ("Arial",Font.BOLD,20);
        setFont(fnt);
    }
    public void actionPerformed(ActionEvent e)
    {
        int r=0;
        lst.removeAll();
        int n=Integer.parseInt(tf.getText());
        for (int i=1;i<=10;i++)
        {
            r=n*i;
            lst.add(n+"x"+i+"="+r);
        }
        tf.setText("");
    }
    public static void main(String arg[])
    {
        Slip12A ob =new Slip12A();
    }
}
