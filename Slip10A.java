import java.awt.*;
import java.awt.event.*;
// import javax.swing.JFrame;
import javax.swing.*;

public class Slip10A extends JFrame implements ActionListener
{
    JLabel title,l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3;
    JPanel p,p1,p2,p3,p4,p5;
    Slip10A()
    {
        Container c= getContentPane();
        title=new JLabel("Compound Interest Calculator");   
        p1=new JPanel();
        p1.add(title);

        l1=new JLabel("Principal Amount");
        t1=new JTextField(15);
        p2=new JPanel();
        p2.add(l1);p2.add(t1);
        p2.setLayout(new GridLayout(1,2));

        l2=new JLabel("Interest Rate:");
        t2=new JTextField(5);
        l3=new JLabel("Time(Yrs)");
        t3=new JTextField(5);
        p3=new JPanel();
        p3.add(l2);p3.add(t2);
        p3.add(l3);p3.add(t3);
        p3.setLayout(new GridLayout(1,4));

        l4=new JLabel("Total Amount: ");
        t4=new JTextField(10);
        l5=new JLabel("Interest Amount");
        t5=new JTextField(10);
        p4=new JPanel();
        p4.add(l4);p4.add(t4);
        p4.add(l5);p4.add(t5);
        p4.setLayout(new GridLayout(2,2));

        b1=new JButton("Calculate");
        b2=new JButton("Clear");
        b3=new JButton("Close");
        p5=new JPanel();
        p5.add(b1);p5.add(b2);p5.add(b3);
        p5.setLayout(new GridLayout(1,3));

        c.setLayout(new GridLayout(5,1));
        c.add(p1);c.add(p2);c.add(p3);c.add(p4);c.add(p5);
        setVisible(true);
        setSize(500,300);
    }
    public void actionPerformed(ActionEvent e){}
    public static void main(String[] args) 
    {
        Slip10A ob=new Slip10A();    
    }   
}