import java.awt.*;
import javax.swing.*;
public class Slip30A extends JFrame {
    JLabel title,l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2;
    JPanel p1,p2,p3,p4,p5;
    ButtonGroup G;
    JRadioButton r1,r2;
    JCheckBox c1,c2,c3;
    Slip30A()
    {
        title= new JLabel("Personal Information");
        p1= new JPanel();
        p1.add(title);
        p1.setLayout(new GridLayout(1,1));

        l1= new JLabel("First Name");
        t1= new JTextField(15);
        l2= new JLabel("Last Name");
        t2= new JTextField(15);
        l3= new JLabel("Address");
        t3= new JTextField(15);
        l4= new JLabel("Mobile No");
        t4= new JTextField(15);
        p2= new JPanel();
        p2.add(l1);p2.add(t1);
        p2.add(l2);p2.add(t2);
        p2.add(l3);p2.add(t3);
        p2.add(l4);p2.add(t4);
        p2.setLayout(new GridLayout(4,2));


        l5= new JLabel("Gender");
         G= new ButtonGroup();
        r1 = new JRadioButton("Male");
        r2= new JRadioButton("Female");
         G.add(r1);G.add(r2);
        p3= new JPanel();
        // p3.add(G);
        p3.add(r1);
        p3.add(r2);
        
        p3.setLayout(new GridLayout(1,4));

        l6= new JLabel("Your Interest");

        b1= new JButton("Submit");
        b2= new JButton("Reset");
        p5= new JPanel();
        p5.add(b1);p5.add(b2);
        p5.setLayout(new GridLayout(1,2));

        add(p1);add(p2);add(p3);add(p5);
        setLayout(new GridLayout(4,1));
        setVisible(true);
        setSize(500,500);
    }
    public static void main(String[] args) {
        new Slip30A();
    }
}
